package com.class11;

	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

	public class FileUpload extends CommonMethods{

		public static void main(String[] args) throws InterruptedException {
			//uploading an image
			String url="http://the-internet.herokuapp.com";
			setUpDriver("chrome", url);
			
			driver.findElement(By.linkText("File Upload")).click();
			Thread.sleep(3000);
			
			
			driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Liza\\Desktop\\kp.PNG");
			driver.findElement(By.id("file-submit")).click();//upload button
			//after all when the file is uploaded i click on uploaded and inspect it
			
			boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
			
			if (isDisplayed) {
				System.out.println("File uploaded successfully");
			}else {
				System.out.println("File  NOT uploaded successfully");
			}
	
		}
	
}
