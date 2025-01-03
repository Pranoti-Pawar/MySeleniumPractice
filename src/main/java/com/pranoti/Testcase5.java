package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("Python");
		driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.ENTER);
	
		
		//getcurrenturl
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		
		//getTitle
		
		String title=driver.getTitle();
		if(title.equals("python - google Search")) {
			System.out.println("Test case pass ....");
		}
		else {
			System.out.println("Test case fail...");
		}
		
		
		//browser back
		
		driver.navigate().back();
		title=driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Test case pass ....");
		}
		else {
			System.out.println("Test case fail...");
		}
		
		//Browser forword
		driver.navigate().forward();
		title=driver.getTitle();
		if(title.equals("python - google Search")) {
			System.out.println("Test case pass ....");
		}
		else {
			System.out.println("Test case fail...");
		}
		driver.close();
			
		}
		
		
		

	}


