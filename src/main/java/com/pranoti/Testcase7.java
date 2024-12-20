package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));

		select.selectByIndex(1);

		// WebElement checkbox=driver.findElement(By.id("checkboxes"));

		driver.findElement(By.cssSelector("#checkboxes > label:nth-child(1) > input[type=checkbox]")).click();

		WebElement one = driver.findElement(By.cssSelector("#checkboxes > label:nth-child(3) > input[type=checkbox]"));
		one.click();
		System.out.println(one.isSelected());
		driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]")).click();
		driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5) > input[type=checkbox]")).click();
		driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7) > input[type=checkbox]")).click();

		WebElement check = driver.findElement(By.cssSelector("#radio-buttons > input[type=radio]:nth-child(1)"));
		check.click();
		System.out.println(check.isSelected());
		// driver.findElement(By.cssSelector("#radio-buttons >
		// input[type=radio]:nth-child(2)")).click();

	}

}
