package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebElements extends BaseClass {
	
	 @FindBy(xpath = "//input[contains(@data-test , 'username')]")
	 public WebElement username ;
	 
	 @FindBy(xpath = "//input[contains(@data-test , 'password')]")
	 public WebElement password ;
	 
	 @FindBy(xpath = "//input[contains(@data-test , 'login-button' )]")
	 public WebElement login ;
	 
	 
	 // PageFactory Class Init Elements method 
	 
	 public LoginWebElements()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void validcredentails()
	 {
		 username.sendKeys("standard_user");
		 password.sendKeys("secret_sauce");
		 login.click();
	 }
	 
	
	 
	 

}
