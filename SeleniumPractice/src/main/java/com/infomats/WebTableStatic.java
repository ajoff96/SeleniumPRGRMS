package com.infomats;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableStatic {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");

		  WebDriver d = new ChromeDriver();
		  d.get("http://testleaf.herokuapp.com/pages/table.html");
		  Thread.sleep(4000);
		  d.manage().window().maximize();
		  
		  System.out.println("--------- All Data in Table-------------");
		  
		  List<WebElement> lw = d.findElements(By.xpath("//table/tbody/tr/td"));
		  
		  for(WebElement td:lw) {
			  String tabletext=td.getText();
			  System.out.println(tabletext+ "\t");
		  }
		  System.out.println();
			System.out.println("Row Data in Table");
			List<WebElement> tr5 = d.findElements(By.xpath("//table/tbody/tr[4]/td"));
			
			for(WebElement tr:tr5) {
				String rd=tr.getText();
				System.out.print(rd+"   ");
			}
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
			  /* d.get("http://testleaf.herokuapp.com/pages/table.html");
			Thread.sleep(10000);
			d.manage().window().maximize();
			
			System.out.println("All Data in Table");
			List<WebElement> tall = d.findElements(By.xpath("//table/tbody/tr/td"));
			
			for(WebElement td:tall) {
				String tabletext= td.getText();
				System.out.println(tabletext+"\t");
			}
			System.out.println();
			System.out.println("Row Data in Table");
			List<WebElement> tr5 = d.findElements(By.xpath("//table/tbody/tr[5]/td"));
			
			for(WebElement tr:tr5) {
				String rd=tr.getText();
				System.out.print(rd+"   ");
			}
	*/
		}

	


	

}
