package com.tsng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	  WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  d.findElement(By.id("email")).sendKeys("+917034250002");


	  Thread.sleep(5000);

	  d.findElement(By.id("pass")).sendKeys("1996aug25");

	  Thread.sleep(1500);

	  d.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();

	  Thread.sleep(1500);
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");

 d = new ChromeDriver();

	  d.manage().window().maximize();

	  d.get("https://en-gb.facebook.com/");
  }

  @AfterClass
  public void afterClass() {
	  d.close();
  }

}


