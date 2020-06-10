package com.scripts.Internet;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Internet.BaseTest;
import com.pom.Internet.InternetLogin;
import com.pom.Internet.InternetLogout;


public class TESTLoginLogoutInternet extends BaseTest {
	@Test
	public void loginVerfy() {
		InternetLogin logintitle=new InternetLogin(driver);
		logintitle.loginTitleMethod();
		logintitle.loginUrlMethod();
	}
	@Test(priority=1)
	public void invalidLogin() throws IOException, InterruptedException {
		InternetLogin invalidlogin=new InternetLogin(driver);
		invalidlogin.invalidLoginMethod();
	}
	
	@Test(priority=2)
	public void login() throws IOException, InterruptedException {
		InternetLogin login=new InternetLogin(driver);
		login.loginMethod();
	}
	
	@Test(priority=3)
    public void logout() throws InterruptedException {
	   InternetLogout logout=new InternetLogout(driver);
	   logout.logoutMethod();
   }
}
