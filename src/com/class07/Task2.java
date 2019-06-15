package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Task2 extends CommonMethods{
	/*Task
Ahead to http://uitestpractice.com/Students/Switchto
Get the parent title
Get the parentId
print the parent title and parentId
Click on the open in a new window
Get the child title
Get the childId
print the child title and childId
close the child window*/

	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
        String parent =driver.getTitle();
        String parentId= driver.getWindowHandle();
        System.out.println("title: "+parent+" "+" ID: "+parentId);
        driver.findElement(By.linkText("Opens in a new window")).click();//thats when you click on the link and a new one opens
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        parent=it.next();
        String child= it.next();
        driver.switchTo().window(child);//it switches to child
        child=driver.getTitle();
        String childId= driver.getWindowHandle();
        System.out.println("title: "+child+" "+" ID: "+childId);
        driver.switchTo().window(parent);//parent stays opened and child closes

		

	}

}
