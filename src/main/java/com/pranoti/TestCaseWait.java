package com.pranoti;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com");
		
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("contact_us"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("login-portal"));
		
		//EXPLICIT WAIT
		
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("login-portal")));
	
	//FLUENT WAIT
	
	Wait<WebDriver> fluentWait=new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(Exception.class);
	
	fluentWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("login-portal")));
	
	
		
	}

}
