import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("+917034250002");
		driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
		driver.findElement(By.name("password")).sendKeys("1996aug25");
		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("nav-search-label-ide")).click();
		
		Select dropdown=new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByValue("search-alias=computers");
		Thread.sleep(5000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop Stand");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\'nav-search-submit-button\']")).click();
		Thread.sleep(500);
	
		
		//How I can use action?
		/*Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.className("a-size-base-plus a-color-base a-text-normal"));
		actions.contextClick(elementLocator).perform();
		driver.findElement(By.className("/a-size-medium a-color-base a-text-normal")).click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");*/

		// URL to open in a new tab
		String urlToOpen = "https://www.amazon.in/gp/slredirect/picassoRedirect.html/ref=pa_sp_atf_computers_sr_pg1_1?ie=UTF8&adId=A1016070202D2UN7W23C0&url=%2FAdjustable-Aluminum-Ergonomic-Compatible-MacBook%2Fdp%2FB09PD81521%2Fref%3Dsr_1_2_sspa%3Fkeywords%3DLaptop%2BStand%26qid%3D1644595533%26s%3Dcomputers%26sr%3D1-2-spons%26psc%3D1&qualifier=1644595533&id=3636722820825729&widgetName=sp_atf";
        // I had to grab the original handle
		String originalHandle = driver.getWindowHandle();

		driver.navigate().to(urlToOpen);

		Actions action = new Actions(driver);
		// Close the newly opened tab
		action.keyDown(Keys.CONTROL).sendKeys("w").perform();
		// Switch back to original
		action.keyDown(Keys.CONTROL).sendKeys("1").perform();

		// And switch back to the original handle. I am not sure why, but
		// it just did not work without this, like it has lost the focus
		driver.switchTo().window(originalHandle);

		/*	Actions action = new Actions(d);
		// Close the newly opened tab
		action.keyDown(Keys.CONTROL).sendKeys("w").perform();
		// Switch back to original
		action.keyDown(Keys.CONTROL).sendKeys("1").perform();

		// And switch back to the original handle. I am not sure why, but
		// it just did not work without this, like it has lost the focus
		d.switchTo().window(originalHandle);*/

		
		
	}

}
