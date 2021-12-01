package crm_proj;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test3 extends Base_class{

	@Test
	public void tc3()
	{
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("noah112233");
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String ref:child)
		{
		driver.switchTo().window(ref);	
		}
		driver.findElement(By.xpath("//a[text()='TYSS']")).click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		driver.switchTo().window(parent);
		driver.findElement(By.name("button")).click();
		}
	
	}
	
	

	
	

