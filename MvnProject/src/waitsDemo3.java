import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class waitsDemo3 {
	
	public static void main(String[] args) throws InterruptedException,MalformedURLException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		    
		     driver.findElement(By.xpath("//*[@id='start']/button")).click();
		     WebElement txt = driver.findElement(By.xpath("//*[@id='finish']/h4"));


				WebElement ele = wait.until(new Function<WebDriver,WebElement>()
						{
					     public WebElement apply(WebDriver driver)
					     {
					    	 if(txt.isDisplayed())
					    	 {
					    		 return txt;
					    		 
					    	 }
					    	 else
					    	 {
					    		 return null;
					    	 }
					     }
						});
				System.out.println(ele.getText());
	}
}
