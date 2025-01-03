package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9_AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		
		driver.findElement(By.id("button2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"btn btn-default\"]")).click();
		

}}
