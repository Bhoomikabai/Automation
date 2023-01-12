package demoTestNG.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest 
{
	@Test(groups = {"smoke"})
	public void verifylogin()
	{
		System.out.println("inside verifylogin test case");
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
	}

	@Test (groups = {"smoke"})
	public void verifylogin2()
	{
		System.out.println("inside verifylogin test case");
	}

	
	public void verifylogin3()
	{
		System.out.println("inside verifylogin test case");
	}





}
