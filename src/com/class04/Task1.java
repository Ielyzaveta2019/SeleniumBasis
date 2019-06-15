package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	/*Facebook login:
Open chrome browser
Go to “https://www.facebook.com/”
Enter valid username and valid password and click login
User successfully logged in*/

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Liza\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Sobaka@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("sobaka2019");
	    driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	    
	    
	    //a[starts-with(text()='forgot account?')]
	   //a[contains(text(),'forgot account?')]
	    //Thread.sleep(2000)-its to run it slower

	}

}
