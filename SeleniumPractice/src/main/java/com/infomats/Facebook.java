package com.infomats;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
			
			WebDriver d = new ChromeDriver();
			
			d.manage().window().maximize();
			
			d.get("https://en-gb.facebook.com/");
			
			d.findElement(By.id("email")).sendKeys("+917034250002");
			
			
			Thread.sleep(50);
			
			d.findElement(By.id("pass")).sendKeys("1996aug25");
			
			Thread.sleep(150);
			
			d.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
			
			Thread.sleep(150);
			
			/*d.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")).click();
			
			Thread.sleep(150);
			
			d.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
			
			*/
		}

	}



