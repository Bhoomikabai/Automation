import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.navigate().to("https://amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Mobi")).click();
		
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(3000);
			
		driver.findElement(By.partialLinkText("Electroni")).click();
		Thread.sleep(3000);
}
}
