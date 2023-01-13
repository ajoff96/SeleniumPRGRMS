package com.task_infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		//d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		d.get("https://www.flipkart.com");

		d.manage().window().maximize();

		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7034250002");

		d.findElement(By.xpath("//input[@type='password']")).sendKeys("ajithup");

		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}
}
