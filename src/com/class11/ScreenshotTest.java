package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class ScreenshotTest extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
    setUpDriver("chrome", "http://www.google.com");
		  //steps how to take a screenshot 
		 TakesScreenshot ts = (TakesScreenshot)driver; //memorize
		 File pic = ts.getScreenshotAs(OutputType.FILE);//memorize
		 
		 try {
			FileUtils.copyFile(pic, new File ("Screenshots/googletest.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot wasnt taken");
		}
		 
	}
}
