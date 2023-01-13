package com.task_infomats;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Amazon_AddAdressTest {
	WebDriver d;
  @Test
       //ADD New Address
	public void NewAddress() throws InterruptedException 
  {
		d.findElement(By.id("nav-hamburger-menu")).click();//Click All Menu
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[28]/a")).click();//Click Your Account
		Thread.sleep(3000);
		d.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a")).click();//Click Your Address
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@id='ya-myab-address-add-link']")).click();//Click Add Address
	
  }

  
  public void f() throws InterruptedException {
	  d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(3000);
		d.findElement(By.name("email")).sendKeys("+917034250002");
		Thread.sleep(3000);
		d.findElement(By.id("continue")).click();
		d.findElement(By.name("password")).sendKeys("1996aug25");
		Thread.sleep(3000);
		d.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
	   
	    d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/"); //Launch URL
		
		Thread.sleep(3000);
		
  }

  @AfterClass
  public void afterClass() {
	  d.close();
	  
  }

}
