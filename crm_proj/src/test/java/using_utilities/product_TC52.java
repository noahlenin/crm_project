package using_utilities;

import org.openqa.selenium.By;

import crm_proj.Base_class;

public class product_TC52 extends Base_class {
	
	public void tc52()
	{
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='Products Settings']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Layout Editor')]")).click();
		driver.findElement(By.xpath("(//input[@class='crmButton create small'])[2]")).click();
		
		
	}

}
