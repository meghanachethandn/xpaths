package com.Pratices.xpath.Testcase;

import org.testng.annotations.Test;

import com.Pratices.xpath.PageObjectModel.omayapage;

public class TC_002_dateinformation extends BaseClass {
	
	@Test
	public void date() {
		omayapage omp= new omayapage(driver);
		driver.get(baseurl);
		omp.dateInformation();
	}
}
