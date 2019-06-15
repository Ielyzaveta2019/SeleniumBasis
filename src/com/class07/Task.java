package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) {
    CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
   //1 way of doing it by name
    driver.switchTo().frame("iframe_a");
    
    //2nd way of doing it by webelement
    WebElement ele = driver.findElement(By.xpath("//iframe[@name=\"iframe_a\""));
	driver.switchTo().frame(ele);
	
	//3rd way of doing it by index
	driver.switchTo().frame(0);
	driver.findElement(By.cssSelector("input#name")).sendKeys("Liza");
	

	}

}
