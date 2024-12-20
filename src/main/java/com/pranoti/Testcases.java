package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcases {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		
         ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	
	//locators
	//by id
	
	WebElement formInput=driver.findElement(By.id("contact_form"));
	if(formInput.isDisplayed()) {
		System.out.println("Test case pass...");
	}
	else {
		System.out.println("Test case fail...");
		
	}
	//by name
	WebElement header=driver.findElement(By.name("contactme"));
	String txt=header.getText();
	if(txt.equals("CONTACT US")) {
		System.out.println("Test case pass...");
	}
	else {
		System.out.println("Test case fail...");
		
	}
	
	//BY CLASSNAME
	WebElement headerEleByClassname=driver.findElement(By.className("section_header"));
	String txt1=header.getText();
	if(txt1.equals("CONTACT US")) {
		System.out.println("Test case pass...");
	}
	else {
		System.out.println("Test case fail...");
		
	}
	
	//by tagname
	WebElement textElement=driver.findElement(By.tagName("textarea"));
	if(textElement.isDisplayed()) {
		System.out.println("Test case pass...");
	}
	else {
		System.out.println("Test case fail...");
		
	}
	
	//by css Selector
	
	WebElement textareaEle2=driver.findElement(By.cssSelector("#contact_form > textarea"));
	if(textareaEle2.isDisplayed()) {
		System.out.println("Test case pass...");
	}
	else {
		System.out.println("Test case fail...");
		
	}
	
	//by xpath
	WebElement textareaEle3=driver.findElement(By.xpath("//*[@id=\"contact_me\"]/div/div[1]/div/h2"));
	if(textareaEle3.isDisplayed()) {
		System.out.println("Test case pass...");
	}
	else {
		System.out.println("Test case fail...");
		
	}
	// By partiallinktext
	driver.findElement(By.partialLinkText("CONTACT"));
	
	//driver.findElement(By.linkText("CONTACT US"));
	driver.quit();
	}

	}


