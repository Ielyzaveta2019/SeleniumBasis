package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	/*Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon*/

	public static void main(String[] args) {
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Liza\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		//login to the application
       driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
       driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("secret_sauce");
       driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
       //logo verification
       boolean logo = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
       
      if (logo) {
			System.out.println("Robot logo is displayed");
		} else {
			System.out.println("Robot logo is not displayed");
		}
		// verify product text
		WebElement product = driver.findElement(By.cssSelector("div.product_label"));
		
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		String logoText = product.getText();
		String expectedText="Products";
		

		if (displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and text is"+logoText);
		} else {
			System.out.println("Element is not displayed");
			
		}
		driver.close();
		
       
	}    

}
