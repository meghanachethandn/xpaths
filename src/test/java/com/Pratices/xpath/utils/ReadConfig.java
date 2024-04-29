package com.Pratices.xpath.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	// Calling constructer
	public ReadConfig() {
		File configfile = new File("./configuration/Config.Properties");
		try {
			FileInputStream fis = new FileInputStream(configfile);
			pro = new Properties();
			pro.load(fis);
			}
		catch(Exception e){
			System.out.println("Exception is : " +e.getMessage());
		}
	}
	public String getApplicationUrl() {
		String url = pro.getProperty("url");
		return url;
		}
	public String getDropDownValue() {
		String dropDownOption = pro.getProperty("dropDownToSelect");
		return dropDownOption;
	}
	public String getClickDropDownOption() {
		String clickDropDownValue = pro.getProperty("clickDropDownSelect");
		return clickDropDownValue;
	}

	

}
