package com.demo.iodemo.stdio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		//properties();
		//readProp();
		setProp() ;
	}

	public static void properties() throws IOException {
		// TODO Auto-generated method stub
		Properties prop  = new Properties();
		
		prop.setProperty("1","a");
		prop.setProperty("2", "b");
		prop.setProperty("3", "c");
		
		/*Set<String> set = prop.stringPropertyNames();
		for(String str : set ){
			System.out.println(str);
		}*/
		
		/*prop.list(System.out);
		
		Properties prop2 = System.getProperties();
		prop2.list(System.out);*/
		
		FileOutputStream fos = new FileOutputStream("prop.txt");
		prop.store(fos, "comment");
		fos.close();
	}
	
	public static void readProp() throws  IOException {
		Properties prop  = new Properties();
		prop.list(System.out);
		prop.load(new FileInputStream("prop.txt"));
		prop.list(System.out);
		
	}
	
	public static void setProp() throws IOException{
		File file = new File("prop.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		
		FileReader fr = new FileReader(file);
		Properties prop  = new Properties();
		prop.load(fr);
		prop.list(System.out);
		prop.setProperty("3", "bad");
		FileWriter fw = new FileWriter(file);
		prop.store(fw, "test");
		prop.list(System.out);
		fr.close();
		fw.close();
		
	}
}
