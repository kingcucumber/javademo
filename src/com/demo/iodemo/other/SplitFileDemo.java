package com.demo.iodemo.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class SplitFileDemo {

	private static final int SIZE = 500*1024;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\New\\dremel.jpg");
		splitFile(file);
		File file1= new File("F:\\part_files");
		MergeFile.mergeFile(file1);
	}

	public static void splitFile(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		int count = 0;
		byte[] buf = new byte[SIZE];
		
		FileOutputStream fos  = null;
		
		int len = 0;
		File dir = new File("F:\\part_files");
		if(!dir.exists()){
			dir.mkdirs();
		}
		while((len = fis.read())!= -1){
			count++;
			fos = new FileOutputStream(new File(dir,count + ".part"));
			fos.write(buf,0,len);
			fos.close();
		}
		fis.close();
	}

}

class MergeFile{
	public static void mergeFile(File dir) throws IOException{
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for(int x =1 ;x<=3;x++){
			al.add(new FileInputStream(new File(dir,x+".part")));
		}
		
		Enumeration<FileInputStream> en = Collections.enumeration(al);
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream(new File(dir,"merger.jpg"));
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		fos.close();
		sis.close();
	}
}
