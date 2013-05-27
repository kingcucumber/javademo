package com.demo.iodemo.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copyfile1();
		copyfile2();
	}

	public static void copyfile2() {
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader("1.txt");
			fw = new FileWriter("2.txt");
			
			char[] buf = new char[1024];
			int length = 0;
			while((length = fr.read(buf))!= -1){
				fw.write(buf, 0, length);
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fw !=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException();
				}
			}
		}
	}

	public static void copyfile1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("1.txt");
		FileWriter fw = new FileWriter("2.txt");
		
		int ch = 0;
		while((ch = fr.read())!= -1){
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	

}
