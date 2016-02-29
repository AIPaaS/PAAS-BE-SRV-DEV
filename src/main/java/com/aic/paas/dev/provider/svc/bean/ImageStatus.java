package com.aic.paas.dev.provider.svc.bean;

import com.binary.framework.exception.ServiceException;

/**
 * 镜像状态
 * @author wanwb
 * 1=快照  2=开发  3=测试  4=生产
 */
public enum ImageStatus {
	
	
	/** 快照 **/
	SNAPSHOOT(1),
	
	/** 开发 **/
	DEV(2),
	
	/** 测试 **/
	TEST(3),
	
	/** 生产 **/
	RELEASE(4);
	
	
	private int v;
	
	
	private ImageStatus(int v) {
		this.v = v;
	}
	
	
	public int getValue() {
		return this.v;
	}
	
	
	
	public static ImageStatus valueOf(int v) {
		switch(v) {
			case 1: return SNAPSHOOT;
			case 2: return DEV;
			case 3: return TEST;
			case 4: return RELEASE;
			default : throw new ServiceException(" is wrong ImageStatus-value '"+v+"'! ");
		}
	}
	
	
	

}





