package com.aic.paas.dev.provider.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.comm.util.SystemUtil;
import com.aic.paas.dev.provider.bean.CPcImage;
import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.CPcImageDeploy;
import com.aic.paas.dev.provider.bean.CPcProduct;
import com.aic.paas.dev.provider.bean.CPcProject;
import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.bean.PcImageDeploy;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProject;
import com.aic.paas.dev.provider.db.PcImageDao;
import com.aic.paas.dev.provider.db.PcImageDefDao;
import com.aic.paas.dev.provider.db.PcImageDeployDao;
import com.aic.paas.dev.provider.db.PcProductDao;
import com.aic.paas.dev.provider.db.PcProjectDao;
import com.aic.paas.dev.provider.svc.PcImageSvc;
import com.aic.paas.dev.provider.svc.bean.ImageStatus;
import com.aic.paas.dev.provider.svc.bean.PcImageDefInfo;
import com.aic.paas.dev.provider.svc.bean.PcImageInfo;
import com.binary.core.http.HttpUtils;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;

public class PcImageSvcImpl implements PcImageSvc {
	
	
	@Autowired
	PcImageDefDao imageDefDao;
	
	@Autowired
	PcImageDao imageDao;
	
	
	
	@Autowired
	PcProductDao productDao;
	
	
	@Autowired
	PcProjectDao projectDao;
	
	@Autowired
	PcImageDeployDao imageDeployDao;
	
	

	@Override
	public Page<PcImageDef> queryDefPage(Integer pageNum, Integer pageSize, CPcImageDef cdt, String orders) {
		return imageDefDao.selectPage(pageNum, pageSize, cdt, orders);
	}

	
	@Override
	public List<PcImageDef> queryDefList(CPcImageDef cdt, String orders) {
		return imageDefDao.selectList(cdt, orders);
	}
	
	

	@Override
	public PcImageDef queryDefById(Long id) {
		return imageDefDao.selectById(id);
	}
	
	
	
	private List<PcImageDefInfo> fillDefInfo(List<PcImageDef> ls) {
		List<PcImageDefInfo> infos = new ArrayList<PcImageDefInfo>();
		if(ls!=null && ls.size()>0) {
			Long[] defIds = new Long[ls.size()];
			Set<Long> productIds = new HashSet<Long>();
			Set<Long> projectIds = new HashSet<Long>();
			
			//key=defIds
			Map<Long, PcImageDefInfo> infomap = new HashMap<Long, PcImageDefInfo>();
			
			for(int i=0; i<ls.size(); i++) {
				PcImageDef def = ls.get(i);
				PcImageDefInfo info = new PcImageDefInfo();
				info.setDef(def);
				infos.add(info);
				defIds[i] = def.getId();
				infomap.put(defIds[i], info);
				
				Long productId = def.getProductId();
				Long projectId = def.getProjectId();
				
				if(productId != null) productIds.add(productId);
				if(projectId != null) projectIds.add(projectId);
			}
			
			if(productIds.size() > 0) {
				CPcProduct cdt = new CPcProduct();
				cdt.setIds(productIds.toArray(new Long[0]));
				List<PcProduct> pls = productDao.selectList(cdt, null);
				if(pls.size() > 0) {
					Map<Long, PcProduct> map = BinaryUtils.toObjectMap(pls, "ID");
					for(int i=0; i<infos.size(); i++) {
						PcImageDefInfo info = infos.get(i);
						Long productId = info.getDef().getProductId();
						if(productId != null) {
							info.setProduct(map.get(productId));
						}
					}
				}
			}
			
			if(projectIds.size() > 0) {
				CPcProject cdt = new CPcProject();
				cdt.setIds(projectIds.toArray(new Long[0]));
				List<PcProject> pls = projectDao.selectList(cdt, null);
				if(pls.size() > 0) {
					Map<Long, PcProject> map = BinaryUtils.toObjectMap(pls, "ID");
					for(int i=0; i<infos.size(); i++) {
						PcImageDefInfo info = infos.get(i);
						Long projectId = info.getDef().getProjectId();
						if(projectId != null) {
							info.setProject(map.get(projectId));
						}
					}
				}
			}
			
			List<PcImage> imagels = imageDao.selectLastList(defIds);
			for(int i=0; i<imagels.size(); i++) {
				PcImage img = imagels.get(i);
				infomap.get(img.getDefId()).setLastImage(img);
			}
		}
		
		return infos;		
	}
	
	
	
	
	
	@Override
	public Page<PcImageDefInfo> queryDefInfoPage(Integer pageNum, Integer pageSize, CPcImageDef cdt, String orders) {
		Page<PcImageDef> page = queryDefPage(pageNum, pageSize, cdt, orders);
		List<PcImageDef> ls = page.getData();
		List<PcImageDefInfo> infols = fillDefInfo(ls);
		return new Page<PcImageDefInfo>(page.getPageNum(), page.getPageSize(), page.getTotalRows(), page.getTotalPages(), infols);
	}


	@Override
	public List<PcImageDefInfo> queryDefInfoList(CPcImageDef cdt, String orders) {
		List<PcImageDef> ls = queryDefList(cdt, orders);
		return fillDefInfo(ls);
	}


	@Override
	public PcImageDefInfo queryDefInfoById(Long id) {
		PcImageDef def = queryDefById(id);
		if(def == null) return null;
		
		List<PcImageDef> ls = new ArrayList<PcImageDef>();
		ls.add(def);
		return fillDefInfo(ls).get(0);
	}

	
	
	
	
	

	@Override
	public Long saveOrUpdateDef(PcImageDef record) {
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(record.getMntId(), "record.mntId");
		
		boolean isadd = record.getId() == null;
		if(isadd) {
			BinaryUtils.checkEmpty(record.getDirName(), "record.dirName");
			BinaryUtils.checkEmpty(record.getImageName(), "record.imageName");
			BinaryUtils.checkEmpty(record.getVersionNo(), "record.versionNo");
			BinaryUtils.checkEmpty(record.getIsExternal(), "record.isExternal");
			if(record.getIsExternal().intValue() == 0) {
				BinaryUtils.checkEmpty(record.getProductId(), "record.productId");
				BinaryUtils.checkEmpty(record.getProjectId(), "record.projectId");
			}
		}else {
			if(record.getDirName() != null) BinaryUtils.checkEmpty(record.getDirName(), "record.dirName");
			if(record.getImageName() != null) BinaryUtils.checkEmpty(record.getImageName(), "record.imageName");
			if(record.getVersionNo() != null) BinaryUtils.checkEmpty(record.getVersionNo(), "record.versionNo");
			if(record.getIsExternal() != null) BinaryUtils.checkEmpty(record.getIsExternal(), "record.isExternal");
			if(record.getProductId() != null) BinaryUtils.checkEmpty(record.getProductId(), "record.productId");
			if(record.getProjectId() != null) BinaryUtils.checkEmpty(record.getProjectId(), "record.projectId");
		}
		
		if(record.getVersionNo() != null) {
			if(!record.getVersionNo().matches("[a-zA-Z0-9\\.]+")) {
				throw new ServiceException(" is wrong version-no '"+record.getVersionNo()+"'! ");
			}
		}
		
		record.setImageFullName(null);
		Long id = record.getId();
		
		if(!BinaryUtils.isEmpty(record.getDirName()) || !BinaryUtils.isEmpty(record.getImageName())) {
			String dirName = record.getDirName();
			String imageName = record.getImageName();
			String versionNo = record.getVersionNo();
			if(dirName==null || imageName==null) {
				PcImageDef old = imageDefDao.selectById(id);
				if(old==null) throw new ServiceException(" not found image-def by id '"+id+"'! ");
				if(dirName == null) dirName = old.getDirName();
				if(imageName == null) imageName = old.getImageName();
				if(versionNo == null) versionNo = old.getVersionNo();
			}
			dirName = HttpUtils.formatContextPath(dirName.trim());
			imageName = imageName.trim();
			versionNo = versionNo.trim();
			
			String fullName = dirName + "/" + imageName + "-" + versionNo;
			record.setDirName(dirName);
			record.setImageName(imageName);
			record.setVersionNo(versionNo);
			record.setImageFullName(fullName);
		}
		
		if(record.getImageFullName() != null) {
			String fullName = record.getImageFullName();
			
			PcImageDef def = imageDefDao.selectDefByFullName(record.getMntId(), fullName);
			if(def!=null && (id==null || def.getId().longValue()!=id.longValue())) {
				throw new ServiceException(" is exists imageName '"+fullName+"'! ");
			}
		}
				
		return imageDefDao.save(record);
	}
	
	
	
	
	

	@Override
	public int removeDefById(Long id) {
		CPcImage cdt = new CPcImage();
		cdt.setDefId(id);
		imageDao.deleteByCdt(cdt);
		return imageDefDao.deleteById(id);
	}
	
	

	
	@Override
	public Page<PcImage> queryImagePage(Integer pageNum, Integer pageSize, CPcImage cdt, String orders) {
		return imageDao.selectPage(pageNum, pageSize, cdt, orders);
	}
	
	

	@Override
	public List<PcImage> queryImageList(CPcImage cdt, String orders) {
		return imageDao.selectList(cdt, orders);
	}
	
	
	@Override
	public List<PcImage> queryImageListByFullName(String fullName, CPcImage cdt, String orders) {
		return imageDao.selectListByFullName(fullName, cdt, orders);
	}
	

	@Override
	public PcImage queryImageById(Long id) {
		return imageDao.selectById(id);
	}
	
	
	
	

	private List<PcImageInfo> fillImageInfo(List<PcImage> ls) {
		List<PcImageInfo> infos = new ArrayList<PcImageInfo>();
		if(ls!=null && ls.size()>0) {
			Long[] ids = new Long[ls.size()];
			Set<Long> productIds = new HashSet<Long>();
			Set<Long> projectIds = new HashSet<Long>();
			
			//key=id
			Map<Long, PcImageInfo> infomap = new HashMap<Long, PcImageInfo>();
			
			for(int i=0; i<ls.size(); i++) {
				PcImage img = ls.get(i);
				PcImageInfo info = new PcImageInfo();
				info.setImage(img);
				infos.add(info);
				ids[i] = img.getId();
				infomap.put(ids[i], info);
				
				Long productId = img.getProductId();
				Long projectId = img.getProjectId();
				
				if(productId != null) productIds.add(productId);
				if(projectId != null) projectIds.add(projectId);
			}
			
			if(productIds.size() > 0) {
				CPcProduct cdt = new CPcProduct();
				cdt.setIds(productIds.toArray(new Long[0]));
				List<PcProduct> pls = productDao.selectList(cdt, null);
				if(pls.size() > 0) {
					Map<Long, PcProduct> map = BinaryUtils.toObjectMap(pls, "ID");
					for(int i=0; i<infos.size(); i++) {
						PcImageInfo info = infos.get(i);
						Long productId = info.getImage().getProductId();
						if(productId != null) {
							info.setProduct(map.get(productId));
						}
					}
				}
			}
			
			if(projectIds.size() > 0) {
				CPcProject cdt = new CPcProject();
				cdt.setIds(projectIds.toArray(new Long[0]));
				List<PcProject> pls = projectDao.selectList(cdt, null);
				if(pls.size() > 0) {
					Map<Long, PcProject> map = BinaryUtils.toObjectMap(pls, "ID");
					for(int i=0; i<infos.size(); i++) {
						PcImageInfo info = infos.get(i);
						Long projectId = info.getImage().getProjectId();
						if(projectId != null) {
							info.setProject(map.get(projectId));
						}
					}
				}
			}
			
			CPcImageDeploy depcdt = new CPcImageDeploy();
			depcdt.setImageIds(ids);
			depcdt.setDepStatuss(new Integer[]{1,2});	//1=就绪  2=发布中  3=成功  4=失败
			List<PcImageDeploy> depls = imageDeployDao.selectList(depcdt, " ID ");
			if(depls.size() > 0) {
				Map<Long, List<PcImageDeploy>> depmap = BinaryUtils.toObjectGroupMap(depls, "imageId");
				for(int i=0; i<infos.size(); i++) {
					PcImageInfo info = infos.get(i);
					Long imageId = info.getImage().getId();
					List<PcImageDeploy> depingls = depmap.get(imageId);
					int count = 0;
					if(depingls != null) count = depingls.size();
					info.setDeployingCount(count);
				}
			}
		}
		
		return infos;		
	}
	
	
	

	@Override
	public Page<PcImageInfo> queryImageInfoPage(Integer pageNum, Integer pageSize, CPcImage cdt, String orders) {
		Page<PcImage> page = queryImagePage(pageNum, pageSize, cdt, orders);
		List<PcImage> ls = page.getData();
		List<PcImageInfo> infols = fillImageInfo(ls);
		return new Page<PcImageInfo>(page.getPageNum(), page.getPageSize(), page.getTotalRows(), page.getTotalPages(), infols);
	}


	@Override
	public List<PcImageInfo> queryImageInfoList(CPcImage cdt, String orders) {
		List<PcImage> ls = queryImageList(cdt, orders);
		return fillImageInfo(ls);
	}


	@Override
	public PcImageInfo queryImageInfoById(Long id) {
		PcImage img = queryImageById(id);
		if(img == null) return null;
		
		List<PcImage> ls = new ArrayList<PcImage>();
		ls.add(img);
		return fillImageInfo(ls).get(0);
	}

	
	
	
	

	@Override
	public Long saveOrUpdateImage(PcImage record) {
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(record.getMntId(), "record.mntId");
		
		boolean isadd = record.getId() == null;
		if(isadd) {
			BinaryUtils.checkEmpty(record.getDefId(), "record.defId");
			BinaryUtils.checkEmpty(record.getDirName(), "record.dirName");
			BinaryUtils.checkEmpty(record.getImageName(), "record.imageName");
			BinaryUtils.checkEmpty(record.getIsExternal(), "record.isExternal");
			if(record.getIsExternal().intValue() == 0) {
				BinaryUtils.checkEmpty(record.getProductId(), "record.productId");
				BinaryUtils.checkEmpty(record.getProjectId(), "record.projectId");
			}
			BinaryUtils.checkEmpty(record.getBuildNo(), "record.buildNo");
			BinaryUtils.checkEmpty(record.getBuildUser(), "record.buildUser");
			BinaryUtils.checkEmpty(record.getBuildTime(), "record.buildTime");
			record.setStatus(1);
		}else {
			if(record.getDefId() != null) BinaryUtils.checkEmpty(record.getDefId(), "record.defId");
			if(record.getDirName() != null) BinaryUtils.checkEmpty(record.getDirName(), "record.dirName");
			if(record.getImageName() != null) BinaryUtils.checkEmpty(record.getImageName(), "record.imageName");
			if(record.getIsExternal() != null) BinaryUtils.checkEmpty(record.getIsExternal(), "record.isExternal");
			if(record.getProductId() != null) BinaryUtils.checkEmpty(record.getProductId(), "record.productId");
			if(record.getProjectId() != null) BinaryUtils.checkEmpty(record.getProjectId(), "record.projectId");
			if(record.getBuildNo() != null) BinaryUtils.checkEmpty(record.getBuildNo(), "record.buildNo");
			if(record.getBuildUser() != null) BinaryUtils.checkEmpty(record.getBuildUser(), "record.buildUser");
			if(record.getBuildTime() != null) BinaryUtils.checkEmpty(record.getBuildTime(), "record.buildTime");
			if(record.getStatus() != null) BinaryUtils.checkEmpty(record.getStatus(), "record.status");
			record.setStatus(null);
		}
		
		return imageDao.save(record);
	}
	
	
	
	

	@Override
	public int removeImageById(Long id) {
		return imageDao.deleteById(id);
	}


	@Override
	public Long deployImage(Long id, ImageStatus beforeStatus, ImageStatus afterStatus, Long dataCenterId, Long resCenterId, String remark) {
		BinaryUtils.checkEmpty(id, "id");
		BinaryUtils.checkEmpty(beforeStatus, "beforeStatus");
		BinaryUtils.checkEmpty(afterStatus, "afterStatus");
		BinaryUtils.checkEmpty(dataCenterId, "dataCenterId");
		BinaryUtils.checkEmpty(resCenterId, "resCenterId");
		
		if(beforeStatus == afterStatus) {
			throw new ServiceException(" before-status '"+beforeStatus+"' and after-status '"+afterStatus+"' in the same! ");
		}
		PcImage image = imageDao.selectById(id);
		if(image == null) {
			throw new ServiceException(" not found image by id '"+id+"'! ");
		}
		if(ImageStatus.valueOf(image.getStatus()) != beforeStatus) {
			throw new ServiceException(" deploy failure, the current image status is not '"+beforeStatus+"'! ");
		}
		
		//判断目标状态下资源环境下境像是否已存在
		CPcImage cdt = new CPcImage();
		cdt.setDataCenterId(dataCenterId);
		cdt.setResCenterId(resCenterId);
		cdt.setStatus(afterStatus.getValue());
		List<PcImage> ls = imageDao.selectListByFullName(image.getImageFullName(), cdt, null);
		if(ls.size() > 0) {
			throw new ServiceException(" The target environment existing current image '"+image.getImageFullName()+"'! ");
		}
		
		//判断目标状态下资源环境下境像是否正在发布
		CPcImageDeploy depcdt = new CPcImageDeploy();
		depcdt.setImageId(image.getId());
		depcdt.setDepStatuss(new Integer[]{1,2});	//1=就绪  2=发布中  3=成功  4=失败
		depcdt.setDataCenterId(dataCenterId);
		depcdt.setResCenterId(resCenterId);
		long count = imageDeployDao.selectCount(depcdt);
		if(count > 0) {
			throw new ServiceException(" The target environment is deploying the current image '"+image.getImageFullName()+"'! ");
		}
		
		PcImageDeploy deploy = new PcImageDeploy();
		deploy.setImageId(id);
		deploy.setImageBefStatus(beforeStatus.getValue());
		deploy.setImageAftStatus(afterStatus.getValue());
		deploy.setDataCenterId(dataCenterId);
		deploy.setResCenterId(resCenterId);
		deploy.setBuildNo(image.getBuildNo());
		deploy.setBuildTime(image.getBuildTime());
		deploy.setDepStartTime(BinaryUtils.getNumberDateTime());
		deploy.setDepEndTime(BinaryUtils.getNumberDateTime());
		deploy.setDepStatus(2);			//1=就绪 2=发布中 3=成功 4=失败
		deploy.setDepor(SystemUtil.getLoginUser().getUserName());
		deploy.setRemark(remark);
		return imageDeployDao.insert(deploy);		
	}


	@Override
	public Page<PcImageDeploy> queryDeployPage(Integer pageNum, Integer pageSize, CPcImageDeploy cdt, String orders) {
		return imageDeployDao.selectPage(pageNum, pageSize, cdt, orders);
	}


	@Override
	public List<PcImageDeploy> queryDeployList(CPcImageDeploy cdt, String orders) {
		return imageDeployDao.selectList(cdt, orders);
	}


	@Override
	public PcImageDeploy queryDeployById(Long id) {
		return imageDeployDao.selectById(id);
	}


	

	
	
}
