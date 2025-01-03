package com.pranoti;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase_10_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.findElement(By.id("button1")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		if(alert.getText()=="I am an alert box!") {
			System.out.println("Test case pass");
		}
	}
	
}