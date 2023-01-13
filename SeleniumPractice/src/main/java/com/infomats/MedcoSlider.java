package com.infomats;

import javax.swing.JSlider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MedcoSlider {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://demo.smart-hospital.in/site/login");
		d.findElement(By.name("username")).sendKeys("jason@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("password");
		// Click Login
		d.findElement(By.xpath("//button[text()='Sign In']")).click();

		Thread.sleep(2000);
		
//		WebElement slider = d.findElement(By.cssSelector("body.skin-blue.fixed.sidebar-mini.sidebar-open:nth-child(2) div.wrapper:nth-child(2) aside.main-sidebar.affix-top:nth-child(3) div.slimScrollDiv > div.slimScrollBar"));
//
//		WebElement value = d.findElement(By.id("sidebar"));
//		
//		Actions move = new Actions(d);
//		move.dragAndDropBy(slider, 0, 40);
		
//		JavascriptExecutor js = (JavascriptExecutor) d;
//
//		js.executeScript("window.scrollBy(0,250)");
//
//		Thread.sleep(10000);
		
		 JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 50);

		    // Set the value of the slider to 75
		    slider.setValue(75);
}
}