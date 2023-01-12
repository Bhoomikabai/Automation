package demoTestNG.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersDemo {
    @Parameters({"url"})
	@Test
	public void setLanguage(String envUrl)
	{
		System.out.println("inside setlanguage test case");
		System.out.println(envUrl);
	}
    
        @Parameters({"url","username","password"})
    	@Test
    	public void editProfile(String envUrl,String urn, String pwd)
    	{
    		System.out.println("inside editprofile test case");
    		System.out.println("url = "+ envUrl);
    		System.out.println("username =" + urn);   		
    		System.out.println("password = "+ pwd);
    	}
   
}
