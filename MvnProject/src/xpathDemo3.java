import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo3
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.letcode.in/test/");
		
		driver.findElement(By.xpath("//a[text()='Click']")).click();
		driver.findElement(By.xpath("//*[@id='home']")).click();
		driver.navigate().to("https://letcode.in/buttons");
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	    WebElement n = driver.findElement(By.xpath("//*[@id='color']"));
        String str = n.getCssValue("button is-primary");
        System.out.println(str);
         
//        String get = driver.findElement(By.xpath("//input[@id='color']")).getCssValue("What is my color?");
//        System.out.println(get);
//        WebElement searchBox = driver.findElement(By.xpath("//*[@id='property']"));
//        searchBox.getSize();
//        
     
    	

 
        
           
           
	}
	
}
