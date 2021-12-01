package crm_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test1 extends Base_class {

	
	@Test
	public void tc1() {
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		
		driver.findElement(By.name("accounttype"));
		Select sel=new Select(driver.findElement(By.name("accounttype")));
		sel.selectByVisibleText("Banking");
		
				

	}

}
