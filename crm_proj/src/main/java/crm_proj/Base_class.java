 package crm_proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {

	
	public WebDriver driver;
		
		@BeforeMethod (groups = {"SmokeTest","RegionalTest"})
		public void openApp() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		
	
		
		}
	
	
	@AfterMethod (groups = {"SmokeTest","RegionalTest"})
		
		public void closeApp() 
		{
			WebElement ele = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
			Actions action=new Actions(driver);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			driver.quit();
		}
		

	}

