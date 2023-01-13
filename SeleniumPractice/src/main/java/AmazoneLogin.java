import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("+917034250002");
		driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
		driver.findElement(By.name("password")).sendKeys("1996aug25");
		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("p13n-asin-index-0")).click();
		Thread.sleep(5000);
	//	driver.findElement(By.name("submit.addToCart")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[5]/div[2]")).click();

	}

}
