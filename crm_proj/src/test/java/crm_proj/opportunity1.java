package crm_proj;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class opportunity1 extends Base_class {
	@Test 
	
	public void test1() {
		driver.findElement(By.xpath("(//a[text()='Opportunities'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
		driver.findElement(By.name("potentialname")).sendKeys("noah");
		driver.findElement(By.id("related_to_display")).sendKeys("lenin");
		
		
	}

}
