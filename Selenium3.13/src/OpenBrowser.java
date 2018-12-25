import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OpenBrowser {

	public static void main(String[] args) {

//		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\workspace\\Selenium3.13\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\Selenium3.13\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}
}
