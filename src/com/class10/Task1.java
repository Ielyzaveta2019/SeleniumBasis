package com.class10;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	


//Open chrome browser
//Go to “https://jqueryui.com/”
//Click on “Datepicker”
//Select August 10 of 2019
//Verify date “08/10/2019” has been entered successfully
//Close browser

    public static void main(String[] args) throws Throwable {
        
        String url="https://jqueryui.com";
        setUpDriver("chrome", url);
        
        driver.findElement(By.linkText("Datepicker")).click();
        Thread.sleep(2000);
        switchToFrame(0);
        driver.findElement(By.cssSelector("input#datepicker")).click();
        Thread.sleep(2000);
        
        //Capture month that currently displayed
        String csSSelector="span[class='ui-datepicker-month']";
        String month=driver.findElement(By.cssSelector(csSSelector)).getText();
        System.out.println("Current month is "+month);
        //loop until month selected
        if(!month.equals("August")){
            do {
                driver.findElement(By.xpath("//span[text()='Next']")).click();
            }while(!driver.findElement(By.cssSelector(csSSelector)).getText().equals("August"));
        }
        //get all cells from table
        String expathCells="//table[@class='ui-datepicker-calendar']/tbody/tr/td";
        List<WebElement>cells=driver.findElements(By.xpath(expathCells));
        for(WebElement cell: cells) {
            String data =cell.getText();
            if(data.equals("10")) {
                cell.click();
                
        boolean submitPresence=driver.findElement(By.cssSelector("input#datepicker")).isDisplayed();
        System.out.println("Date is verified "+submitPresence);
        break;
            
                
     
            }
        }
        Thread.sleep(7000);
        driver.quit();
        
    }
}

	
