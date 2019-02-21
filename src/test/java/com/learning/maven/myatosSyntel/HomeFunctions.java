package com.learning.maven.myatosSyntel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.learning.pages.HomePage;
import com.learning.testbase.TestBase;

public class HomeFunctions extends TestBase{
	public HomePage objHomePage;


	public HomeFunctions() {


		objHomePage = new HomePage();

	}

	public void navigationTabHome (String user) {
	
	
		boolean flag = false;
		switch(user) {
		
		case "social":

		driver.findElement(objHomePage.social).click();
		flag = true;
			break;

		case "Services":

			driver.findElement(objHomePage.Services).click();
			flag = true;
			break;

		case "UsefulLinks":

			driver.findElement(objHomePage.UsefulLinks).click();
			flag = true;
			break;
		
		case "Sitemap":

			driver.findElement(objHomePage.Sitemap).click();
			flag = true;
			break;
	
		
		
		}
	Assert.assertTrue(true, "navigation passed");
	}

	

}
