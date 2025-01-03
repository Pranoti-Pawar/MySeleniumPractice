package com.pranoti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		
	
		
		
		

	}

}
