package demoTestNG.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListerners  implements ITestListener
{
  public void onStart(ITestContext agr0)
  {
	  System.out.println("test case started");
  }
  public void onTestStart(ITestResult arg0)
  {
	  System.out.println(arg0.getMethod() + "test case started");
  }
  public void onTestSuccess(ITestResult result)
  {
	  System.out.println("my test case has passed");
  }
  
  public void onTestSkipped(ITestResult arg0)
  {
	  System.out.println("test case skipped");
  }
  public void onFinish(ITestContext agr0)
  {
	  System.out.println("test case Finished");
  }
  
}
