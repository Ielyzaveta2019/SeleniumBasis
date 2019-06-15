package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	/*Mercury Tours Registration:
	Open chrome browser
	Go to “http://newtours.demoaut.com/”
	Click on Register Link
	Fill out all required info
	Click Submit
	User successfully registered*/
			

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Liza\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.cssSelector("[name^='email']")).sendKeys("sobaka");
		driver.findElement(By.cssSelector("[name$='password']")).sendKeys("sobaka2019");
		driver.findElement(By.cssSelector("[name*='confirmPassword']")).sendKeys("sobaka2019");
		driver.findElement(By.cssSelector("[type^='image']")).click();
		
		//System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://newtours.demoaut.com/");
driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("bob");
driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("tom");
driver.findElement(By.cssSelector("input#email")).sendKeys("test");
driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("123");
driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("123");
driver.findElement(By.cssSelector("input[name='register']")).click();

		
		
		
		

	}

}
