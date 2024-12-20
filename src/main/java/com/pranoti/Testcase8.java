package com.pranoti;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		List<WebElement> dropdowns=driver.findElements(By.cssSelector("select[class=\"dropdown-menu-lists\"]"));
		
		for(WebElement dropdown:dropdowns) {
			System.out.println(dropdown.toString());
			Select select=new Select(dropdown);
			select.selectByIndex(2);
			
		}

	}

}
