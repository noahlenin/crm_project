package crm_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test6 extends Base_class {
	
	
	@Test
	public void tc6()
	{
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	
	}

}
