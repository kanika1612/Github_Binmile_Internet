package com.pom.Internet;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDOM 
{
   @FindBy(xpath="//a[@class='button']")
   private WebElement firstButton;
   
   @FindBy(xpath="//a[@class='button alert']")
   private WebElement secondButton;
   
   @FindBy(xpath="//a[@class='button success']")
   private WebElement thirdButton;
   
   @FindBy(xpath="//tr")
   private List<WebElement> rows;
   
   @FindBy(xpath="//th")
   private List<WebElement> columns;
   
   @FindBy(xpath="//td")
   private List<WebElement> celldata;
   
   public ChallengingDOM(WebDriver driver) 
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void tableMethod() 
   {
	   //numbers of rows in a table
	   int rowSize=rows.size();
	   System.out.println("Total no. of rows is " +rowSize );
	  //numbers of columns in a table
	  int columnSize=columns.size();
	   System.out.println("Total no. of columns is "+columnSize);
	  // System.out.println(columns.size());
	  //size of cell data
	   System.out.println(celldata.size());
	   
	  /* ArrayList<WebElement> al=new ArrayList<>(celldata);
	   System.out.println(al.size());*/
	   
	   List<String> list=new ArrayList<>();
	     for(int i=0;i<celldata.size();i++) {
		   list.add(celldata.get(i).getText());
	     }
	  //System.out.println(list);
	   
	   String a[][] =new String[10][7];
      int j=0;
      for (int c=0;c<10;c++) {
    	  for(int d=0;d<7;d++) {
    		  a[c][d]=(String)list.get(j);
    		  j++;
    	  }
      }
      for(int c=0;c<10;c++) {
    	  for(int d=0;d<6;d++) {
    		  System.out.print(a[c][d]+"  ");
    		  }
    	  System.out.println(" ");
     }
  }
  
   public void btnMethod() throws InterruptedException {
	   System.out.println(firstButton.getText());
	   firstButton.click();
	   Thread.sleep(4000);
	   System.out.println(secondButton.getText());
	   secondButton.click();
	   Thread.sleep(4000);
	   System.out.println(thirdButton.getText());
	   thirdButton.click();
   }
}
