package com.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.learning.testbase.TestBase;

public class LoginPage  extends TestBase{




	@FindBy(xpath = "//input[@title='Login']" )

	WebElement username;


	@FindBy(xpath = "//input[@title='Password']" )
	WebElement password;



	@FindBy(xpath = "//span[text()='Sign In']" )
	WebElement button;



	public LoginPage() {
		PageFactory.initElements(driver, this);
	}


	public String validateLoginpagetitle() {
		return driver.getTitle();
	}

	public HomePage login(String un,String pass) {
		
		username.sendKeys(un);
		password.sendKeys(pass);
		button.click();
	return new HomePage();
	
	}

	

}



