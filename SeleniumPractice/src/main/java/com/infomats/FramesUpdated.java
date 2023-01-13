package com.infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesUpdated {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Frames.html");

		WebElement SFrame = d.findElement(By.xpath("//a[@href='#Single']"));
		SFrame.click();
		// ctrl+shift+f
		WebElement outerF = d.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		d.switchTo().frame(outerF);

		// single Frame Automation
		WebElement frame_Text = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame_Text.sendKeys("Testing");
		Thread.sleep(16000);

		// Main Frame / Iframe
		// Multiple Frame Automation
		d.switchTo().defaultContent();
		Thread.sleep(6000);

		d.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement IN_Frame = d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(IN_Frame);
		Thread.sleep(6000);
		WebElement in_most = d.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		d.switchTo().frame(in_most);
		WebElement frame_text2 = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame_text2.sendKeys("selenium");
		Thread.sleep(6000);
		d.switchTo().defaultContent();
	}

}
