package com.page.object.modal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static void main(String[] args) throws IOException {
		
		
		String filepath="./Config.propeties";
		FileInputStream fis = new FileInputStream(filepath);//bytecode 

		Properties pro = new Properties();
		pro.load(fis);
		
		System.out.println(pro.getProperty("email"));
	}

}
