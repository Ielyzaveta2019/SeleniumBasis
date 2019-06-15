package com.class09;

import utils.CommonMethods;

public class DriversTest extends CommonMethods{
//CTRL+o to search for a method
	public static void main(String[] args) {
		setUpDriver("chrome", "http://google.com");
		driver.quit();
		

	}

}
