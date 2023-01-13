package com.task_infomats;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_AddAdress {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/"); //Launch URL
		Thread.sleep(3000);
		
		
		//Login For Amazon
		
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(3000);
		
		d.findElement(By.name("email")).sendKeys("+917034250002");//Enter USERNAME
		Thread.sleep(3000);
		
		d.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		d.findElement(By.name("password")).sendKeys("1996aug25");//Enter PASSWORD
		Thread.sleep(3000);
		
		d.findElement(By.id("signInSubmit")).click();            //Enter Login
		Thread.sleep(3000);
		
		//ADD New Address
		
		d.findElement(By.id("nav-hamburger-menu")).click();//ALL menu Click
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[28]/a")).click();//Your Account Click
		Thread.sleep(3000);
		
		d.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a")).click();//Your Address click
		Thread.sleep(3000);
		
		d.findElement(By.id("ya-myab-address-add-link")).click();//Add Address 
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("AJITH UP");		
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("7034250002");		
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("686610");
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("Ullattil House , Mulakulam South");
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Peruva");
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-landmark")).sendKeys("Near CSI Church");
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("KOTTAYAM"); 
		Thread.sleep(2000);
		
		d.findElement(By.cssSelector("#address-ui-widgets-addr-details-address-type-and-business-hours")).click();
		Thread.sleep(2000);
		
		d.findElement(By.id("dropdown1_1")).click();
		Thread.sleep(2000);
		
		d.findElement(By.id("address-ui-widgets-form-submit-button")).click();
		Thread.sleep(2000);
		
		//Search Product and Add to Cart
		
		Select dropdown=new Select(d.findElement(By.id("searchDropdownBox")));
		dropdown.selectByValue("search-alias=electronics");
		Thread.sleep(2000);
		
		// Iphone 14
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14 ");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();//Click Search Button
		Thread.sleep(2000);
		
		//Declaring  URL in String
		
		String urlToOpen = "https://www.amazon.in/sspa/click?ie=UTF8&spc=MToxNzEyMzg5MTU2Njk0MTAzOjE2NjYzNjcwNjI6c3BfYXRmOjIwMDc3MzUyNzI2NDk4OjowOjo&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&url=%2FApple-iPhone-14-128GB-Blue%2Fdp%2FB0BDK62PDX%2Fref%3Dsr_1_1_sspa%3Fcrid%3D1SGFOV972SAGN%26keywords%3Diphone%2B14%26qid%3D1666367062%26qu%3DeyJxc2MiOiI1LjM2IiwicXNhIjoiNS4wNyIsInFzcCI6IjIuOTcifQ%253D%253D%26s%3Delectronics%26sprefix%3Dip%252Celectronics%252C375%26sr%3D1-1-spons%26psc%3D1";

		d.navigate().to(urlToOpen);
		Thread.sleep(2000);	
		
		d.findElement(By.id("add-to-cart-button")).click();//Add to cart		
		Thread.sleep(2000);	
		
		d.findElement(By.id("attach-close_sideSheet-link")).click();//Closing a side sheet
		Thread.sleep(2000);	
		
		d.findElement(By.xpath("//a[@aria-label='Amazon']")).click();
		Thread.sleep(2000);	
		
		//Airpods
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Airpos Pro ");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();//Click Search Button
		Thread.sleep(2000);
		
		String urlToOpen1="https://www.amazon.in/sspa/click?ie=UTF8&spc=MToxMDQ3NTc0MDI0MTE0OTkwOjE2NjY0NTk3Njc6c3BfYXRmOjIwMDc3MzU3Nzg2ODk4OjowOjo&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&url=%2FApple-AirPods-Pro-2nd-Generation%2Fdp%2FB0BDKD8DVD%2Fref%3Dsr_1_1_sspa%3Fkeywords%3Dairpods%2Bpro%26qid%3D1666459767%26qu%3DeyJxc2MiOiI0LjE3IiwicXNhIjoiMy40MyIsInFzcCI6IjQuNzIifQ%253D%253D%26sr%3D8-1-spons%26psc%3D1";
		d.navigate().to(urlToOpen1);
		Thread.sleep(2000);	
		
		d.findElement(By.id("add-to-cart-button")).click();//Add to cart		
		Thread.sleep(2000);	
		
		d.findElement(By.xpath("//a[@aria-label='Amazon']")).click();//Return to Home Page Of Amazon
		Thread.sleep(2000);	
		
		
		
		//Redmi Tv
		
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi Tv ");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();//Click Search Button
		Thread.sleep(2000);
		
		String urlToOpen2 ="https://www.amazon.in/sspa/click?ie=UTF8&spc=MTo4NTkzMzYwMDM1Njg1MzUyOjE2NjY0NTc5ODE6c3BfYXRmOjIwMDMyNDI0Nzk5Njk4OjowOjo&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&url=%2FRedmi-inches-Ultra-Android-L43R7-7AIN%2Fdp%2FB09RFC46VP%2Fref%3Dsr_1_1_sspa%3Fcrid%3D38XIMHY8GCUCP%26keywords%3DRedmi%2BTv%26qid%3D1666457981%26qu%3DeyJxc2MiOiIzLjIyIiwicXNhIjoiMi4zNCIsInFzcCI6IjEuMzQifQ%253D%253D%26sprefix%3Dredmi%2Btv%252Caps%252C423%26sr%3D8-1-spons%26psc%3D1";
		d.navigate().to(urlToOpen2);
		Thread.sleep(2000);	
		
		d.findElement(By.id("add-to-cart-button")).click();//Add to cart		
		Thread.sleep(2000);	
		
		d.findElement(By.id("attach-close_sideSheet-link")).click();//Closing a Side sheet
		Thread.sleep(2000);	
		
		d.findElement(By.xpath("//a[@aria-label='Amazon']")).click();//Return to Home Page Of Amazon
		Thread.sleep(2000);	
		
		//Cart Process
		
		d.findElement(By.id("nav-cart")).click(); //Click Cart
		Thread.sleep(2000);
		
		d.findElement(By.name("proceedToRetailCheckout")).click(); //Proceed to Checkout
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\"address-list\"]/div/div[1]/div/fieldset[2]/div[2]/span/div/label/input")).click();//Select address To Checkout
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\"shipToThisAddressButton\"]/span/input")).click();//Submit
		Thread.sleep(2000);
		
		d.navigate().back();
		Thread.sleep(2000);	
		d.findElement(By.xpath("//a[@aria-label='Amazon']")).click();//Return to Home Page Of Amazon
		Thread.sleep(2000);	
		
	}

}
