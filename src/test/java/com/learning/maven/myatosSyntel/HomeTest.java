package com.learning.maven.myatosSyntel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.learning.pages.HomePage;
import com.learning.pages.LoginPage;
import com.learning.testbase.TestBase;
import com.learning.util.TestUtil;

public class HomeTest extends TestBase{
	
	LoginPage objloginpage;
	HomePage  objHomePage;
	String sheetname  = "Home";
	public HomeTest() {
		super();
		
	}

	@BeforeMethod
	public void setup() {
		Initialization();
		objloginpage = new LoginPage();
		objHomePage = objloginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@DataProvider
	public Object[][] getmyAtosdata() {
		Object data [][] = TestUtil.getTestdata(sheetname);
		return data;
		
	}

	@Test(priority = 1 ,dataProvider="getmyAtosdata")
	
	public void exceldataprint(String name, String lastname , String Age) {
		System.out.println(name);
		System.out.println(lastname);
	
		System.out.println(Age);
		}
	
	
	@Test(priority = 2)
	public void verifynavigationTabHome() throws InterruptedException {
		Thread.sleep(10000);
		objHomePage.navigationTabHome("social");
		objHomePage.navigationTabHome("Services");
		objHomePage.navigationTabHome("UsefulLinks");
		objHomePage.navigationTabHome("social");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
}
