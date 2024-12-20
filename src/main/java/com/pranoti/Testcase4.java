package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		
        ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	
	WebElement Ele=driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
	String fonts=Ele.getCssValue("font-size");
	System.out.println(fonts);
	
	//get Tagname
	
	String Tagname=Ele.getTagName();
	System.out.println(Tagname);
	

	//get Size
	
	Dimension size=Ele.getSize();
	int x=size.getHeight();
	int y=size.getWidth();
	System.out.println(x);
	System.out.println(y);
	
	
org.openqa.selenium.Point co=Ele.getLocation();
	System.out.println();
	System.out.println(co.x);
	System.out.println(co.y);
	
	}
}
