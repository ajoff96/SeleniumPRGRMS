package com.infomats;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeofBrowser {


 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		
		
		// Default size
		Dimension currentDimension = d.manage().window().getSize();
		int height = currentDimension.getHeight();
		int width = currentDimension.getWidth();
		System.out.println("Current height: "+ height);
		System.out.println("Current width: "+width);
		
		Thread.sleep(5000);
		
		// Set new size
		Dimension newDimension = new Dimension(720, 1280);
		d.manage().window().setSize(newDimension);
		
		// Getting 
		Dimension newSetDimension = d.manage().window().getSize();
		int newHeight = newSetDimension.getHeight();
		int newWidth = newSetDimension.getWidth();
		System.out.println("Updated height: "+ newHeight);
		System.out.println("Updated width: "+newWidth);
	}
}

