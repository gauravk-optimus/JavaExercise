import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BEDev356 {

	public static Logger log = Logger.getLogger(BEDev356.class);
	public final WebDriver driver = new FirefoxDriver();	
	public long currentTime = System.currentTimeMillis();

	@Test
	public  void login() {
		long waitTime = System.currentTimeMillis();
		log.info(Thread.currentThread().getName() +"LOG: wait time : " + (waitTime - currentTime));
		driver.get("https://qa2.mnkysoft.com/admin/dev356/home/login");
		driver.findElement(By.id("username")).sendKeys("kiki");
		driver.findElement(By.name("password")).sendKeys("TomPettywasswell2018");
		driver.findElement(By.name("adminlogin")).click();
		driver.findElement(By.xpath("//*[@id='menu_2']/ul/li[1]/a")).click();
		driver.findElement(By.name("kword")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//*[@id='email']")).click();
		driver.findElement(By.xpath("//*[@id='myForm']/table/tbody/tr/td[3]/input[2]")).click();
		driver.quit();
		log.info(Thread.currentThread().getName() +"LOG: execution time : " + (System.currentTimeMillis() - waitTime));
	}
}
