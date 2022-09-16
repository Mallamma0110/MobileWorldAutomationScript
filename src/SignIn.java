import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
	@Test 
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mallamma.yalameli\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("username")).sendKeys("mallamma123@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("password")).sendKeys("@123qwerty");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("a[class*='btn btn-primary btn-block']")).click();
	    Thread.sleep(1000);
	    driver.quit();
	    
		}
	}


