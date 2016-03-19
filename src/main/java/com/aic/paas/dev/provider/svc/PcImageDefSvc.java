package com.aic.paas.dev.provider.svc;

import java.util.List;
import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.PcImageDef;


public interface PcImageDefSvc {
	
	/**
	 * aic.tsd_hyh  2016.03.19
	 * 根据状态 CPcImageDef 去查 PC_IMAGE_DEF表
	 * @param CPcBuildTask
	 * @param orders
	 * @return
	 */
	public List<PcImageDef> selectTaskListByCdt(CPcImageDef cid,String orders);

	
	/**
	 * aic.tsd_hyh  2016.03.19
	 * 根据状态 mntId, imageFullName 去查 PC_IMAGE_DEF表
	 * @param mntId
	 * @param imageFullName
	 * @return PcImageDef
	 */
	public PcImageDef selectDefByFullName(Long mntId, String imageFullName);
}
