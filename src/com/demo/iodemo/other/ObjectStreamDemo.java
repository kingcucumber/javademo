package com.demo.iodemo.other;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//writeObj();
		readObju();
	}

	public static void readObju() throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		
		Person p = (Person) ois.readObject();
		System.out.println(p.getName() + ":" + p.getAge());
		ois.close();
	}

	public static void writeObj() throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
		
		Person p = new Person("zhangsn",20);
		
		oos.writeObject(p);
	}

}
