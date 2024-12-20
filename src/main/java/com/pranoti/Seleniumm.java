package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement firstname=driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		firstname.sendKeys("Pranoti");
		
		WebElement lastname=driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		lastname.sendKeys("Pawar");
		
		WebElement email=driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		email.sendKeys("pranoti@gmail.com");
		
		WebElement cmt=driver.findElement(By.cssSelector("#contact_form > textarea"));
		cmt.sendKeys("coommentss....");
		
		WebElement button1=driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		button1.click();
		
		

	}

}
