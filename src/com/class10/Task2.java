package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;



public class Task2 extends CommonMethods{
	   /*
	     * TC 1: Users Application Form Fill
	     * 1. Open chrome browser
	     * 2. Go to “http://uitestpractice.com/”
	     * 3. Click on “Forms” link
	     * 4. Fill out the entire form
	     * 5. Close the browser MUST USE Functions:
	     * */
	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	        /**
	         * TC 1: Users Application Form Fill
	         *
	         * 1.Open chrome browser
	         * 2.Go to "http://uitestpractice.com/"
	         * 3.Click on "Forms" link
	         * 4.Fill out the entire form
	         * 5.Close the browser
	         *
	         * MUST USE Functions:
	         */
	        // 1.Open chrome browser
	        // 2.Go to "http://uitestpractice.com/"
	        String url = "http://uitestpractice.com/";
	        setUpDriver("Chrome", url);

	        // 3.Click on "Forms" link
	        driver.findElement(By.xpath("//a[text()='Form']")).click();

	        // 4.Fill out the entire form:
	        // First Nmae
	        sendText(driver.findElement(By.cssSelector("input#firstname")), "John");
	        Thread.sleep(2000);

	        // LastName
	        sendText(driver.findElement(By.cssSelector("input#lastname")), "Snow");
	        Thread.sleep(2000);

	        // Radio Button MS
	        radioButton(driver.findElements(By.cssSelector("label.radio-inline")), "Married");
	        
	        // Check Box Hobby
	        checkBox(driver.findElements(By.cssSelector("label.checkbox-inline")), "Dancing", "Reading");
	        
	        //Country
	        WebElement optionToChoose=driver.findElement(By.cssSelector("select#sel1"));
	        selectValueFromDD(optionToChoose, "Bahrain");
	        
	        //Date Of Birth
	        WebElement date=driver.findElement(By.cssSelector("input#datepicker"));
	        sendText(date, "05/27/2019");
	    
	        //Phone Number
	       WebElement phone= driver.findElement(By.xpath("//input[@placeholder='Enter PhoneNumber']"));
	        sendText(phone, "(703)667-3387");
	        
	        //User Name
	        WebElement userName= driver.findElement(By.xpath("//input[@placeholder='Enter UserName']"));
	        sendText(userName, "Targarien");
	        
	        //Email
	        WebElement email= driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']"));
	        sendText(email, "stark@winter.com");
	        //About Yourself
	        WebElement info= driver.findElement(By.xpath("//textarea[@rows='5']"));
	        sendText(info, "Hello My Name is John Snow");
	        
	       //Password
	        WebElement password= driver.findElement(By.cssSelector("input#pwd"));
	        sendText(password, "darewolf");
	        

	        // 5.Close the browser
	        Thread.sleep(2000);
	        driver.quit();
	    }

	}