package com.tsng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class MedSlider {
 WebDriver d;
 
 
 @BeforeMethod
 public void setup() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://demo.smart-hospital.in/site/login");
		d.findElement(By.name("username")).sendKeys("jason@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("password");
		// Click Login
		d.findElement(By.xpath("//button[text()='Sign In']")).click();

	 
 }
 
 
 public void Teardown() {
	 
	 
 }
 
 @Test
 public void dragdownSlider(){
		WebElement slider = d.findElement(By.cssSelector("body.skin-blue.fixed.sidebar-mini.sidebar-open:nth-child(2) div.wrapper:nth-child(2) aside.main-sidebar.affix-top:nth-child(3) div.slimScrollDiv > div.slimScrollBar"));

		//WebElement value = d.findElement(By.id("sidebar"));
		
		Actions move = new Actions(d);
		move.dragAndDropBy(slider, 0, 40).perform();
	 
 }
  
}
