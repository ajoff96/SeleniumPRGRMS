package com.infomats;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Refresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.navigate().to("https://www.flipkart.com/");
		;
		d.manage().window().maximize();

		Thread.sleep(3000);
		d.navigate().refresh();

		Thread.sleep(3000);
		d.navigate().refresh();

		Thread.sleep(3000);
		d.navigate().refresh();

	}

}
