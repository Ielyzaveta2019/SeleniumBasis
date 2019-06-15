package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	/*Task Enter the username with either contains or starts-with xpath*/

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Liza\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[contains(@id,'-name')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[starts-with(@type,'submit')]")).click();
		
		

	}

}
