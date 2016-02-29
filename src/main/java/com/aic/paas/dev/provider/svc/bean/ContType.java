package com.aic.paas.dev.provider.svc.bean;

import com.binary.framework.exception.ServiceException;



/**
 * 版本库存放内容类型
 * @author wanwb
 */
public enum ContType {

	
	DOC(1),
	
	
	CODE(2);
	
	
	private int v;
	
	
	private ContType(int v) {
		this.v = v;
	}
	
	
	public int getValue() {
		return this.v;
	}
	
	
	
	
	public static ContType valueOf(int v) {
		switch(v) {
			case 1: return ContType.DOC;
			case 2: return ContType.CODE;
			default: throw new ServiceException(" is wrong ContType value '"+v+"'! ");
		}
	}
	
	
}
