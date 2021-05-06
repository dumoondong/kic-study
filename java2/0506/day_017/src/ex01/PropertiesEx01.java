package ex01;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pros = new Properties();
		pros.setProperty("timeout", "30");
		pros.setProperty("language", "kr");
		pros.setProperty("size", "10");
		System.out.println(pros.toString());
		
		System.out.println(pros.getProperty("timeout"));
		//열거자 / Iterator
		Enumeration e = pros.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			System.out.println(name + ":"+pros.getProperty(name));
		}
	}

}
