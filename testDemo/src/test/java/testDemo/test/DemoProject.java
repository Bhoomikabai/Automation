package testDemo.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoProject 
{
   @BeforeClass
   public void AccountLogin()
   {
	   System.out.println("Account has been loggined @beforeclass");
   }
   @BeforeMethod
   public void Password()
   {
	   System.out.println("Enter the password in @BeforeMethod");
   }
   @Test
   public void name()
   {
	   System.out.println("Enter name @Test");
   }
   @Test
   public void name2()
   {
	   System.out.println("Enter name2 @Test");
   }
   @AfterClass
   public void Register()
   {
	   System.out.println("Register @AfterClass");
   }
   @AfterMethod
   public void Address()
   {
	   System.out.println("Enter address @Aftermethod");
   }
   @AfterTest
   public void Address1()
   {
	   System.out.println("Enter address1 @Aftermethod");
   }

   @AfterSuite
   public void email()
   {
	   System.out.println("enter mail @afterSuite");
   }

}
