package com.assignment.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
	
	Properties pro;
	public ReadConfig() {
		File src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Execution is" + e.getMessage());
		}
			
	}
	
	public String getApplicationbrowser() {
		String browser =pro.getProperty("browser");
				return browser;
	}
	
	public String getApplicationurl() {
		String url = pro.getProperty("Baseurl");
		return url;
		
	}
	
	
	
	public String getUsername() {
		String UserName = pro.getProperty("username");
		return UserName;
		
	}
	
	public String getPassword() {
		String Password = pro.getProperty("password");
		return Password;
	}
	
	
	
	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	
	
	public String getFirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	}
	
	
	
	
	
	
	
	
	
	
	

	
	