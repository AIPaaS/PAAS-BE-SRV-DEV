package com.aic.paas.dev.provider.test.db;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.aic.paas.dev.provider.bean.CPcImage;
import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.db.PcImageDao;
import com.binary.framework.test.TestTemplate;

public class PcImageDaoTest extends TestTemplate {
	
	
	PcImageDao dao;
	
	
	@Before
	public void init() {
		dao = getBean(PcImageDao.class);
	}
	
	
	@Test
	public void selectListByFullName() {
		String fullName = "aaa";
		CPcImage cdt = new CPcImage();
		String orders = "ID";
		List<PcImage> ls = dao.selectListByFullName(fullName, cdt, orders);
		
		System.out.println("======================================================");
		printList(ls);
	}
	

}
