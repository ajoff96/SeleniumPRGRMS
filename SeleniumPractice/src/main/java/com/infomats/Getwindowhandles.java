package com.infomats;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.navigate().to("http://testleaf.herokuapp.com/pages/Window.html");

		d.manage().window().maximize();

		String Parentwindow = d.getWindowHandle();// getting the properties of window
		System.out.println(Parentwindow);

		d.findElement(By.xpath("//button[@id='home']")).click();
		//ctrl+2,l
		Set<String> childwindow = d.getWindowHandles();

		for (String handles : childwindow) {
			d.switchTo().window(handles);
		}
		Thread.sleep(6000);
		d.findElement(By.xpath("//img[@src='images/edit.png']")).click();// click edit
		Thread.sleep(10000);// EDIT
		d.close();// child window close

		Thread.sleep(6000);
		d.switchTo().window(Parentwindow);

		d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();

		int number = d.getWindowHandles().size();// when getting xpath we need find the size
		System.out.println("NO OF OPENED WINDOWS=" + number);// COUNT

		Set<String> multiplewindows = d.getWindowHandles();

		for (String child : multiplewindows) {
			if (!child.equals(Parentwindow)) // !-Not operator
			{
				d.switchTo().window(child);
				Thread.sleep(4000);
				d.close();
			}
		}
		d.switchTo().window(Parentwindow);
		Thread.sleep(4000);
		d.findElement(By.xpath("//*[@id=\"color\"]")).click();

	}

}
