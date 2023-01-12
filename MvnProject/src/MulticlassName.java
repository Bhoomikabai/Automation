import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulticlassName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		driver.get("https://www.letcode.in/dropdowns");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sprhero = driver.findElement(By.id("superheros"));
		Select obj1 = new Select(sprhero);
		
		if(obj1.isMultiple())
		{
			System.out.println("it is multiple selection");
			obj1.selectByIndex(1);
			obj1.selectByValue("ta");
			obj1.selectByVisibleText("Batman");
		}

		

}
}
