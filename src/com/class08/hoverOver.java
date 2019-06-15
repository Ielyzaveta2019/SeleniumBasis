package com.class08;


/*Task for hoverOver
//         Navigate to https://www.toolsqa.com
//             Hover over the Tutorial menu
//             Click on Software Testing Tutorial
//             Close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class hoverOver extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome","https://www.toolsqa.com");
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='Tutorial']"));
		Actions action = new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		driver.findElement(By.xpath("//span[text()='Web Automation Tools']")).click();
		driver.close();
		

	}

}
