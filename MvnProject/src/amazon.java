import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.id("a-autoid-0-announce")).click();
		//driver.findElement(By.id("s-result-sort-select_4")).click();
		driver.findElement(By.name("search_query")).sendKeys("bag");
		driver.findElement(By.className("style-scope ytd-searchbox")).click();
	

		
		
		

	}

}
