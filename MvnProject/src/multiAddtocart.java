import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiAddtocart 
{
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
			
			String[] items = {"Bolt T-Shirt","Bike Light","Onesie"};
			for(int i=0;i<items.length;i++)
			{
				WebElement item1 =driver.findElement(By.xpath("//*[contains(text(),'"+items[i]+"')]/parent::a/parent::div/following-sibling::div[@class='pricebar']/button"));

				item1.click();
			}
			driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
			
			
			
			

}


}
