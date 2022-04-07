package StepDefinition;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObj.gmailElements;

public class gmailLogin extends Base {
	
	gmailElements gmail = new gmailElements();
	
	@Given("user enter userName <{string}>and password <{string}>")
	public void user_enter_user_name_user_name_and_password_password(String userName, String password) throws InterruptedException {
		Thread.sleep(1000);
		try {
			gmail.getUserName(userName);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(1000);
	    gmail.getPassword(password);
	}

	@Then("user see a success message")
	public void user_see_a_success_message() throws IOException {
	    gmail.getMessage();
	}
}