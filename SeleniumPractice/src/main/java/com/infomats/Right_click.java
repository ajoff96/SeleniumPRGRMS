package com.infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Right_click {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		Actions action1 = new Actions(driver);
		
		//long time wait
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".context-menu-one")));
			
		WebElement rightClickElement = driver.findElement(By.cssSelector(".context-menu-one"));

		action1.contextClick(rightClickElement).build().perform();
		Thread.sleep(3000);
		WebElement rce = driver.findElement(By.cssSelector(".context-menu-icon-paste"));
		Thread.sleep(3000);
		rce.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();

		Alert alert = (Alert) driver.switchTo().alert();
		String AText = ((WebElement) alert).getText();
		System.out.println(AText);
		((org.openqa.selenium.Alert) alert).accept();
		
		
		// By locator =
				// By.cssSelector(".context-menu-one");//span[@class='context-menu-one btn
				// btn-neutral']
						
		// driver.findElement(By.cssSelector(".context-menu-icon-edit")).click();
		// WebElement getCopyText
		// =driver.findElement(By.cssSelector(".context-menu-icon-edit"));
		WebElement getCopyText1 = driver.findElement(By.name("Edit"));
		// getText() method to get the text value
		String GetText = getCopyText1.getText();
		// To print the value
		System.out.println(GetText);
		// To close the browser
		driver.close();

	}




	}


