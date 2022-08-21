package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void init() {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterSuite
	public void TearDown() {
		driver.close();
	}
}
