package com.infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver.exe");//
		WebDriver d =new FirefoxDriver ();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		Thread.sleep(5000);
		d.manage().window().maximize();
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admi");
		Thread.sleep(5000);
		d.findElement(By.name("Button3")).click();
		Thread.sleep(5000);
		d.switchTo().alert().accept();
		d.close();
	}

}
