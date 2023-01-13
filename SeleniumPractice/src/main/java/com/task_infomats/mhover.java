package com.task_infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mhover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://demoqa.com/menu/"); 
		//ctrl+2, l
		Actions a=new Actions(d);
		WebElement mainmanu = d.findElement(By.xpath("//a[text()='Main Item 2']"));
		a.moveToElement(mainmanu).perform();
		Thread.sleep(3000);
		
		WebElement submanu = d.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		a.moveToElement(submanu).perform();
		Thread.sleep(3000);
		
		WebElement submanuitem2 = d.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
		submanuitem2.click();
		
	}

}
