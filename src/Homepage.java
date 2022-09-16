import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Homepage 
{
   @Test
	public void homepage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mallamma.yalameli\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    Thread.sleep(1000);
	    
//latest dropdown
	    driver.findElement(By.cssSelector("a[class=\"nav-link dropdown-toggle\"]")).click();
	    Thread.sleep(1000);
	    
//samsung,lenovo,apple iphone
	    driver.findElement(By.cssSelector("a[class=\"dropdown-item\"][href=\"#samsung\"]")).click();
	    Thread.sleep(1000);
	    
//Lenovo
	    driver.findElement(By.cssSelector("a[role='button'][href='#all']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("li[class='nav-item dropdown show'] a:nth-child(2)")).click();
	    Thread.sleep(1000);
	    
//Apple iphone
	    driver.findElement(By.cssSelector("a[role='button'][href='#all']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("body > nav:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(2) > a:nth-child(4)")).click();
	    Thread.sleep(1000);
	    
//All mobiles
	    driver.findElement(By.xpath("(//a[@class='btn btn-primary '][normalize-space()='More Details'])[1]")).click();
	    Thread.sleep(2000);
	  
//Support menu
        driver.findElement(By.linkText("Support")).click();
        Thread.sleep(1000);
        
//Order page
        driver.findElement(By.cssSelector("a[class=\"dropdown-item waves-effect waves-light\"]")).click();
        Thread.sleep(1000);
        
//Contact Us
        driver.findElement(By.cssSelector("a[class=\"nav-link dropdown-toggle waves-effect waves-light\"]")).click();
        driver.findElement(By.cssSelector("a[class=\"dropdown-item waves-effect waves-light\"][href=\"#\"]")).click();
        Thread.sleep(1000);
        
//Up arrow mark
	    driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    Thread.sleep(2000);
//driver.findElement(By.cssSelector("i[class='fas fa-arrow-up']")).click();
	}

}
