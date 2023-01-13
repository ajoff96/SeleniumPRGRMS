package com.infomats;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/home.html");
        driver.manage().window().maximize();
        Thread.sleep(500);
        
        driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
        System.out.println("Dropdown using index value");
        Select drpdown = new Select (driver.findElement(By.id("dropdown1")));
        drpdown.selectByIndex(1);
        WebElement firstSelectedOption = drpdown.getFirstSelectedOption();
        String selectedoption= firstSelectedOption.getText();
        System.out.println("Selected Option is :" +selectedoption );
        System.out.println();
        System.out.println("Dropdown using text");
       // Select select1 = new Select(driver.findElement(By.xpath("//select[@name=\"dropdown2\"]")));

	}

}
