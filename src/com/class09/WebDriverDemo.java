package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class WebDriverDemo extends CommonMethods{

	public static void main(String[] args) {
		String URL ="http://uitestpractice.com/";
		setUpDriver("chrome", URL);
		
		driver.findElement(By.linkText("AjaxCall")).click();
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ContactUs")));//one way
		//or use this 
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.ContactUs")));//another way
		
		WebElement el = driver.findElement(By.cssSelector("div.ContactUs"));
		
	
		if(el.isDisplayed()) {
			String text = el.getText();
			System.out.println(text);
		}else {
			System.out.println("Element is not displayed");
			
		}
		driver.quit();

	}

}
