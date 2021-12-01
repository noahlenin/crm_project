package crm_proj;
import org.testng.annotations.Test;
import com.crm.pom.crm_pom;

public class test1 extends Base_class {

	
	@Test
	
	
	public void tc1() {
		
		crm_pom cr=new crm_pom(driver);
		
		cr.org();
		
		cr.plus();
		
	/* driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	//driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		
		driver.findElement(By.name("accounttype"));
		Select sel=new Select(driver.findElement(By.name("accounttype")));
		sel.selectByVisibleText("Banking");
		
				
*/
	}

}
