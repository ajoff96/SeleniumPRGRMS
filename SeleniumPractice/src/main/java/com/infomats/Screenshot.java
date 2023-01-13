package com.infomats;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		//d.get("https://www.amazon.in/"); //Launch URL
		d.get("https://jqueryui.com/tooltip/");
		Thread.sleep(3000);
		
		 //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)d);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Screenshot\\homepageerror.png");

                //Copy file at destination

               // FileUtils.copyFile(SrcFile, DestFile);
                FileHandler.copy(SrcFile, DestFile);
                
	}

}
