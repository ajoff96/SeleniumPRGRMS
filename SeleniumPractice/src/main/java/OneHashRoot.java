import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneHashRoot {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");

        WebDriver d = new ChromeDriver();
        d.get("https://one.hashroot.com/login");
        d.manage().window().maximize();
        Thread.sleep(400);
        
        d.findElement(By.id("username")).sendKeys("arun.ks@hashroot.com");
        Thread.sleep(6000);
        d.findElement(By.id("password")).sendKeys("@46UN4n00p12345");
        Thread.sleep(6000);
        d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(6000);
        d.findElement(By.xpath("/html/body/div/div/div[1]/div/ul/li/div")).click();
        Thread.sleep(6000);
        d.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/ul/li/div/div/div/a[3]/span")).click();
        
	}

}
