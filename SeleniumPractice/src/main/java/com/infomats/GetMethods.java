package com.infomats;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
     
       WebDriver d= new ChromeDriver();
       
   	   d.manage().window().maximize();
   	   
   	   d.get("https://www.amazon.in/");
   	   
   	   Thread.sleep(1000);
   	   
       d.navigate().to("https://www.flipkart.com/");
       
       Thread.sleep(1000);
       
       d.navigate().to("https://en-gb.facebook.com/");
       
   	   Thread.sleep(1000);
      
       
        d.navigate().back();
       
		Thread.sleep(1000);
		
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		d.navigate().back();
		Thread.sleep(100);
		
		d.navigate().forward();
		Thread.sleep(100);
		
		String title = d.getTitle();
		System.out.println(title);
		
		d.navigate().forward();
		Thread.sleep(100);

		
	}

}
