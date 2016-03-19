package com.aic.paas.dev.provider.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.db.PcImageDefDao;
import com.aic.paas.dev.provider.svc.PcImageDefSvc;

public class PcImageDefSvcImpl implements PcImageDefSvc {
	
	
	@Autowired
	PcImageDefDao imageDefDao;
	

	@Override
	public List<PcImageDef> selectTaskListByCdt(CPcImageDef cid, String orders) {
		
		return imageDefDao.selectList(cid, orders);
	}


	
	
	
}
