/*package Generic_Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import crm_proj.Base_class;

public class ITestList extends Base_class implements ITestListener  {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("testing Scripts started");
		
	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test Scripts executed successfully");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
		
		try {
			wb.takeScreenshot(Base_class.staticDriver,result.getName()+wb.sysDate().replace(" ","_").replace(":","_"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		System.out.println("Screenshot taken");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

}
*/