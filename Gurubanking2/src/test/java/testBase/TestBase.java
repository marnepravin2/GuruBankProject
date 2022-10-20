package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;

	@BeforeTest
	@Parameters({ "brname", "appurl" })
	public void setUp(@Optional("chrome") String browser, @Optional("https://demo.guru99.com/V4/") String url) {

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("Doesn't match with require browser");
		}
		driver.manage().window().maximize();
		driver.get(url);

	}
	@AfterTest

	public void endTheBrowser() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}

}
