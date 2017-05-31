import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frame1 
{
	@Test
	public void framehandle() throws InterruptedException
	{
	// Handling Frames 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/login.html");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    // driver.switchTo().frame("zohoiam");
	     WebElement ifr=driver.findElement(By.id("zohoiam"));
	     //WebElement ifr=driver.findElement(By.name("zohoiam"));
	     //WebElement ifr=driver.findElement(By.xpath(".//*[@id='outertable']/tbody"));
	     driver.switchTo().frame(ifr);
	     Thread.sleep(1000);
	     driver.findElement(By.id("lid")).sendKeys("abc@email.com");
	     driver.switchTo().defaultContent();
	     driver.findElement(By.className("logo")).click();
	     //driver.switchTo().frame(ifr);
		

	}

}
