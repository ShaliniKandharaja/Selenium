package testngexcelintegration;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryFailedTests implements IRetryAnalyzer,IAnnotation{
	// IRetryAnalyzer is Interface , So added unimplemented methods
int maxRetry=0;
	@Override
	public boolean retry(ITestResult result) {
		if(maxRetry<2) {
			maxRetry++;
			return true; // retry --> will continue
			}
			
		return false; // retry --> will stop
		
	}
		// This method is to use retryAnalyer in all Test Methods
		public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod) {
			annotation.setRetryAnalyzer(testngexcelintegration.RetryFailedTests.class);
		}
	
	
}
