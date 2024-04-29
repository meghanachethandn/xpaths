package com.Pratices.xpath.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selenium143BlogsPage {
	WebDriver driver;
	public void selenium143BlogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//a[contains(@href,'https://t.me/qafox')]")
	WebElement joinOurTelegramGroup;
	@FindBy(xpath ="//a[contains(@href,'https://www.youtube.com')]")
	WebElement checkOurYouTubechannel;
	@FindBy(xpath = "//a[contains(@href,'https://www.udemy.com')]")
	WebElement checkOurUdemyCourse;
	
	public void linkImgJoinOurTelegramGroup() {
		joinOurTelegramGroup.click();
	}

}
