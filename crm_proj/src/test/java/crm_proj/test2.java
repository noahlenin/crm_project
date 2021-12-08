package crm_proj;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test2 extends Base_class{

	@Test
	public void tc2()
	{
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
	driver.findElement(By.name("accountname")).sendKeys("test233");
	driver.findElement(By.xpath("//img[@alt='Select']")).click();

	}

}
