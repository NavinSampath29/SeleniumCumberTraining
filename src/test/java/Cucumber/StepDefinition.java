package Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends TestBase {
	
	LogonWebElements lw ;
	
	@Given("^User tries to launch the browser with the url$")
	public void user_tries_to_launch_the_browser_with_the_url()  {
	   
		TestBase.intilize();
		TestBase.geturl();
		
	}

	@When("^USer tries to login$")
	public void user_tries_to_login() {
		lw = new LogonWebElements();
		lw.validcredentails();
	}

	@And("^Loin should be successfull$")
	public void loin_should_be_successfull() {
		LogonWebElements.checkingstatus();
	   
	}

	@Then("^Browser needst to closed$")
	public void browser_needst_to_closed()  {
		
		TestBase.close();
	}



}
