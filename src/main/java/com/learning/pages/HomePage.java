package com.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.learning.testbase.TestBase;

public class HomePage  extends TestBase{


	
	 public By social = By.xpath("//span[text()=' Social ']");

	public	By Services = By.xpath("//span[text()=' Services ']");

	public By UsefulLinks = By.xpath("//span[text()=' Useful Links ']");

	public By Sitemap = By.xpath("//span[text()=' Sitemap ']");

	public By Policies = By.xpath("//span[text()=' Policies ']");

	
	public HomePage( ) {

    PageFactory.initElements(driver, this);

	}

	public void navigationTabHome (String user) {
		
		
		boolean flag = false;
		switch(user) {
		
		case "social":

		driver.findElement(social).click();
		flag = true;
			break;

		case "Services":

			driver.findElement(Services).click();
			flag = true;
			break;

		case "UsefulLinks":

			driver.findElement(UsefulLinks).click();
			flag = true;
			break;
		
		case "Sitemap":

			driver.findElement(UsefulLinks).click();
			flag = true;
			break;
	
		
		
		}
	Assert.assertTrue(true, "navigation passed");
	}

	
	

}
