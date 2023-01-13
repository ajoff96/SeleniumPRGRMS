package com.infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException 
	{
				System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				String UploadURL = "http://demo.guru99.com/test/upload/";
		       
				
		        driver.get(UploadURL);
		        
		        WebElement we = driver.findElement(By.id("uploadfile_0"));
		       
		        we.sendKeys("D:\\Infomats Class Record\\Documents\\Manual Testing\\ACE MONEY SRS.docx");

		        Thread.sleep(500);
		        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		        Thread.sleep(500);
		        
		        driver.findElement(By.cssSelector("#submitbutton")).click();
		        
		        Thread.sleep(500);
			}

		

	

	}


