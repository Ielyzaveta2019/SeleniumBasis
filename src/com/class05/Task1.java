package com.class05;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	/*Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Using Iterator get text of each link
Get number of links that has text*/

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\Liza\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		//capture all links
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int count = 0;
	    Iterator<WebElement>it=links.iterator();
	    while (it.hasNext()) {
	    System.out.println(it.next().getText());
	    count++;
	    }
	    
	    System.out.println("Total numbers wiht text"+count);
	    driver.quit();
	    	
	    	
	    }
}
//or here is another way to do it


