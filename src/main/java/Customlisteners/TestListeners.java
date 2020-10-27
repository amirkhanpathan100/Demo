package Customlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Snapshot;

public class TestListeners extends Snapshot implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
			System.out.println(result.getMethod().getMethodName()+" has been failed");

			try {
				capturescreen(result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}


	public void onTestSkipped(ITestResult result) {
		
		System.out.println(result.getMethod().getMethodName()+" has been skipped");
		
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+" has been started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+" has been executed suceessfully");
		try {
			capturescreen(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
