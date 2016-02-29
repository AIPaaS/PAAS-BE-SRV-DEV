package com.aic.paas.dev.provider.svc.bean;

import java.io.Serializable;

import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProject;

public class PcImageDefInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	
	/** 镜像定义对象 **/
	private PcImageDef def;
	
	
	/** 对应产品 **/
	private PcProduct product;
	
	
	/** 对应工程 **/
	private PcProject project;
	
	
	
	/** 最近构建的镜像 **/
	private PcImage lastImage;
	


	public PcImageDef getDef() {
		return def;
	}


	public void setDef(PcImageDef def) {
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


	public PcImage getLastImage() {
		return lastImage;
	}


	public void setLastImage(PcImage lastImage) {
		this.lastImage = lastImage;
	}
	
	
	
	
	
	
	
}
