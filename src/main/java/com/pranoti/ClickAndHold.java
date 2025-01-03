package com.pranoti;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAndHold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		
		WebElement clickAndHold =driver.findElement(By.id("click-box"));
		actions.clickAndHold(clickAndHold).perform();	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated((By.id("click-box")), "Well done! keep holding that click now....."));
		System.out.println(clickAndHold.getText());
		
	
		
		

	}

}
