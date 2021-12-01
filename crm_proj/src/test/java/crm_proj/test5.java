package crm_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test5 extends Base_class{
	@Test
	public void tc5()
	{
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("test6");
		driver.findElement(By.name("assigntype")).click();
		
		Select s=new Select(driver.findElement(By.xpath("(//select[@class='small'])[5]")));
		s.selectByIndex(1);
		
	}

}
