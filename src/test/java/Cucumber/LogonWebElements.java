package Cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogonWebElements extends TestBase {
	
	@FindBy(xpath = "//input[contains(@data-test , 'username')]")
	 public WebElement username ;
	 
	 @FindBy(xpath = "//input[contains(@data-test , 'password')]")
	 public WebElement password ;
	 
	 @FindBy(xpath = "//input[contains(@data-test , 'login-button' )]")
	 public WebElement login ;
	 
	 @FindBy(xpath= "//div[text() = 'Swag Labs']")
	 public static WebElement check ;
	 
	 
	 // PageFactory Class Init Elements method 
	 
	 public LogonWebElements()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void validcredentails()
	 {
		 username.sendKeys("standard_user");
		 password.sendKeys("secret_sauce");
		 login.click();
	 }
	 
	 public static void checkingstatus()
	 {
		 String p = check.getText();
		 if(p.equals("Swag Labs"))
		 {
			 System.out.println("Test is passed");
		 }
		 else
		 {
			 System.out.println("Test is failed");
		 }
	 }
	
	
}

