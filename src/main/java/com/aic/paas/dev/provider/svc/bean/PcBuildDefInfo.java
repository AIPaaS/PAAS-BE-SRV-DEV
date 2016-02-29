package com.aic.paas.dev.provider.svc.bean;

import java.io.Serializable;

import com.aic.paas.dev.provider.bean.PcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProject;

public class PcBuildDefInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	


	/** 构建定义对象 **/
	private PcBuildDef def;
	
	
	/** 对应产品 **/
	private PcProduct product;
	
	
	/** 对应工程 **/
	private PcProject project;
	
	
	/** 镜像定义 **/
	private PcImageDef imageDef;
	
	
	/** 最近构建任务 **/
	private PcBuildTask lastBuildTask;
	

	

	public PcBuildDef getDef() {
		return def;
	}


	public void setDef(PcBuildDef def) {
		this.def = def;
	}


	public PcProduct getProduct() {
		return product;
	}


	public void setProduct(PcProduct product) {
		this.product = product;
	}


	public PcProject getProject() {
		return project;
	}


	public void setProject(PcProject project) {
		this.project = project;
	}


	public PcImageDef getImageDef() {
		return imageDef;
	}


	public void setImageDef(PcImageDef imageDef) {
		this.imageDef = imageDef;
	}


	public PcBuildTask getLastBuildTask() {
		return lastBuildTask;
	}


	public void setLastBuildTask(PcBuildTask lastBuildTask) {
		this.lastBuildTask = lastBuildTask;
	}
	
	
	
	
	

}
