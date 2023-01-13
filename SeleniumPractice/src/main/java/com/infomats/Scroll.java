package com.infomats;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.manage().window().maximize();

		d.get("http://demo.guru99.com/test/guru99home/");

		Thread.sleep(5000);

		d.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) d;

		js.executeScript("window.scrollBy(0,2500)");

		Thread.sleep(10000);

		js.executeScript("window.scrollBy(0,-1000)");

		Thread.sleep(10000);

		js.executeScript("window.scrollBy(0,-700)");

		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,2500)");

	}

}
