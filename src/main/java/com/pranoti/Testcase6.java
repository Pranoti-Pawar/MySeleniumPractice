package com.pranoti;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Set<String> windowhandle = new TreeSet<String>();
		driver.get("http://webdriveruniversity.com");

		driver.findElement(By.id("contact-us")).click();
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("button-clicks")).click();

		windowhandle  = driver.getWindowHandles();

//		String window1 = (String) windowhandle.toArray()[0];
//		String window2 = (String) windowhandle.toArray()[1];
//		String window3 = (String) windowhandle.toArray()[2];
//		String window4 = (String) windowhandle.toArray()[3];

//		System.out.println(driver.switchTo().window(window1).getTitle());
//		System.out.println(driver.switchTo().window(window2).getTitle());
//		System.out.println(driver.switchTo().window(window3).getTitle());
//		System.out.println(driver.switchTo().window(window4).getTitle());
		
		ArrayList<String> win=new ArrayList<String>(windowhandle);
//		win.add(window1);
//		win.add(window4);
//		win.add(window3);
//		win.add(window2);
		System.out.println(win);
		for (String w : win) {
			System.out.println(driver.switchTo().window(w).getTitle());
		}
		

		//First window
		
		driver.switchTo().window(win.get(3));
		
		WebElement contact = driver.findElement(By.className("section_header"));
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("Pranoti");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Patil");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("pranoti@gmail.com");
		driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("first comment");

		//SECOND WINDOW
		
//		driver.switchTo().window(window3);
//		
//		WebElement uname = driver.findElement(By.id("text"));
//		uname.sendKeys("Samar");
//		WebElement pass = driver.findElement(By.id("password"));
//		pass.sendKeys("Samar");
//		driver.findElement(By.id("login-button")).click();

		//THIRD WINDOW
		
//		driver.switchTo().window(window2);
//		
//		driver.findElement(By.cssSelector("#button1 > p")).click();
//


	}

}
