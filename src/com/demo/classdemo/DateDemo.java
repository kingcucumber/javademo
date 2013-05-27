package com.demo.classdemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	/*	Date date = new Date(System.currentTimeMillis());
		System.out.println("toString:\t" + date.toString());
		System.out.println("toGMTString:\t" + date.toGMTString());
		System.out.println("toLocaleString:\t" + date.toLocaleString());*/
		//getDate();
		DateFormat df = DateFormat.getDateInstance();
		df = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = df.parse("2012-3-4");
		System.out.println(date1.toString());
		Date date2 = df.parse("2013-8-4");
		System.out.println(date2.toString());
		long day = getDays(date1,date2);
		System.out.println((int)day);
	}

	public static void getDate(){
		Date date  = new Date();
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(date));
		DateFormat dfdtf = DateFormat.getDateTimeInstance();
		System.out.println(dfdtf.format(date));
		DateFormat dfdf = DateFormat.getDateInstance();
		System.out.println(dfdf.format(date));
		DateFormat dftf = DateFormat.getTimeInstance();
		System.out.println(dftf.format(date));
	}
	
	public static long getDays(Date date1,Date date2){
		long m1 = date1.getTime();
		long m2 = date2.getTime();
		
		return (m2-m1)/1000/60/60/24;
	}
}
