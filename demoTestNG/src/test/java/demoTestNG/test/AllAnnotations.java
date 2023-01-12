package demoTestNG.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllAnnotations 
{
	
	@BeforeClass
	public void initializeVariable()
	{
		System.out.println("inside @BeforeClass");
	}
	@BeforeMethod
	public void printMethodStart()
	{
		System.out.println("inside @BeforeMethod");
	}
	
	@Test
	public void crete()
	{
		System.out.println("inside create method");
		
	}
	@Test
	public void crete2()
	{
		System.out.println("inside create2 method");
		
	}
	@AfterMethod
	public void initializeVariable2()
	{
		System.out.println("inside @AfteeMethod");
	}
	@AfterClass
	public void printMethodStart3()
	{
		System.out.println("inside @AftereClass");
	}
}
