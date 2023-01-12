import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo 
{
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.saucedemo.com/");
		WebElement usn = driver.findElement(By.xpath("//*[@id='user-name']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button' and @value='Login']"));

		usn.sendKeys("standard_user");
		System.out.println("I enter the user name");
		
		pwd.sendKeys("secret_sauc");
		System.out.println("I enter the password");
		
		login.click();
		System.out.println("I click the login button");
		
		//Error message
		WebElement err = driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
		String errmsg = err.getText();
		System.out.println("the error msg is "+errmsg);
		
		//click the close button
	    driver.findElement(By.xpath("//div[@class='error-message-container error']/h3/button")).click();
		System.out.println("I clicked on the close button");
		
		usn.clear();
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		
		pwd.click();
		pwd.clear();
		System.out.println("user name and password field cleared");
		
		usn.sendKeys("standard_user");
		System.out.println("I enter the user name");
		
		pwd.sendKeys("secret_sauce");
		System.out.println("i enter the password");
		
		login.click();
		System.out.println("I click the login button");
		
		
	
}

}
