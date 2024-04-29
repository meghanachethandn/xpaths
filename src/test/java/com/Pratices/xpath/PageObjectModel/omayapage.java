package com.Pratices.xpath.PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class omayapage {
	WebDriver driver;
	// Constructor
	public  omayapage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// X-path's
	@FindBy(xpath = "//a[@id='selenium143']")
	WebElement seleniumBlogWebSiteLink;
	// Date header 
	@FindBy(xpath = "//h2[@class='date-header']/span")
	WebElement dateHeader;
	// Multiple selection drop down
	@FindBy(xpath = "//select[@id='multiselect1']/option")
	List<WebElement> multipleDropDown;
	//Click drop down
	@FindBy(xpath ="//select[@id='drop1']")
	WebElement clickDropDown;
	//click drop down option
	@FindBy(xpath = "//select[@id='drop1']/option")
	List<WebElement> listsOfClickDropDown;
	//Paragraph on selenium in left bar
	@FindBy(xpath="//div[@id='sidebar-left-1']//div[@class='widget Text']/div")
	WebElement textParaGraph;
	//Click on selenium123 link1 with load in same page
	@FindBy(xpath="//a[@id='link1']")
	WebElement seleniumLink1;
	// Click on selenium123 link2 which load in same page
	@FindBy(xpath="//a[@id='link2']")
	WebElement seleniumLink2;
	//Enable button
	@FindBy(xpath="//button[@id='but2']")
	WebElement enableButton;
	//Disable button
	@FindBy(xpath="//button[@id='but1']")
	WebElement disableButton;
	//Disable text box
	@FindBy(xpath="//input[@id='tb2']")
	WebElement disableTextBox;
	//Button Login, submit, register
	@FindBy(xpath="//div[@id='HTML10']//div[@class='widget-content']//button")
	List<WebElement> buttons;
	//ordered List
	@FindBy(xpath="//div[@id='HTML25']//div[@class='widget-content']/ol/li")
	List<WebElement> orderedLists;
	//unordered List
	@FindBy(xpath="//div[@id='HTML26']//div[@class='widget-content']/ul/li")
	List<WebElement> unOrderedLists;
	//
	@FindBy(xpath="//input[@id='alert2']")
	WebElement clickAfterTextDisappears;
	//open pop up window
	@FindBy(xpath="//div[@id='HTML37']//div//p/a")
	WebElement openPOPUpWindow;
	
	
	// Action Class
	public void clickLink() {
		seleniumBlogWebSiteLink.click();
	}
	
	public String dateInformation() {
		String date = dateHeader.getText();
		System.out.println(date);
		return date;
	}
	public void dropDown(String option) {
		for(WebElement singleDropDown:multipleDropDown) {
			if(singleDropDown.getText().equals(option)) {
				System.out.println(singleDropDown.getText());
				singleDropDown.click();
				}	
		}
	}
	public void clickDropDown() {
		clickDropDown.click();
	}
	public void optionListsOfClickDropDown(String list) {
		for(WebElement dropDownlist : listsOfClickDropDown) {
			if(dropDownlist.getText().equals(list)){
				System.out.println(dropDownlist.getText());
				dropDownlist.click();
			}		
		}		
	}
	public String getTextParaGraph() {
		return textParaGraph.getText();
	}
	public void clickSeleniumLink1() {
		seleniumLink1.click();
	}
	public void clickSeleniumLink2() {
		seleniumLink2.click();
	}
	public void clickEnableButton() {
		enableButton.click();
	}
	public void clickDisableButton() {
		disableButton.click();
	}
	public void clickDisableTextBox() {
		disableTextBox.click();
	}
	public void clickButtons(String buttonoption) {
		for(WebElement button:buttons) {
			if(button.getText().equals(buttonoption)) {
				button.click();
			}
		}
	}
	public void getOrderedList() {
		for(WebElement orderedList:orderedLists  ) {
			String ordereditems = orderedList.getText();
			System.out.println(ordereditems);
		}	
	}
	public void getUnOrderedLists() {
		for(WebElement unOrderdList : unOrderedLists) {
			String unOrderItems = unOrderdList.getText();
			System.out.println(unOrderItems);
		}
	}
	public void popUpClickAfterTextDisappears() {
		clickAfterTextDisappears.click();
	}
	public void clickopenPOPUpWindow() {
		openPOPUpWindow.click();
	}
	

}
