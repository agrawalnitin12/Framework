package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	WebDriver driver;
		
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement pwd;
	@FindBy(id="tdb1") WebElement login;

	
	public void logintoApp(String user,String pass) {
		uname.sendKeys(user);
		pwd.sendKeys(pass);
		login.click();
	}
}
