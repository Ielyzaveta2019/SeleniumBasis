package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class ScreenShot extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		  //steps how to take a screenshot 
		 TakesScreenshot ts = (TakesScreenshot)driver; //memorize
		 File pic = ts.getScreenshotAs(OutputType.FILE);//memorize
		 
		  try { 
		  FileUtils.copyFile(pic, new File("Liza/screenshot01.png")); //memorize
		  }catch
		  (IOException E) { Thread.sleep(2000); 
		  }
		  
		 driver.quit();
	}

}
