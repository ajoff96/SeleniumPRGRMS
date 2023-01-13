import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\\\JavaProgram\\\\SeleniumPractice\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("ajithup1996@gmail.com");
		
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
        
        driver.findElement(By.name("password")).sendKeys("1996aug25");
        driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/span")).click();
	}

}
