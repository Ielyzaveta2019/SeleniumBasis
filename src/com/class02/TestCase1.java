package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	
		/*TC 1: Amazon Page Title Verification:
			Open chrome browser
			Go to “https://www.amazon.com/”
			Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Liza\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        System.out.println(driver.getTitle());
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed")) {
		System.out.println("this is the right title");
	}else {
		System.out.println("sorry this not the title");
	}
        driver.quit();

	}
}
