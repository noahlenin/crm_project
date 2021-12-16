package crm_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class oppotunity extends Base_class {
	@Test
	public void tc34()
	{
		WebDriverUtility wb=new WebDriverUtility();
		driver.findElement(By.xpath("(//a[text()='Opportunities'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
		
		WebElement ele = driver.findElement(By.id("qccombo"));
		
		
	
	}
}
