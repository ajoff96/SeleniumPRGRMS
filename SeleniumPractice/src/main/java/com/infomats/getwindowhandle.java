package com.infomats;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandle {

	

	public static void main(String[] args) throws InterruptedException
	{
	       System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
	      WebDriver d=new ChromeDriver();
	      
	      d.navigate().to("http://testleaf.herokuapp.com/pages/Window.html");
	      d.manage().window().maximize();
	      
	      String Parentwindow =d.getWindowHandle();// getting the properties of the window
	      System.out.println(Parentwindow);
	      
	      d.findElement(By.xpath("//*[@id=\"home\"]")).click();
	      Set<String> childwindow = d.getWindowHandles();
	      
	      for ( String handles : childwindow )
	      {
			d.switchTo().window(handles);
			
	      }
	      
	      Thread.sleep(6000);
	      
	      d.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
	      Thread.sleep(6000);
	      d.close();//child window close
	      
	      Thread.sleep(6000);
	      d.switchTo().window(Parentwindow);
	      
	      d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
	      int number =d.getWindowHandles().size();
	      System.out.println("No Of Opened Window= "+ number);
	      
	      Set<String> multiplewindow =d.getWindowHandles();
	      
	      for (String child : multiplewindow){
	    	 
			if(!child.equals(Parentwindow)){
				d.switchTo().window((String) child);
				Thread.sleep(4000);
				d.close();
			}
				
	      }
	      d.switchTo().window(Parentwindow);
	      Thread.sleep(500);
	      d.findElement(By.xpath("//*[@id=\"color\"]")).click();

	      
	      
	       
	}

}
