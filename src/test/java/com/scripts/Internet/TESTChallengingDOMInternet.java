package com.scripts.Internet;

import org.testng.annotations.Test;
import com.generics.Internet.BaseTest;
import com.pom.Internet.ChallengingDOM;
import com.pom.Internet.InternetHomePage;

public class TESTChallengingDOMInternet extends BaseTest {
	
   @Test(priority=1)
   public void home() throws InterruptedException {
	   driver.get(url_internet);
	   InternetHomePage home=new InternetHomePage(driver);
	   home.homepageMethod();
   }
   @Test(priority=2)
   public void dom() throws InterruptedException {
	   ChallengingDOM dom=new ChallengingDOM(driver);
	   dom.tableMethod();
	   dom.btnMethod();
   }
}
