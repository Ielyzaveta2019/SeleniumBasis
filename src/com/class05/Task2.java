package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class 02{
	/*Check all Years of Experience radio buttons are clickable
* -----------------------------------------------
* Check all Automation Tools checkboxes are clickable
* and keep “Selenium WebDriver” option as selected*/



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> expList = driver.findElements(By.name("exp"));
		for (WebElement exp  : expList) {
			if (exp.isEnabled()) {
				System.out.println("Radio buttons are clickable");
			}else {
			System.out.println("Radio buttons arent clickable");
		}
			List<WebElement> toolList = driver.findElements(By.name("tool"));
			for (WebElement tool  : toolList) {
				if (tool.isEnabled()) {
					System.out.println("Tools are clicable");
				}else {
					System.out.println("Tools are not clicable");
					
				}
			}
		}
	
	
	


