package com.task_infomats;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class FlipkartDemo {
	WebDriver d;
	
	@Test
	public void login() throws InterruptedException {
		
		d.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
        
		//d.findElement(By.className("_2doB4z")).click();
		
	
		
		d.findElement(By.xpath("//span[contains(text(),'Enter Email/Mobile number')]/../..//input")).sendKeys("+917034250002");// Enter USERNAME  //(//input[@type=\"text\"])[2]
		Thread.sleep(3000);

		//d.findElement(By.id("continue")).click();
		//Thread.sleep(2000); //input[class='_2IX_2- VJZDxU']

		d.findElement(By.xpath("//span[contains(text(),'Enter password')]/../..//input")).sendKeys("1996aug25");// Enter PASSWORD
		Thread.sleep(3000);

		d.findElement(By.xpath("//span[contains(text(),'Login')]/../..//button")).click(); // Enter Login  
		Thread.sleep(3000);
	}

	
    @Ignore
	@Test(priority = 1)
	public void Iphone14() throws InterruptedException {

		// Search Product and Add to Cart
		Select dropdown = new Select(d.findElement(By.id("searchDropdownBox")));
		dropdown.selectByValue("search-alias=electronics");
		Thread.sleep(2000);

		// Iphone 14

		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14 ");
		Thread.sleep(2000);

		d.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();// Click Search Button
		Thread.sleep(2000);

		// Declaring URL in String

		String urlToOpen = "https://www.amazon.in/sspa/click?ie=UTF8&spc=MToxNzEyMzg5MTU2Njk0MTAzOjE2NjYzNjcwNjI6c3BfYXRmOjIwMDc3MzUyNzI2NDk4OjowOjo&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&url=%2FApple-iPhone-14-128GB-Blue%2Fdp%2FB0BDK62PDX%2Fref%3Dsr_1_1_sspa%3Fcrid%3D1SGFOV972SAGN%26keywords%3Diphone%2B14%26qid%3D1666367062%26qu%3DeyJxc2MiOiI1LjM2IiwicXNhIjoiNS4wNyIsInFzcCI6IjIuOTcifQ%253D%253D%26s%3Delectronics%26sprefix%3Dip%252Celectronics%252C375%26sr%3D1-1-spons%26psc%3D1";

		d.navigate().to(urlToOpen);
		Thread.sleep(2000);

		d.findElement(By.id("add-to-cart-button")).click();// Add to cart
		Thread.sleep(2000);

		d.findElement(By.id("attach-close_sideSheet-link")).click();// Closing a side sheet
		Thread.sleep(2000);

		d.findElement(By.xpath("//a[@aria-label='Amazon']")).click();
		Thread.sleep(2000);

	}


	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		d = new ChromeDriver();

		d.manage().window().maximize();

		d.get("https://www.flipkart.com/"); // Launch URL
		Thread.sleep(2000);
		
		Actions actions =  new Actions(d);
		Action action = actions.sendKeys (Keys.ESCAPE).build();
		action.perform();
	}

	@AfterClass
	public void afterClass() {
		d.close();
	}
	

}
