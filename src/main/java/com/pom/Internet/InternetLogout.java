package com.pom.Internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetLogout {
	
	@FindBy(xpath="//i[contains(text(),'Logout')]")
	private WebElement logoutButton;
	
	@FindBy(id="flash")
	private WebElement logoutSuccessMessage;
	
	public InternetLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod() throws InterruptedException {
		Thread.sleep(5000);
		logoutButton.click();
		//success message
		System.out.println("Logout Success Message:- "+logoutSuccessMessage.getText());
	}
}
