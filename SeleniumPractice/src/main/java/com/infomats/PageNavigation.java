package com.infomats;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
      WebDriver d =new ChromeDriver();
      d.manage().window().maximize();

		//Page Navigation
		d.get("https://www.amazon.in/");
		d.get("https://www.flipkart.com/");
		d.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007810%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAsdKbBhDHARIsANJ6-jeeOSdCKPMle3tgwMx0r6EMCSMH5Y1tc0CPfBbzB4s-6KJMOvyO59QaAtsyEALw_wcB");
		
		d.navigate().back();
		Thread.sleep(500);
		d.navigate().back();
		Thread.sleep(500);
		
		d.navigate().forward();
		Thread.sleep(500);
		d.navigate().forward();
		Thread.sleep(500);

	}

}
