package pageObjects;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ConfigDataProvider;


public class BaseTest extends ConfigDataProvider{
	public static WebDriver driver;

	@BeforeClass
	public static void launchBrowser() throws IOException{
		loadPropertyfile();
		String browser= properties.getProperty("browser");
		String url= properties.getProperty("url");
		String driverlocation= properties.getProperty("driverlocation");
		String FFdriverlocation= properties.getProperty("FFdriverlocation");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gekho.driver", FFdriverlocation);
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}


	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}


}
