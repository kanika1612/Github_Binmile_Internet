package com.generics.Internet;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility  
{
	public static String getScreenshot(WebDriver driver) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		String path="./screenshot/image.png";
		File destFile=new File(path);
		FileUtils.copyFile(srcFile, destFile);
		return path;
	}
}