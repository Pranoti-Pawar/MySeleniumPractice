package com.pranoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement headerElement =driver.findElement(By.cssSelector("h2[name='contactme']"));
		String EleText=headerElement.getText();
		System.out.println(EleText);
		
		//sendkeeys
		
		WebElement first_name=driver.findElement(By.name("first_name"));
		first_name.sendKeys("Pranoti");
		
		//clear
		
		//first_name.clear();
		
		//getAttribute 
	//<input class="contact_button" type="submit" fdprocessedid="cqarv">
		
		WebElement submit_button=driver.findElement(By.cssSelector("input[class='contact_button][type='submit']"));
		String Ele=submit_button.getAttribute("value");
		System.out.println(Ele);
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
