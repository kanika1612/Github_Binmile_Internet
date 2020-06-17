package com.pom.Internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetHomePage {
   
	@FindBy(xpath="//a[.='Challenging DOM']")
	private WebElement challengingLink;
	
	public InternetHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void homepageMethod() throws InterruptedException {
		Thread.sleep(4000);
		challengingLink.click();
	}
}
