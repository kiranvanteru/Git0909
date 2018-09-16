package baseUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class OpenBrowser {
	
	public static WebDriver driver;
	
//	@BeforeTest
	
	public static void StartBrowser(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium jars and files\\geckodriver.exe");
			driver=new FirefoxDriver();
				
			}
			else if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\selenium jars and files\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}
