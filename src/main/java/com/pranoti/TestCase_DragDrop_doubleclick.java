package com.pranoti;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_DragDrop_doubleclick {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://webdriveruniversity.com/Actions/index.html");
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	//test case 1 drag and drop
	WebElement dragable=driver.findElement(By.id("draggable"));
	WebElement dropable=driver.findElement(By.id("droppable"));
	Thread.sleep(2);
	WebElement para=dropable.findElement(By.tagName("p"));
	System.out.println(para.getText());
	
	actions.dragAndDrop(dragable, dropable).perform();
	System.out.println(para.getText());
	
	//test case 2 doubleclick
	
	WebElement dclick=driver.findElement(By.id("double-click"));
	System.out.println(dclick.getCssValue("color"));
	Thread.sleep(2);
	actions.doubleClick(dclick).perform();
	System.out.println(dclick.getCssValue("color"));
	
	
	//Test Case 3 Mouse hover
	
	WebElement mhover=driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
	
	actions.moveToElement(mhover).perform();
	Thread.sleep(2);
	driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a")).click();
	
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	

	

	
}
}
