package com.tsng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Customer_management {
	WebDriver d;
	  @Test(priority=3)
	  public void fvalid() throws InterruptedException {

		  WebElement user=d.findElement(By.xpath("//*[@id=\"txt_unam\"]"));  //*[@id="txt_unam"]
		  user.sendKeys("sylix");
		  Thread.sleep(3000);
		 			
		  WebElement pwd=d.findElement(By.xpath("//input[@id='txt_pass']"));  
		  pwd.sendKeys("admin");
		  Thread.sleep(3000);
		 
		  WebElement Login=d.findElement(By.xpath("//*[@id=\"Button3\"]"));
		  Login.click();
		 

	  }
	  @Test(priority=2)
	  public void finvalid() {

		  WebElement user=d.findElement(By.xpath("//input[@id='txt_unam']"));
		  user.sendKeys("45lix");
		  
		 			
		  WebElement pwd=d.findElement(By.xpath("//input[@id='txt_pass']"));
		  pwd.sendKeys("123min");
		 
		  WebElement Login=d.findElement(By.xpath("//*[@id=\"Button3\"]"));
		  Login.click();
		  
		  d.switchTo().alert().accept();
		 

	  }
	  @Test(priority=1)
	  public void fillegal() {

		  WebElement user=d.findElement(By.xpath("//input[@id='txt_unam']"));
		  user.sendKeys("$ylix");
		 			
		  WebElement pwd=d.findElement(By.xpath("//input[@id='txt_pass']"));
		  pwd.sendKeys("@dmin");
		 
		  WebElement Login=d.findElement(By.xpath("//*[@id=\"Button3\"]"));
		  Login.click();
		  d.switchTo().alert().accept();

	  }
	  @Test(enabled=true)
	  public void fnull() {

		  WebElement user=d.findElement(By.xpath("//input[@id='txt_unam']"));
		  user.sendKeys(" ");
		  
		 			
		  WebElement pwd=d.findElement(By.xpath("//input[@id='txt_pass']"));
		  pwd.sendKeys(" ");
		 
		  WebElement Login=d.findElement(By.xpath("//*[@id=\"Button3\"]"));
		  Login.click();
		  d.switchTo().alert().accept();

	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
		   d = new ChromeDriver();
		  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		  d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  d.manage().window().maximize();
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  d.close();
	  }
}
