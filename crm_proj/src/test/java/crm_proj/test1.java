package crm_proj;
import org.testng.annotations.Test;

import com.crm.pom.crm_pom_login;



public class test1 extends Base_class {

	
	@Test
	
	
	public void tc1() {
		
		crm_pom_login cr=new crm_pom_login(driver);
		
		cr.org();
		
		cr.plus();
		
		cr.org_name_textbox();
		cr.save_btn();
		
	/* driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	//driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		
		driver.findElement(By.name("accounttype"));
		Select sel=new Select(driver.findElement(By.name("accounttype")));
		sel.selectByVisibleText("Banking");
		
				
*/
	}

}
