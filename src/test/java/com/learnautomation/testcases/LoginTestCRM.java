package com.learnautomation.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass{
	
	@Test
	public void loginApp() {
				
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		
		page.logintoApp(excel.getStringData("Login",0,0), excel.getStringData("Login",0,1));
		Helper.captureScreenshot(driver);
		
	}
	
	

}
