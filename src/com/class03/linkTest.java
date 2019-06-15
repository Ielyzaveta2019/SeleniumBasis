package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Liza\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
        Thread.sleep(3000);
        driver.navigate().to("http://google.com");
      //driver.findElement(By.linkText("Link Test")).click();
        driver.findElement(By.partialLinkText("Partial Link")).click();



	}

}
