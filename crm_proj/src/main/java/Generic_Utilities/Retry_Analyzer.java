package Generic_Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer {
  
	
	private int count=0;
  private int retry_count=3;
  
  
  
	public boolean retry(ITestResult result) {
		while(count<retry_count)
		{
			count++;
			return true;
		}

		return false;
	}

	
}
