package com.generics.Internet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTestHome implements AutoConstant {
	 public WebDriver driver;
	  
	    @BeforeClass
	   public void openBrowser() {
		   System.setProperty(chrome_key, chrome_value);
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get(url_internet);
		   }
}
