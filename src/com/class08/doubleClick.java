package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

/*Task for doubleClick
//		 Navigate to https://www.saucedemo.com
        senkeys  to the password textbox
//			 double click on the password text
//			 Close the browser */




public class doubleClick extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	setUpDriver("chrome", "https://www.saucedemo.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("double");
	Actions action = new Actions(driver);
	action.doubleClick(driver.findElement(By.cssSelector("input#password"))).perform();
	Thread.sleep(2000);
	driver.close();
	}

}
