package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

	public ConfigDataProvider() {
		 File src = new File("./Config/Config.properties");
		 try {
			FileInputStream fls = new FileInputStream(src);
			 pro = new Properties();
			 pro.load(fls);
		} catch (Exception e) {
			System.out.println("Not able to load config Data"+e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
		
			}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getStagingURL() {
		return pro.getProperty("qaUrl");
		
	}
}

