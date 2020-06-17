package com.generics.Internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BasePage   {
	
	//Select class
	  public void selectbyvisibletext(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	  }
		
	  public void selectbyvalue(WebElement element,String value) {
		  Select sel=new Select(element);
		  sel.selectByValue(value);
		  }
	  
	  public void selectbyindex(WebElement element,int index) {
		  Select sel=new Select(element);
		  sel.selectByIndex(index);
	  }
	  
	    //Actions class 
	  public void contextclick(WebDriver driver,WebElement onElement) {
		  Actions act=new Actions(driver);
		  act.contextClick(onElement).perform();
	  }
	  
	 public void fetchTitleMethod(WebDriver driver) 
	 {
		 String loginTitle=driver.getTitle();
		 System.out.println("Title of Login Page:- "+loginTitle);
	 }	 
	 
	 public void fetchUrlMethod(WebDriver driver) 
	 {
		 String loginUrl=driver.getCurrentUrl();
		 System.out.println("Url of Login Page:- "+loginUrl);
	 }	
	
} 