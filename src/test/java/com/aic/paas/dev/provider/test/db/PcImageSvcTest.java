package com.aic.paas.dev.provider.test.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.aic.paas.dev.provider.bean.CPcImage;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.db.PcImageDao;
import com.aic.paas.dev.provider.svc.PcImageSvc;
import com.binary.framework.test.TestTemplate;

public class PcImageSvcTest extends TestTemplate {
	
	
	PcImageSvc svc;
	
	
	@Before
	public void init() {
		svc = getBean(PcImageSvc.class);
	}
	
	
	@Test
	public void uploadImage() {
		System.out.println("======================================================");
		PcBuildTask buildTask = new PcBuildTask();
		buildTask.setImageDefId(125l);
		buildTask.setTaskUserId(473l);
		buildTask.setTaskUserName("任锋");

		Map<String,String> uploadMap = new HashMap<String,String>();
		uploadMap.put("image_name","paas_task/paas_task-1.1");
		uploadMap.put("tag","9.9.9");
		uploadMap.put("export_file_url","http://example.com:8080/v1/image_name");
		
//		String result = svc.uploadImage(buildTask, uploadMap);
//		System.out.println("======result================================================"+result);
	}
	

}
