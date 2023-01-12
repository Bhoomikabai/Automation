import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();//maximize
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl = "+currentUrl);
		
		String title = driver.getTitle();
		System.out.println("title = "+title);
		
		
		
		
	}
}

