import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class breakenLinks 
{
	public static void main(String[] args) throws InterruptedException,MalformedURLException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.navigate().to("https://amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	String link =	driver.findElement(By.linkText("Best Sellers")).getAttribute("href");
	HttpURLConnection conn;
	conn =(HttpURLConnection)(new URL(link)).openConnection();
	conn.connect();
	int code = conn.getResponseCode();
	
	if(code > 400 || code > 500) {
		System.out.println(code+ "the link is broken");
	}
	else
	{
		System.out.println(code+ "the link is working");
	}
		
	}

}
