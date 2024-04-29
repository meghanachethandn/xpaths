package com.Pratices.xpath.Testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Pratices.xpath.PageObjectModel.omayapage;
import com.Pratices.xpath.utils.ReadConfig;

public class TC_003_dropDown extends BaseClass {
	ReadConfig rd = new ReadConfig();
	//omayapage omp=new omayapage(driver);
	@Test
	public void dropDownList() {
		omayapage omp=new omayapage(driver);
		String dropDown_option = rd.getDropDownValue();
		System.out.println(dropDown_option);
		omp.dropDown(dropDown_option);
	}
	@Test
	public void clickDropDownList() {
		omayapage omp=new omayapage(driver);
		String clickDropDown_option = rd.getClickDropDownOption();
		System.out.println(clickDropDown_option);
		omp.clickDropDown();
		omp.optionListsOfClickDropDown(clickDropDown_option);
		
	}
	

}
