package com.tsng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NGBasic {
	WebDriver d;

	@Test
	public void f() throws InterruptedException {
		d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
		d.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("admin");
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();

	}

	@BeforeClass (alwaysRun=true)
	public void beforeClass() throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		 d = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "D:\\Firefox\\geckodriver.exe");
		//WebDriver d = new FirefoxDriver();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		Thread.sleep(5000);
		d.manage().window().maximize();

	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		d.close();
	}

}
