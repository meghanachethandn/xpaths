package com.Pratices.xpath.Testcase;

import java.util.Set;

import org.testng.annotations.Test;

import com.Pratices.xpath.PageObjectModel.omayapage;

public class TC_001_Blogclick extends BaseClass {
	omayapage omp;
	
	@Test
	public void BloglinkClick() {
		omp = new omayapage(driver);
		driver.get(baseurl);
		omp.clickLink();
		//navigating to next window
		String parentWindow = driver.getWindowHandle();
		Set<String> ChildWindows = driver.getWindowHandles();
		for(String childWindow : ChildWindows) {
			driver.switchTo().window(childWindow);
			
		}
	}

}
