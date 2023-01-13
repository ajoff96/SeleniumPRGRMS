package com.infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		driver = new ChromeDriver();
		// IFrame & MainFrame
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(0);// frame(1) cause to find element error

		WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider')]"));
		Thread.sleep(5000);

		for (int i = 1; i <= 80; i++) {
			slider.sendKeys(Keys.ARROW_RIGHT);

		}
		Thread.sleep(5000);
		for (int i = 80; i >= 30; i--) {
			slider.sendKeys(Keys.ARROW_LEFT);

		}
		
		
	/*driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		WebElement sliderpoint = driver.findElement(By.id("slider"));
		Thread.sleep(2000);

		new Actions(driver).clickAndHold(sliderpoint).moveByOffset(500, 0).release();

		WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(slider1, 30, 0).build();
		((Actions) action).perform();
		driver.close();
*/
	}
}
