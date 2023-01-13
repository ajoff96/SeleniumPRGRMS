package com.task_infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/"); //Launch URL
		Thread.sleep(3000);
		
		//Login For Amazon
		
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(3000);
		d.findElement(By.name("email")).sendKeys("+917034250002");
		Thread.sleep(3000);
		d.findElement(By.id("continue")).click();
		d.findElement(By.name("password")).sendKeys("1996aug25");
		Thread.sleep(3000);
		d.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		
		//ADD New Address
		
		d.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[28]/a")).click();
		Thread.sleep(3000);
		//d.findElement(By.xpath("//a[@href='https://www.amazon.in/a/addresses?ref_=ya_d_c_addr']")).click();
		d.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a")).click();
		Thread.sleep(3000);
		d.findElement(By.id("ya-myab-address-add-link")).click();
	}

}
//when we wiil go automation?
//what is the adv and disadv of automation testing?