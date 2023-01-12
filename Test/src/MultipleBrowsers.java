import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Bhoomika\\Desktop\\Drivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver3 = new FirefoxDriver();
	}

}
