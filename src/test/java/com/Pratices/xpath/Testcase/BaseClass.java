package com.Pratices.xpath.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pratices.xpath.utils.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig rd = new ReadConfig();
	String baseurl = rd.getApplicationUrl();
	WebDriver driver ;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(baseurl);
	}

	//@AfterClass
	//public void TearDown() {
	//	driver.quit();
	//}
	
	
}
