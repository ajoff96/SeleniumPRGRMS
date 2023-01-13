import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.get("https://www.instagram.com/accounts/login/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		
		d.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input")).sendKeys("pedoskys");
		Thread.sleep(3000);
		d.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input")).sendKeys("1996aug25");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		Thread.sleep(3000);
	    d.findElement(By.xpath("")).click();	
		Thread.sleep(3000);
		
		                               //a[@href="/pedoskys/"]
		//*[@id="mount_0_0_0b"]/div/div/div/div[1]/div/div/div/div[1]/section/nav/div[2]/div/div/div[3]/div/div[1]/div/a/svg
	}
	

}
