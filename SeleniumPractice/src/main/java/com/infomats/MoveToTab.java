package com.infomats;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class MoveToTab {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.seleniumeasy.com/test/"); // get(0)

		Thread.sleep(3000);
		d.manage().window().maximize();

		((JavascriptExecutor) d).executeScript("window.open()");

		ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab2.get(1));
		d.get("http://google.com");
		Thread.sleep(3000);

		((JavascriptExecutor) d).executeScript("window.open()");

		ArrayList<String> tab3 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab3.get(2));
		d.get("http://google.com");
		Thread.sleep(3000);

		ArrayList<String> tab1R = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab1R.get(0));
		d.get("https://www.amazon.in");
		Thread.sleep(3000);

		ArrayList<String> tab2R = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab2R.get(1));
		d.get("https://www.flipkart.com");
		Thread.sleep(3000);

		ArrayList<String> tab3R = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab3R.get(2));
		Thread.sleep(3000);
		d.get("https://www.amazon.in/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84");
		Thread.sleep(6000);

	}

}
