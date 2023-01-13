package com.medcolife;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MedcoLife {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Launch URL
		d.get("https://demo.smart-hospital.in/site/login");

		// Enters UserName and Password
		d.findElement(By.name("username")).sendKeys("jason@gmail.com");
		d.findElement(By.name("password")).sendKeys("password");

		// Click Login
		d.findElement(By.xpath("//button[text()='Sign In']")).click();

		Thread.sleep(2000);

		// Click Appoinment
		d.findElement(By.xpath("//span[text()='Appointment']")).click();

		// using windowhandle
		String oldwindow = d.getWindowHandle();
		Thread.sleep(2000);

		// Add Appoinment
		WebElement window = d.findElement(By.xpath("//a[text()=' Add Appointment']"));
		window.click();
		// Using windowHANDLES because 2 child window opens
		Set<String> childwindow = d.getWindowHandles();

		for (String handles : childwindow) {
			d.switchTo().window(handles);

		}

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

		d.findElement(By.id("name")).sendKeys("John");
		Thread.sleep(3000);

		d.findElement(By.name("guardian_name")).sendKeys("Lock");
		Thread.sleep(3000);

		WebElement gender = d.findElement(By.id("addformgender"));
		Thread.sleep(3000);

		Select s = new Select(gender);

		s.selectByIndex(1);
		Thread.sleep(3000);

		d.findElement(By.id("birth_date")).click();

		d.findElement(By.xpath("//td[text()='12']")).click();

		WebElement blood = d.findElement(By.name("blood_group"));

		Select sss = new Select(blood);
		sss.selectByValue("3");

		Thread.sleep(3000);

		WebElement mar = d.findElement(By.name("marital_status"));

		Select ma = new Select(mar);
		ma.selectByIndex(3);

		Thread.sleep(3000);

		WebElement button = d.findElement(By.id("file"));

		button.sendKeys("C:\\Users\\HP\\Pictures\\John Locke.jpg");
		Thread.sleep(5000);

		d.findElement(By.name("mobileno")).sendKeys("7034250003");
		Thread.sleep(3000);

		d.findElement(By.id("addformemail")).sendKeys("johnlock@gmail.com");
		Thread.sleep(3000);

		d.findElement(By.name("address")).sendKeys("220,Florida");
		Thread.sleep(3000);

		d.findElement(By.name("note")).sendKeys("Cant Walk");
		Thread.sleep(3000);

		d.findElement(By.name("known_allergies")).sendKeys("Skin allergies");
		Thread.sleep(3000);

		d.findElement(By.name("insurance_id")).sendKeys("481562");
		Thread.sleep(3000);

		d.findElement(By.name("validity")).click();
		Thread.sleep(3000);

		d.findElement(By.xpath("(//td[text()='6'])[1]")).click();
		Thread.sleep(3000);

		d.findElement(By.name("identification_number")).sendKeys("815162342");
		Thread.sleep(3000);

		d.findElement(By.xpath("(//input[@type='text'])[17]")).sendKeys("7005849899");
		Thread.sleep(3000);

		d.findElement(By.xpath("(//button[@type='submit'])[6]")).click();
		Thread.sleep(3000);

		d.switchTo().window(oldwindow);

		d.findElement(By.id("select2-doctorid-container")).click();
		Thread.sleep(2000);

	}

}
