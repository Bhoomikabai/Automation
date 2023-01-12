import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo2 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.saucedemo.com/");
		
		//driver.findElement(By.cssSelector("input#user-name")).sendKeys("abc");
		//driver.findElement(By.cssSelector("input.input_error form_input")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("input.submit-button btn_action[value='Login']")).click();
		driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("standard_user");
		driver.findElement(By.xpath("//form/div[2]/input")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//form/input")).click();
}
}