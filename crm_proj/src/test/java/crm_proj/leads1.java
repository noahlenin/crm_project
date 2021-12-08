package crm_proj;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Generic_Utilities.ITestList.class)
public class leads1 extends Base_class {

	@Test (groups = {"RegionalTest"})
	public void tcl_1()
	{
		
		driver.findElement(By.xpath("//a[text()='eads']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("noah");
		driver.findElement(By.name("company")).sendKeys("test yantra");
		
		driver.findElement(By.name("secondaryemail")).sendKeys("noahlenin19@gmail.com");
		driver.findElement(By.id("email")).sendKeys("noahlenin19@gmail.com");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	}
	
}
