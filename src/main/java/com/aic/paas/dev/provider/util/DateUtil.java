package com.aic.paas.dev.provider.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class DateUtil {
	
	public static Date changeTimeZone(String time) throws ParseException{
		SimpleDateFormat utcsdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		utcsdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date utcDate =utcsdf.parse(time);
		SimpleDateFormat local =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		local.setTimeZone(TimeZone.getDefault());
		String localDate=local.format(utcDate.getTime());
		return local.parse(localDate);
		
	}
	
	 
	
}
