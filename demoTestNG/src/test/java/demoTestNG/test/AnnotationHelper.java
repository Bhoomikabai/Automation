package demoTestNG.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationHelper
{
	@Test(timeOut = 5000)
	public void setfile() {
		System.out.println("inside setfile testcase");
		
	}
	@Test(enabled = true)
	public void create() {
		Assert.assertTrue(false);
		System.out.println("inside create testcase");
	}
	@Test(dependsOnMethods= {"create"})
	public void insert() {
		System.out.println("inside insert testcase");
		
		
	}
}
