package com.pranoti;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_11_Confirm_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		WebElement clickon = driver.findElement(By.id("button4"));
		clickon.click();
		Alert alert = driver.switchTo().alert();

		alert.accept();
		if (clickon.getText() == "You pressed OK!") {
			System.out.println("Test case pass");
		}
		Thread.sleep(1000);

		clickon.click();
		alert.dismiss();
		if (clickon.getText() == "You pressed Cancel!") {
			System.out.println("Test case pass");

		}

	}

}
