 package crm_proj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.pom.crm_pom_login;



public class Base_class {
	public WebDriverUtility wb;
	

	//public static WebDriver staticDriver;
 public PropFile pf = new PropFile();
	

	public WebDriver driver;
	
	//	@Parameters("browser")
		@BeforeMethod (groups = {"SmokeTest","RegionalTest"})
		public void openApp() throws IOException {
			WebDriverUtility wb = new WebDriverUtility();
			
	
		//	if(Browser.equalsIgnoreCase("chrome"))
		driver=new ChromeDriver();
	//		else if(Browser.equalsIgnoreCase("firefox"))
		//		driver=new FirefoxDriver();
		//	staticDriver=driver;
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		crm_pom_login cr=new crm_pom_login(driver);	
		cr.loginToApp(pf.readDataFromProperty("username"), pf.readDataFromProperty("password"));
	
		
		
		
		driver.findElement(By.id("submitButton")).click();	
		}
		
		@AfterMethod
		public void signout()
		{
			crm_pom_login cr=new crm_pom_login(driver);
			cr.signOut();
			driver.close();
	//	staticDriver.quit();
			
		}
		
	
	
	}

