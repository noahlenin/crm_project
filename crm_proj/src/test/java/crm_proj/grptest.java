package crm_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class grptest extends Base_class {
	@Test(groups = {"SmokeTest","RegressionTest"})
	
	public void tc4() throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("test4");
		
		WebElement ele = driver.findElement(By.name("emailoptout"));
		ele.click();
		
		ele.click();
	}
	

	
	
}
