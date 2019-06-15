package com.class10;
/*Table headers and rows verification
Open chrome browser
Go to �https://the-internet.herokuapp.com/�
Click on �Click on the �Sortable Data Tables� link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows*/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[40]/a")).click();
		
		List <WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
        for (WebElement row: rows) {
        	String liza = row.getText();
        	
        	System.out.println(liza);
        }
	}

}
