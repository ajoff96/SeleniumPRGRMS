package com.infomats;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_Tip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		Actions a=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
		a.moveToElement(age).build().perform();
		//build ---used to perform pre-conditional actions
		Thread.sleep(5000);
		age.sendKeys("37");
		
		
		
		
		
		
	}

}
