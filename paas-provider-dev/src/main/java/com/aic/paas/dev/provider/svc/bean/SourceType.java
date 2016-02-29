package com.aic.paas.dev.provider.svc.bean;

import com.binary.framework.exception.ServiceException;



/**
 * 来源类型
 * @author wanwb
 */
public enum SourceType {

	
	
	PRODUCT(1),
	
	
	PROJECT(2);
	
	
	private int v;
	
	
	private SourceType(int v) {
		this.v = v;
	}
	
	
	public int getValue() {
		return this.v;
	}
	
	
	
	
	
	public static SourceType valueOf(int v) {
		switch(v) {
			case 1: return SourceType.PRODUCT;
			case 2: return SourceType.PROJECT;
			default: throw new ServiceException(" is wrong SourceType value '"+v+"'! ");
		}
	}
	
	
	
}
