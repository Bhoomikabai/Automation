package demoTestNG.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeTest 
{
	@Test(groups = {"sanity","smoke"})
	public void addTocart()
	{
		System.out.println("inside addTocart Test case");
	}

	@Test
	public void verifysearchbar()
	{
		System.out.println("inside verifysearchbar test case");
	}



}
