package com.infomats;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class incognito {

	public static void main(String[] args) 

	 
		   {
		      System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
		      // configure options parameter to Chrome driver
		      ChromeOptions o= new ChromeOptions();
		      // add Incognito parameter
		      o.addArguments("--incognito");
		      // DesiredCapabilities object
		      DesiredCapabilities c = DesiredCapabilities.chrome();
		      //set capability to browser
		      c.setCapability(ChromeOptions.CAPABILITY, o);
		      
		      WebDriver driver = new ChromeDriver(o);
		      driver.get("https://www.tutorialspoint.com/index.htm ");
		   }
		
	}


