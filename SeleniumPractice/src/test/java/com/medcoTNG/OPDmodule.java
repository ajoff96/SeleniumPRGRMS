package com.medcoTNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OPDmodule {

	WebDriver d;

	@Test(enabled = true)
	public void login() throws InterruptedException {

		d.findElement(By.name("username")).sendKeys("jason@gmail.com");
		Thread.sleep(2000);

		d.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);

		// Click Login
		d.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);

	}
	@Ignore
	@Test
	public void Opdmodule() throws InterruptedException {

		/*
		 * d.findElement(By.xpath("//i[@class='fa fa-user ispace']")).click();
		 * Thread.sleep(2000);
		 * d.findElement(By.xpath("//button[@type='submit']")).click();
		 * Thread.sleep(2000);
		 */

		// d.findElement(By.xpath("//i[@class='fas fa-file-invoice']")).click();
		// Thread.sleep(2000);

		d.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bill/dashboard']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bill/opd']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='box-tools addmeeting box-tools-md']//a[@id='add']")).click();
		Thread.sleep(2000);

		String parentwindow = d.getWindowHandle();
		System.out.println(parentwindow);
		d.findElement(By.xpath("//span[normalize-space()='New Patient']")).click();

		Set<String> childwindow = d.getWindowHandles();
		for (String handles1 : childwindow) {
			d.switchTo().window(parentwindow);
			Thread.sleep(2000);
			d.findElement(By.id("name")).sendKeys("Godwin2");
			Thread.sleep(2000);
			d.findElement(By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6']//input[@name='guardian_name']"))
					.sendKeys("suman");
			Thread.sleep(2000);

			d.findElement(By.xpath("//select[@id='addformgender']")).click();
			WebElement Gender = d.findElement(By.xpath("//select[@id='addformgender']"));
			Select z = new Select(Gender);
			z.selectByIndex(1);
			Thread.sleep(2000);

			String month = "February 2001";
			String day = "20";
			d.findElement(By.id("birth_date")).click();
			Thread.sleep(2000);

			while (true) {
				String text = d.findElement(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[2]")).getText();
				if (text.equals(month)) {
					break;
				} else {
					d.findElement(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[1]")).click();
				}
			}

			d.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[4]/td[3]")).click();
			Thread.sleep(10000);
			d.findElement(By.xpath("//div[@class='col-sm-3']//select[@name='blood_group']")).click();
			Thread.sleep(2000);

			WebElement bloodgroup = d.findElement(By.xpath("//div[@class='col-sm-3']//select[@name='blood_group']"));
			Select s = new Select(bloodgroup);
			s.selectByIndex(8);
			Thread.sleep(2000);

			d.findElement(By.xpath("//div[@class='col-md-6 col-sm-12']//select[@name='marital_status']")).click();
			Thread.sleep(2000);
			WebElement Maritalstatus = d
					.findElement(By.xpath("//div[@class='col-md-6 col-sm-12']//select[@name='marital_status']"));
			Select v = new Select(Maritalstatus);
			v.selectByIndex(1);
			Thread.sleep(2000);

			WebElement ss = d.findElement(
					By.xpath("//div[@class='col-sm-6']//div[@class='form-group']//div//input[@id='file']"));
			ss.sendKeys("C:\\Users\\HP\\Pictures\\DP Dimension.jpg");
			Thread.sleep(2000);

			d.findElement(By.xpath("//input[@id='number']")).sendKeys("8675878242");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='addformemail']")).sendKeys("bolta@gmail.com");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name='address']")).sendKeys("9/112,Andarvilai");
			Thread.sleep(2000);
			d.findElement(By.xpath("//textarea[@id='note']")).sendKeys("no");
			Thread.sleep(2000);
			d.findElement(By.xpath("//textarea[@name='known_allergies']")).sendKeys("yes");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name='insurance_id']")).sendKeys("675");
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"formaddpa\"]/div[1]/div/div/div/div/div/div[11]/div/input")).click();
			d.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[3]/td[3]")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@name='identification_number']")).sendKeys("6595");
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='custom_fields[patient][3]']")).sendKeys("6576894395");
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"formaddpabtn\"]")).click();
			Thread.sleep(2000);
		}
	}

	@Test(priority=3)

	public void Search_and_ADD_Appoinment() throws InterruptedException {
	
		
		d.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bill/dashboard']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/bill/opd']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//div[@class='box-tools addmeeting box-tools-md']//a[@id='add']")).click();
		Thread.sleep(2000);


		d.findElement(By.xpath("//*[@id=\"admission_date\"]")).click();
		d.findElement(By.xpath("//td[@class='day'][normalize-space()='30']")).click();
		Thread.sleep(2000);

		WebElement doc = d.findElement(By.name("consultant_doctor"));
		Select x = new Select(doc);
		x.selectByValue("11");
		Thread.sleep(2000);

		WebElement ch = d.findElement(By.name("charge_category"));
		Select e = new Select(ch);
		e.selectByValue("2");
		Thread.sleep(10000);
		
		WebElement id = d.findElement(By.xpath("//select[@name='charge_id']"));
		Select n = new Select(id);
		n.selectByValue("8");
		Thread.sleep(10000);

		WebElement pay = d.findElement(By.name("payment_mode"));
		Select j = new Select(pay);
		j.selectByValue("transfer_to_bank_account");
		Thread.sleep(2000);

		WebElement live = d.findElement(By.name("live_consult"));
		Select l = new Select(live);
		l.selectByValue("yes");
		Thread.sleep(2000);

		WebElement old = d.findElement(By.name("old_patient"));
		Select uu = new Select(old);
		uu.selectByValue("yes");
		Thread.sleep(2000);

		d.findElement(By.xpath("//*[@id=\"formadd\"]/div[2]/div/div/div/div/div/div[6]/div/div/input")).sendKeys("no");
		Thread.sleep(10000);

		//d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

	//	d.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(2000);

	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		d = new ChromeDriver();
		// d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(1000);
		// Launch URL
		d.get("https://demo.smart-hospital.in/site/login");
		Thread.sleep(2000);
	}

	@AfterClass
	public void afterClass() {
		// d.close();
	}

}
