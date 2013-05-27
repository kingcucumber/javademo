package com.demo.iodemo.fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
	/*	File file = new File("buf.txt");
		
		String name = file.getName();
		System.out.println("name: " + name );
		String absPath = file.getAbsolutePath();
		System.out.println("absPath:" + absPath);
		String relPath = file.getPath();
		System.out.println("relPath: " + relPath);
		String path = file.getCanonicalPath();
		System.out.println("path:" + path);
		String  parent  = file.getParent();
		System.out.println("parent:" + parent);*/
		listDemo();
	}
	
	public static void listDemo(){
		File file = new File("c:\\");
		
		String[] names = file.list();
		
		for(String name: names){
			System.out.println(name);
		}
	}
}
