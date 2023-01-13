package com.medcoTNG;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Doctorwise {
	WebDriver d;

	@Test(alwaysRun=true , groups = { "SanityTesting" })

	public void loginHospital() throws InterruptedException {

		d.findElement(By.name("username")).sendKeys("jason@gmail.com");

		d.findElement(By.name("password")).sendKeys("password");

		d.findElement(By.xpath("//button[text()='Sign In']")).click();

		Thread.sleep(2000);

	}

	@Test(priority=2, groups = { "SmokeTesting" })

	public void Appointment() throws InterruptedException {

		Thread.sleep(2000);

		d.findElement(By.xpath("//span[text()='Appointment']")).click();

		Thread.sleep(2000);

		d.findElement(By.xpath("//a[text()=' Doctor Wise']")).click();
		Thread.sleep(2000);

		WebElement wise = d.findElement(By.id("doctor"));

		Thread.sleep(2000);

		Select s = new Select(wise);

		s.selectByValue("11");

		Thread.sleep(2000);

		d.findElement(By.xpath("(//input[@type='text'])[3]")).click();

		Thread.sleep(2000);

		d.findElement(By.xpath("//td[text()='15']")).click();

		Thread.sleep(2000);

		d.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

		Thread.sleep(2000);

		String index = "https://demo.smart-hospital.in/admin/appointment/index";
		d.navigate().to(index);

	}

	@BeforeClass (alwaysRun=true)
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		d = new ChromeDriver();

		d.get("https://demo.smart-hospital.in/site/login#");
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
	}

}
