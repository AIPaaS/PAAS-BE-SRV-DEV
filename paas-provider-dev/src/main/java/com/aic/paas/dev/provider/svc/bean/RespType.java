package com.aic.paas.dev.provider.svc.bean;

import com.binary.framework.exception.ServiceException;



/**
 * 版本库类型
 * @author wanwb
 */
public enum RespType {

	
	SVN(1),
	
	
	GIT(2);
	
	
	private int v;
	
	
	private RespType(int v) {
		this.v = v;
	}
	
	
	public int getValue() {
		return this.v;
	}
	
	
	
	
	public static RespType valueOf(int v) {
		switch(v) {
			case 1: return RespType.SVN;
			case 2: return RespType.GIT;
			default: throw new ServiceException(" is wrong RespType value '"+v+"'! ");
		}
	}
	
	
	
	
}
