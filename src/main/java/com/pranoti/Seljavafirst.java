package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seljavafirst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement  fname = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		fname.sendKeys("Pranoti");
		WebElement lname=driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		lname.sendKeys("Pawar");
		WebElement email=driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		email.sendKeys("pranoti12@gmail.com");
		WebElement cmt=driver.findElement(By.cssSelector("#contact_form > textarea"));
		cmt.sendKeys("COMMENT");
		WebElement butt=driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		butt.click();
	}

}
