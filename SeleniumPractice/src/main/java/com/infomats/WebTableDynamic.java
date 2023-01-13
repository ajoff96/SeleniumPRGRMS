package com.infomats;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDynamic {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");

		  WebDriver d = new ChromeDriver();
		  d.get("https://demo.guru99.com/test/web-table-element.php");
		  d.manage().window().maximize();
		  
		  List col = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	      System.out.println("No of cols are : " +col.size()); 
		  
	        List  rows = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td")); 
	       
	        System.out.println("No of rows are : " + rows.size());

		
	        for (int i=1;i<=20;i++) {
	        	
	        d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]/a")).click();
	        Thread.sleep(8000);
	        d.navigate().back();

		
		
		
	}

	}
}
