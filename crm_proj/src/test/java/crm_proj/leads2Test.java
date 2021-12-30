package crm_proj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Generic_Utilities.ITestList.class)
public class leads2Test extends Base_class{
	
	@Test
	public void tcl_2() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='eads']")).click();
		driver.findElement(By.xpath("//a[text()='Go to Advanced Search']")).click();
		Select s=new Select(driver.findElement(By.name("fcol0")));
		s.selectByVisibleText("Salutation");
		Select ss=new Select(driver.findElement(By.id("fop0")));
		ss.selectByVisibleText("equals");
		driver.findElement(By.id("fval0")).sendKeys("noah");
		driver.findElement(By.xpath("(//input[@class='crmbutton small create'])[2]")).click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		
	}

}
