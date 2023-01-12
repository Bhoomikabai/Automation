import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.letcode.in/dropdowns");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown1 = driver.findElement(By.id("fruits"));
		Select obj1 = new Select(dropdown1);
		obj1.selectByIndex(1);
	     
		List<WebElement> allFruits = obj1.getOptions();
		for(int i=0;i<allFruits.size();i++)
		{
			String  f = allFruits.get(i).getText();
			System.out.println(f);
		}
		
		
		
		WebElement dropdown2 = driver.findElement(By.id("lang"));
		Select obj2 = new Select(dropdown2);
		obj2.selectByIndex(1);
		
		//obj2.getFirstSelectedOption().getText();
		WebElement s = obj2.getFirstSelectedOption();
		System.out.println(s.getText());
		
		
		WebElement dropdown3 = driver.findElement(By.id("country"));
		Select obj3 = new Select(dropdown3);
		obj3.selectByVisibleText("Bolivia");
		
}
}