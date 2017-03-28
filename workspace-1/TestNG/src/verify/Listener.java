package verify;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test has started"+result.getStatus());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test has started"+result.getName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has started"+result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has started"+result.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		
	}
	

}
