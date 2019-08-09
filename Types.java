package org.tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BISHVA\\Desktop\\Java Selenium\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	WebElement b = driver.findElement(By.xpath("//input[@tabindex='9'"));
	b.sendKeys("oneplus 7");
	b.click();
	}
	

}
