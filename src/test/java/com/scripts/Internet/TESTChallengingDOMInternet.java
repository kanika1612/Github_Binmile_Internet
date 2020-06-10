package com.scripts.Internet;

import org.testng.annotations.Test;

import com.generics.Internet.BaseTestHome;
import com.pom.Internet.ChallengingDOM;
import com.pom.Internet.InternetHomePage;

public class TESTChallengingDOMInternet extends BaseTestHome {
   @Test(priority=1)
   public void home() throws InterruptedException {
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
