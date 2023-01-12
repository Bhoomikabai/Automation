import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.letcode.in/test/");
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		waitForLoad(3);
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='I am good']")).sendKeys("abc");
		String get = driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
        System.out.println(get);
        driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
      boolean check = driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
      String s = check ? "field is enabled" : "field is disabled";
      System.out.println(s);	
      
      boolean check2 = driver.findElement(By.xpath("//input[@id='dontwrite']")).isEnabled();
	   if(check2) {
		   driver.findElement(By.xpath("//input[@id='dontwrite']")).sendKeys("abx");  
	   }
	   else
	   {
		   System.out.println("it is read only");
	   }
	}	
	public static void waitForLoad(int seconds)
	{
		try {
			Thread.sleep(seconds*3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
