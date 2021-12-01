package crm_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test4 extends Base_class {
	@Test
	
	public void tc4() throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("test4");
		
		WebElement ele = driver.findElement(By.name("emailoptout"));
		ele.click();
		Thread.sleep(10000);
		ele.click();
	}
	

	
	
}
