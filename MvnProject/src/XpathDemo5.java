import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo5 {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize
			driver.get("https://www.saucedemo.com/");
			WebElement usn = driver.findElement(By.xpath("//*[@id='user-name']"));
			WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));

			WebElement login = driver.findElement(By.xpath("//input[@id='login-button'and @value='Login']"));

			usn.sendKeys("standard_user");
			System.out.println("I enter the user name");
			
			pwd.sendKeys("secret_sauce");
			System.out.println("I enter the password");
			
			login.click();
			System.out.println("I click the login button");
			
			Thread.sleep(3000);
			
			
			//login verification
			boolean check = driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).isDisplayed();
	          
			if(check)
			{
				System.out.println("login successfully");
			}
			else
			{
				System.out.println("login failed");
			}
			
			WebElement item =driver.findElement(By.xpath("//*[contains(text(),'Bolt T-Shirt')]/parent::a/parent::div/following-sibling::div[@class='pricebar']/button"));

			item.click();

}
}