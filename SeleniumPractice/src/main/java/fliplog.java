import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fliplog {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\JavaProgram\\SeleniumPractice\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
				
		driver.get("https://www.flipkart.com/");

	}

}
