package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

/*Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser*/

public class Task extends CommonMethods{

	public static void main(String[] args) {
		String url =  "https://the-internet.herokuapp.com/";
		
		CommonMethods.setUpDriver("chrome", url);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		driver.findElement(By.cssSelector("div#start")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#start")));
		WebElement el = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		if (el.isDisplayed()) {
			String text = el.getText();
			System.out.println(text);
		}else {
			System.out.println("Element is displayed");
		}
		driver.close();
			
			
		}
		
}
