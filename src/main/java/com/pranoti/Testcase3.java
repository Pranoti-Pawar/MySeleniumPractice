package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		
        ChromeDriver driver=new ChromeDriver();
//		
//	driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
//	
//	//click();
//	
//	
//	driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Pranoti");
//	driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Patil");
//	driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("pranoti@gmail.com");
//	driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("his is first comment");
//	driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
//	
//	
//	
//	
//	//submit form
//	
//	driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
        
        driver.get("http://webdriveruniversity.com/Dropdown-checkboxws-RadioButtons/index.html");
        
	
	
	
	}
}
