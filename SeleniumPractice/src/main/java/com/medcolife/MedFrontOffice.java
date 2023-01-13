package com.medcolife;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedFrontOffice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Launch URL
		d.get("https://demo.smart-hospital.in/site/login");

		// Enters UserName and Password
		d.findElement(By.name("username")).sendKeys("jason@gmail.com");
		d.findElement(By.name("password")).sendKeys("password");

		// Click Login
		d.findElement(By.xpath("//button[text()='Sign In']")).click();

		Thread.sleep(2000);
		
		d.findElement(By.cssSelector("a[href='https://demo.smart-hospital.in/admin/visitors']")).click();
		

	}

}
