package com.aic.paas.dev.provider.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.db.PcBuildDefDao;
import com.aic.paas.dev.provider.db.PcBuildTaskDao;
import com.aic.paas.dev.provider.svc.PcBuildTaskSvc;
import com.binary.core.util.BinaryUtils;


public class PcBuildTaskSvcImpl implements PcBuildTaskSvc{

	@Autowired
	PcBuildDefDao buildDefDao;
	
	@Autowired
	PcBuildTaskDao buildTaskDao;
	
	@Override
	public Long saveOrUpdateBuildTask(PcBuildTask record) {
		
		
		// TODO 请求参数
//		"namespace": "asiainfo",
//		"repo_name": "test",
//		“image_name”：“test”
//	    "opt": "start"   //start启动， stop 停止
//	    "tag": "latest"
//	    "callback_url":"http://xxxxxx/build" //启动时提供 ，停止不需要

		//namespace 用户账号名称（对应租户mnt_code）
		BinaryUtils.checkEmpty(record, "record");
//		PcBuildDef pbd =buildDefDao.selectById(record.getBuildDefId());
		
//		BinaryUtils.checkEmpty(pbd.getMntId().getMntId(), "record.mntId");
//		String namespace =
		
		// TODO 触发返回示例
//		record.setCreateTime(createTime);
//		record.setStatus(2);//1=就绪    2=构建运行中   3=构建中断中     4=成功   5=失败
//		
		
		// TODO 构建完成post callback返回示例
//	     "namespace": "asiainfo",
//	     "repo_name": "test",
//	     “tag”:'1.0'
//	     "build_id": "123",
//	     "time": "2015-09-02T08:17:42.581Z",  
//	     "status": "success",  // error  
//		record.setRunStartTime(runStartTime);
//		record.setTaskEndTime(taskEndTime);
//		record.setStatus(4);//1=就绪    2=构建运行中   3=构建中断中     4=成功   5=失败
		return buildTaskDao.save(record);
	}
	
	@Override
	public List<PcBuildTask> queryPcBuildTaskListForPage(Integer pageNum, Integer pageSize, CPcBuildTask cdt ,String orders) {
		List<PcBuildTask> buPcBuildTasks=buildTaskDao.selectList(pageNum, pageSize, cdt, orders);
		return buPcBuildTasks;
	}
	

}
