package org.tcs.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BISHVA\\Desktop\\Java Selenium\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	//To Search the product
	 WebElement e = driver.findElement(By.xpath("xpathExpression"));
	 e.sendKeys("iphonex");
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 //To select and move the product to cart
	 WebElement src = driver.findElement(By.xpath("xpathExpression"));
	 WebElement des = driver.findElement(By.xpath("xpathExpression"));
	 Actions acc = new Actions(driver);
	 acc.dragAndDrop(src, des).perform();
	 
	 //To print the cost
	 WebElement p = driver.findElement(By.xpath("xpathExpression"));
	 String text = p.getText();
	 System.out.println(text);
	 }

}
