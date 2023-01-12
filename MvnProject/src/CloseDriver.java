import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseDriver 
{
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.amazon.in/");
		driver.manage().window().minimize();
		//driver.close();//closes current window
		driver.quit();//closes all associated windows
		
	 
	
}
}
