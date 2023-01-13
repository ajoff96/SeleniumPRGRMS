package com.medcoTNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Billing {

	WebDriver d;

	@Test(enabled = true)
	public void login() throws InterruptedException {

		d.findElement(By.name("username")).sendKeys("jason@gmail.com");
		Thread.sleep(2000);

		d.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);

		// Click Login
		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);

	}

	@Test

	public void BillingMod() throws InterruptedException {

		d.findElement(By.xpath("//i[@class='fa fa-user ispace']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bill/dashboard']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bill/opd']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("//div[@class='box-tools addmeeting box-tools-md']//a[@id='add']")).click();
		Thread.sleep(2000);

		String parentwindow = d.getWindowHandle();
		//System.out.println(parentwindow);
		d.findElement(By.xpath("//span[normalize-space()='New Patient']")).click();

		Set<String> childwindow = d.getWindowHandles();
		for (String handles1 : childwindow) {
			d.switchTo().window(parentwindow);
			Thread.sleep(2000);
		}
			d.findElement(By.id("name")).sendKeys("Godwin");
			Thread.sleep(2000);

			d.findElement(By.xpath("//input[@id='age_year']")).sendKeys("2001");
			d.findElement(By.xpath("//input[@id='age_month']")).sendKeys("02");
			d.findElement(By.xpath("//input[@id='age_day']")).sendKeys("20");
			Thread.sleep(2000);

			d.findElement(By.xpath("//input[@id='number']")).sendKeys("88701728791");
			Thread.sleep(2000);

			d.findElement(By.xpath("//input[@id='addformemail']")).sendKeys("godwin@gmail.com");
			Thread.sleep(2000);

			d.findElement(By.xpath("//div[@class='col-sm-3']//select[@name='blood_group']")).click();

			WebElement bloodgroup = d.findElement(By.xpath("//div[@class='col-sm-3']//select[@name='blood_group']"));

			Select s = new Select(bloodgroup);
			s.selectByIndex(8);
			Thread.sleep(2000);

			d.findElement(By.xpath("//div[@class='col-md-6 col-sm-12']//select[@name='marital_status']")).click();
			Thread.sleep(2000);

			WebElement Maritalstatus = d.findElement(By.xpath("//div[@class='col-md-6 col-sm-12']//select[@name='marital_status']"));
					
			Select v = new Select(Maritalstatus);
			v.selectByIndex(1);
			Thread.sleep(2000);

			d.findElement(By.xpath("//button[@id='formaddpabtn']")).click();
			Thread.sleep(2000);

			d.findElement(By.xpath("//input[@id='admission_date']")).click();
			d.findElement(By.xpath("//td[@class='day weekend'][normalize-space()='25']")).click();
			Thread.sleep(2000);

			d.findElement(By.xpath("//input[@id='apply_charge']")).sendKeys("525");

		}
	

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		d = new ChromeDriver();
		// Launch URL
		d.get("https://demo.smart-hospital.in/site/login");
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
		// d.close();
	}

}
