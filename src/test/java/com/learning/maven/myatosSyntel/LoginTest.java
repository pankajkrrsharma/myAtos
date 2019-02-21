package com.learning.maven.myatosSyntel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.learning.pages.HomePage;
import com.learning.pages.LoginPage;
import com.learning.testbase.TestBase;

public class LoginTest extends TestBase{

	LoginPage objloginpage;
	HomePage  objHomePage;
	public LoginTest () {
		super();


	}

	@BeforeMethod
	public void Setup() {
		Initialization();

		objloginpage = new LoginPage();

	}
	@Test(priority = 1)
	public void Loginpagetitletest() {
		String title = objloginpage.validateLoginpagetitle();
		Assert.assertEquals(title, "my Atos Syntel - Login");
	}

	@Test(priority = 2)
	public void LogintoSyntel() {
		objHomePage = objloginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}


