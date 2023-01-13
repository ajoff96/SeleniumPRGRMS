package com.medcoTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Appoinment {

	WebDriver d;

	@Test(enabled = true, groups = { "SmokeTesting" })
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
	@Test(priority = 1)
	public void AppoinmentTab() throws InterruptedException {
		WebElement appoinment = d.findElement(By.xpath("//span[text()='Appointment']"));
		appoinment.click();

	}

	@Test(priority = 2, groups = "SmokeTesting")
	public void Add_Appointment() throws InterruptedException {
		
		WebElement appoinment = d.findElement(By.xpath("//span[text()='Appointment']"));
		appoinment.click();
		
		WebElement window = d.findElement(By.xpath("//a[text()=' Add Appointment']"));
		window.click();

		// using windowhandle
		String oldwindow = d.getWindowHandle();
		Thread.sleep(2000);
		// Using windowHANDLES because 2 child window opens
		Set<String> childwindow = d.getWindowHandles();

		for (String handles : childwindow) {
			d.switchTo().window(handles);

		}

		// New Patient
		Set<String> multiplewindows = d.getWindowHandles();

		WebElement old = d.findElement(By.xpath("//span[text()='New Patient']"));
		old.click();

		for (String newwindow : multiplewindows) {
			if (childwindow.equals(oldwindow)) // !-Not operator
			{
				d.switchTo().window(oldwindow);
				Thread.sleep(2000);
				d.close();
			}
		}
			
		d.switchTo().window(oldwindow);
		Thread.sleep(2000);

		d.findElement(By.id("name")).sendKeys("Ajith");
		Thread.sleep(3000);

		d.findElement(By.name("guardian_name")).sendKeys("UP");
		Thread.sleep(3000);

		WebElement gender = d.findElement(By.id("addformgender"));
		Thread.sleep(3000);

		Select s = new Select(gender);

		s.selectByIndex(1);
		Thread.sleep(3000);

		String month = "August 1996";
		String day = "25";

		d.findElement(By.id("birth_date")).click();

		while (true) {
			String text = d.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if (text.equals(month)) {
				break;
			} else {

				d.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[1]")).click();// backward
				// d.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[3]")).click();//
				// forward
			}
		}
		d.findElement(By.xpath("//body[1]/div[7]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day + ")]"))
				.click();

		WebElement blood = d.findElement(By.name("blood_group"));

		Select sss = new Select(blood);
		sss.selectByValue("3");

		Thread.sleep(3000);

		WebElement mar = d.findElement(By.name("marital_status"));

		Select ma = new Select(mar);
		ma.selectByIndex(3);

		Thread.sleep(3000);

		WebElement button = d.findElement(By.id("file"));

		button.sendKeys("C:\\Users\\HP\\Pictures\\DP Dimension.jpg");
		Thread.sleep(5000);

		d.findElement(By.name("mobileno")).sendKeys("7034250002");
		Thread.sleep(3000);

		d.findElement(By.id("addformemail")).sendKeys("ajithup@gmail.com");
		Thread.sleep(3000);

		d.findElement(By.name("address")).sendKeys("220,Florida");
		Thread.sleep(3000);

		d.findElement(By.name("note")).sendKeys("Hakuna");
		Thread.sleep(3000);

		d.findElement(By.name("known_allergies")).sendKeys("Matata");
		Thread.sleep(3000);

		d.findElement(By.name("insurance_id")).sendKeys("002");
		Thread.sleep(3000);

		d.findElement(By.name("validity")).click();
		Thread.sleep(3000);

		d.findElement(By.xpath("(//td[text()='6'])[1]")).click();
		Thread.sleep(3000);

		d.findElement(By.name("identification_number")).sendKeys("0002");
		Thread.sleep(3000);

		d.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("9744299121");
		Thread.sleep(3000);

		// d.findElement(By.xpath("(//button[@type='submit'])[6]")).click();//Save
		// Button
		// Thread.sleep(3000);

		// d.switchTo().window(oldwindow);

		// d.findElement(By.id("select2-doctorid-container")).click();
		// Thread.sleep(2000);

		/*
		 * WebElement Doctor = d.findElement(By.id("select2-doctorid-container"));
		 * Thread.sleep(3000);
		 * 
		 * Select Doc = new Select(Doctor);
		 * 
		 * Doc.selectByVisibleText("Sansa Gomez (9008)"); Thread.sleep(3000);
		 */

	}

	@Ignore
	@Test(priority = 3, groups = { "SmokeTesting" })
	public void SearchAndAddAppointment() throws InterruptedException {

		WebElement window = d.findElement(By.xpath("//a[text()=' Add Appointment']"));
		window.click();

		// using windowhandle
		String oldwindow = d.getWindowHandle();
		Thread.sleep(2000);

		// Using windowHANDLES because 2 child window opens
		Set<String> childwindow = d.getWindowHandles();

		for (String handles : childwindow) {
			d.switchTo().window(handles);

		}

		// search patient id
		d.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
		Thread.sleep(2000);

		// patient id is 600 then press enter
		WebElement pid = d.findElement(By.xpath("(//input[@type='search'])[2]"));
		Thread.sleep(2000);
		pid.sendKeys("600");
		Thread.sleep(2000);
		pid.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// select doctor
		WebElement Doctor = d.findElement(By.id("doctorid"));
		Select Doc = new Select(Doctor);
		Doc.selectByValue("2");
		Thread.sleep(10000);

		// select shift
		WebElement shift = d.findElement(By.id("global_shift"));
		Select sh = new Select(shift);
		sh.selectByValue("3");

		// select date and time
		WebElement dpicker = d.findElement(By.id("datetimepicker"));
		Thread.sleep(10000);
		dpicker.sendKeys(Keys.ENTER);
		Thread.sleep(10000);

		// select slot mng or evng
		WebElement slot = d.findElement(By.id("slot"));
		Select slo = new Select(slot);
		slo.selectByValue("1");
		Thread.sleep(5000);

		// give priority
		WebElement priority = d.findElement(By.name("priority"));
		Select prio = new Select(priority);
		prio.selectByValue("3");
		Thread.sleep(5000);

		// payment mode
		WebElement payment = d.findElement(By.name("payment_mode"));
		Select pay = new Select(payment);
		pay.selectByValue("UPI");
		Thread.sleep(5000);

		// status
		WebElement apnstatus = d.findElement(By.name("appointment_status"));
		Select apn = new Select(apnstatus);
		apn.selectByValue("pending");
		Thread.sleep(3000);

		// message
		WebElement note = d.findElement(By.id("note"));
		note.sendKeys("I need Attention asap");
		Thread.sleep(5000);

		// live consultant
		WebElement live = d.findElement(By.name("live_consult"));
		Select lv = new Select(live);
		lv.selectByValue("yes");
		Thread.sleep(3000);

		// alternate address
		WebElement altaddrss = d.findElement(By.id("custom_fields[appointment][4]"));
		altaddrss.sendKeys("Catch me boy");
		Thread.sleep(2000);

		/*
		 * //save and print
		 * d.findElement(By.xpath("//button[@name='save_print']")).click();
		 * Thread.sleep(2000);
		 * 
		 * //save d.findElement(By.xpath("//button[@name='save']")).click();
		 */

	}

	@BeforeClass(alwaysRun=true)
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
