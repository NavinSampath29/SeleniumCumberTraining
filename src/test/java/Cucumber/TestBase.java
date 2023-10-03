package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

public static WebDriver driver ;
	
	public static void intilize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumCucumberTraining\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void geturl()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	public static void close()
	{
		driver.quit();
	}

	
}
