package com.demo.iodemo.stdio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropetiesTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//getAppCount();
		File dir = new File("F:\\new");
		FilenameFilter filter = new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".txt");
			}
		};
		
		List<File> list = new ArrayList<File>();
		
		getFileList(dir,filter,list);
		File destFile = new File(dir,"txtlist.txt");
		writeToFile(list,destFile);
	}



	public static void getAppCount() throws IOException, FileNotFoundException {
		File configFile = new File("config.properties");
		if(!configFile.exists()){
			configFile.createNewFile();
		}
		FileInputStream fis = new FileInputStream(configFile);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty("time");
		int count = 0;
		if(value!=null){
			count = Integer.parseInt(value);
			if(count>=5){
				throw new RuntimeException("非法使用，需注册后使用！");
			}
		}
		count++;
		prop.setProperty("time", count + "");
		FileOutputStream fos = new FileOutputStream(configFile);
		prop.store(fos,"test");
		fis.close();
		fos.close();
	}
	
	public static void getFileList(File dir,FilenameFilter filter,List<File> list){
		File[] files = dir.listFiles();
		
		for(File file : files){
			if(file.isDirectory()){
				getFileList(file,filter,list);
			}else{
				if(filter.accept(dir, file.getName()))
					list.add(file);
			}
		}
	}

	public static void writeToFile(List<File> list,File destFile){
		BufferedWriter bufw = null;
		
		try {
			FileWriter fw = new FileWriter(destFile);
			bufw = new BufferedWriter(fw);
			for(File file : list){
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			if(bufw!=null){
				try{
					bufw.close();
				}catch(IOException e){
					throw new RuntimeException("出错了!"	);
				}
			}
		}
		
	}
}
