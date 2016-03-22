package com.aic.paas.dev.provider.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.dev.provider.bean.CPcProduct;
import com.aic.paas.dev.provider.bean.CPcProductMgr;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProductMgr;
import com.aic.paas.dev.provider.db.PcProductDao;
import com.aic.paas.dev.provider.db.PcProductMgrDao;
import com.aic.paas.dev.provider.svc.PcProductSvc;
import com.aic.paas.dev.provider.svc.bean.ProductInfo;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;

public class PcProductSvcImpl implements PcProductSvc {
	
	
	@Autowired
	PcProductDao productDao;
	
	@Autowired
	PcProductMgrDao productMgrDao;
	
	

	@Override
	public Page<PcProduct> queryPage(Integer pageNum, Integer pageSize, CPcProduct cdt, String orders) {
		return productDao.selectPage(pageNum, pageSize, cdt, orders);
	}
	

	@Override
	public List<PcProduct> queryList(CPcProduct cdt, String orders) {
		return productDao.selectList(cdt, orders);
	}

	
	@Override
	public PcProduct queryById(Long id) {
		return productDao.selectById(id);
	}

	
	
	private List<ProductInfo> fillOpInfo(List<PcProduct> ls) {
		List<ProductInfo> infos = new ArrayList<ProductInfo>();
		if(ls!=null && ls.size()>0) {
			Map<Long, ProductInfo> infomap = new HashMap<Long, ProductInfo>();
			Long[] pIds = new Long[ls.size()];
			
			for(int i=0; i<ls.size(); i++) {
				PcProduct p = ls.get(i);
				ProductInfo info = new ProductInfo();
				info.setProduct(p);
				infos.add(info);
				
				pIds[i] = p.getId();
				infomap.put(pIds[i], info);
			}
			
			
			CPcProductMgr cdt = new CPcProductMgr();
			cdt.setProductIds(pIds);
			List<PcProductMgr> pmgrs = productMgrDao.selectList(cdt, null);
			
			//key=opId, value=roleIds
			Map<Long, List<Long>> map = new HashMap<Long, List<Long>>();
			
			for(int i=0; i<pmgrs.size(); i++) {
				PcProductMgr pm = pmgrs.get(i);
				Long pId = pm.getProductId();
				Long mgrId = pm.getUserId();
				
				List<Long> os = map.get(pId);
				if(os == null) {
					os = new ArrayList<Long>();
					map.put(pId, os);
				}
				os.add(mgrId);
			}
			
			Iterator<Entry<Long, List<Long>>> itor = map.entrySet().iterator();
			while(itor.hasNext()) {
				Entry<Long, List<Long>> e = itor.next();
				Long pId = e.getKey();
				List<Long> mgrIds = e.getValue();
				
				ProductInfo info = infomap.get(pId);
				info.setMgrIds(mgrIds.toArray(new Long[0]));
			}
		}
		return infos;
	}
	
	
	@Override
	public Page<ProductInfo> queryInfoPage(Integer pageNum, Integer pageSize, CPcProduct cdt, String orders) {
		Page<PcProduct> page = queryPage(pageNum, pageSize, cdt, orders);
		List<PcProduct> ls = page.getData();
		List<ProductInfo> infols = fillOpInfo(ls);
		return new Page<ProductInfo>(page.getPageNum(), page.getPageSize(), page.getTotalRows(), page.getTotalPages(), infols);
	}

	@Override
	public List<ProductInfo> queryInfoList(CPcProduct cdt, String orders) {
		List<PcProduct> ls = queryList(cdt, orders);
		return fillOpInfo(ls);
	}

	@Override
	public ProductInfo queryInfoById(Long id) {
		PcProduct p = queryById(id);
		if(p != null) {
			List<PcProduct> ls = new ArrayList<PcProduct>();
			ls.add(p);
			return fillOpInfo(ls).get(0);
		}
		return null;
	}
	
	
	

	@Override
	public Page<PcProduct> queryMgrPage(Integer pageNum, Integer pageSize, Long mgrId, CPcProduct cdt, String orders) {
		BinaryUtils.checkEmpty(mgrId, "mgrId");
		return productDao.selectMgrPage(pageNum, pageSize, mgrId, cdt, orders);
	}

	@Override
	public List<PcProduct> queryMgrList(Long mgrId, CPcProduct cdt, String orders) {
		BinaryUtils.checkEmpty(mgrId, "mgrId");
		return productDao.selectMgrList(mgrId, cdt, orders);
	}
	
	
	

	@Override
	public Long saveOrUpdate(PcProduct record) {
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(record.getMntId(), "record.mntId");
		
		boolean isadd = record.getId() == null;
		if(isadd) {
			BinaryUtils.checkEmpty(record.getCompRoomId(), "record.compRoomId");
			BinaryUtils.checkEmpty(record.getCode(), "record.code");
			BinaryUtils.checkEmpty(record.getName(), "record.name");
			BinaryUtils.checkEmpty(record.getStatus(), "record.status");
			record.setRespDocStatus(1);	//1=未开通    2=待开通    3=已开通
		}else {
			if(record.getCompRoomId() != null) BinaryUtils.checkEmpty(record.getCompRoomId(), "record.compRoomId");
			if(record.getCode() != null) BinaryUtils.checkEmpty(record.getCode(), "record.code");
			if(record.getName() != null) BinaryUtils.checkEmpty(record.getName(), "record.name");
			if(record.getStatus() != null) BinaryUtils.checkEmpty(record.getStatus(), "record.status");
			record.setRespDocStatus(null);
		}
		
		record.setRespDocType(null);
		record.setRespDocUrl(null);
		record.setRespDocApplyId(null);
		
		Long id = record.getId();
		if(record.getCode() != null) {
			String code = record.getCode().trim();
			record.setCode(code);
			
			CPcProduct cdt = new CPcProduct();
			cdt.setMntId(record.getMntId());
			cdt.setCodeEqual(code);
			List<PcProduct> ls = productDao.selectList(cdt, null);
			if(ls.size()>0 && (id==null || ls.size()>1 || ls.get(0).getId().longValue()!=id.longValue())) {
				throw new ServiceException(" is exists code '"+code+"'! ");
			}
		}
		
		return productDao.save(record);
	}

	
	
	@Override
	public int removeById(Long id) {
		CPcProductMgr cdt = new CPcProductMgr();
		cdt.setProductId(id);
		productMgrDao.deleteByCdt(cdt);
		return productDao.deleteById(id);
	}
	
	
	
	

	@Override
	public void setProductMgrs(Long productId, Long[] mgrIds) {
		BinaryUtils.checkEmpty(productId, "productId");
		
		//删除产品对应管理员
		CPcProductMgr oprolecdt = new CPcProductMgr();
		oprolecdt.setProductId(productId);
		productMgrDao.deleteByCdt(oprolecdt);
		
		if(mgrIds!=null && mgrIds.length>0) {
			List<PcProductMgr> records = new ArrayList<PcProductMgr>();
			for(int i=0; i<mgrIds.length; i++) {
				PcProductMgr r = new PcProductMgr();
				r.setProductId(productId);
				r.setUserId(mgrIds[i]);
				records.add(r);
			}
			
			productMgrDao.insertBatch(records);
		}
	}

}
