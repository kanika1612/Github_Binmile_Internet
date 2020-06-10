package com.pom.Internet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Internet.AutoConstant;
import com.generics.Internet.BasePage;
import com.generics.Internet.ExcelLibrary;

public class InternetLogin extends BasePage implements AutoConstant {
	
	public WebDriver driver;
   
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(id="password")
	private WebElement passwordPasswordField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(id="flash")
	private WebElement loginErrorMessage;
	
	@FindBy(id="flash")
	private WebElement loginSuccessMessage;
	
	public InternetLogin(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginTitleMethod() {
		fetchTitleMethod(driver);
	}
	public void loginUrlMethod() {
		fetchUrlMethod(driver);
	}
	
	//invalid credentials
	public void invalidLoginMethod() throws IOException, InterruptedException {
		usernameTextField.sendKeys(ExcelLibrary.getCellvalue(excel_sheet, sheetname_login, 2,0));
		Thread.sleep(2000);
		passwordPasswordField.sendKeys(ExcelLibrary.getCellvalue(excel_sheet, sheetname_login, 2, 1));
		loginButton.click();
	 //error message
		System.out.println("Login Error Message:- "+loginErrorMessage.getText());		
		}
	
	//with valid credentials
	public void loginMethod() throws IOException, InterruptedException {
		Thread.sleep(2000);
		usernameTextField.sendKeys(ExcelLibrary.getCellvalue(excel_sheet, sheetname_login, 1, 0));
		Thread.sleep(2000);
		passwordPasswordField.sendKeys(ExcelLibrary.getCellvalue(excel_sheet, sheetname_login, 1, 1));
		loginButton.click();
	//success message
		System.out.println("Login Success Message:- "+loginSuccessMessage.getText());
			}
}
