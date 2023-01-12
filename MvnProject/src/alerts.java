import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts 
{
	
	public static void main(String[] args) throws InterruptedException,MalformedURLException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.navigate().to("https://letcode.in/alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("accept")).click();
		Thread.sleep(3000);
		waitForElementLoad(2);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirm")).click();
		waitForElementLoad(2);
		driver.switchTo().alert().dismiss();
		
        driver.findElement(By.id("prompt")).click();
     	waitForElementLoad(2);
//		driver.switchTo().alert().sendKeys("test");
//		driver.switchTo().alert().accept();
		
	    Alert a =	driver.switchTo().alert();
	    a.sendKeys("test");
	    a.accept();
	    
		driver.findElement(By.id("prompt")).click();
		waitForElementLoad(2);
		Alert b=	driver.switchTo().alert();
	    b.sendKeys("test");
	    b.dismiss();
	    
//		driver.switchTo().alert().sendKeys("test2");
//		driver.switchTo().alert().dismiss();
//		
				
	}

	private static void waitForElementLoad(int i) {
	
		
		
	}
}
