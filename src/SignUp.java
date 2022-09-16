import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
@Test
public void register() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mallamma.yalameli\\Downloads\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@href='signup.html']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Fname");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Yalameli");
    driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("mallamma123@gmail.com");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("@123qwerty");
    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("10/31/2000");
    driver.findElement(By.xpath("//div[@class='col-md-2']/input[@type='radio']")).click();
    driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9876543210");
    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hi Everyone");
    driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
    Thread.sleep(1000);
    driver.switchTo().alert().accept();
    driver.quit();
}
                   }
