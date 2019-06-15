package com.class03;
/*TC 1: Facebook login:
Open chrome browser
Go to “https://www.facebook.com/”
Enter valid username and valid password and click login
User successfully logged in*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Liza\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Sobaka");
		driver.findElement(By.name("lastname")).sendKeys("Kot");
		driver.findElement(By.name("reg_email__")).sendKeys("sobaka@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sobaka@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sobaka2019");
	//	driver.findElement(By.name("birthday month")).sendKeys("January");
	//	driver.findElement(By.name("birthday_day")).sendKeys("02");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
	}

}
