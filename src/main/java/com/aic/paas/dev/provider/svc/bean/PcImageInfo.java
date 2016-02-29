package com.aic.paas.dev.provider.svc.bean;

import java.io.Serializable;

import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProject;

public class PcImageInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	
	/** 镜像对象 **/
	private PcImage image;
	
	
	/** 对应产品 **/
	private PcProduct product;
	
	
	/** 对应工程 **/
	private PcProject project;
	
	
	/** 镜像发布中个数 **/
	private Integer deployingCount;
	
	


	public PcImage getImage() {
		return image;
	}


	public void setImage(PcImage image) {
		this.image = image;
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


	public Integer getDeployingCount() {
		return deployingCount;
	}


	public void setDeployingCount(Integer deployingCount) {
		this.deployingCount = deployingCount;
	}

	
	
	
	
	
}
