package com.infomats;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		WebElement we= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		a.doubleClick(we).perform();	
		Thread.sleep(500);
		Alert alrt = (Alert) driver.switchTo().alert();
		System.out.println("Double Click Alert message is  \n"+ ((Alert) alrt).getText());
		((org.openqa.selenium.Alert) alrt).accept();
        Thread.sleep(200);
        driver.quit();
        
		

	}

}
