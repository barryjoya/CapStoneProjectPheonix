package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.POMloginUiElement;
import utilities.Utilities;

public class DemoStep extends Base {

	POMloginUiElement retail = new POMloginUiElement();
	
	
	@Given("user is on retail website")
	public void user_is_on_retail_website() throws InterruptedException {
	   retail.getMyAccount();
	   Thread.sleep(1000);
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	  retail.getLogin();
	  Thread.sleep(1000);
	}

	@Then("user enter userName {string} and Password {string}")
	public void user_enter_user_name_and_password(String userName, String Password) throws InterruptedException {
	   retail.getUserName(userName);
	   retail.getPassword(Password);
	   retail.getClickLogin();
	   Thread.sleep(1000);
	}

	
	@Then("user should see a success message")
	public void user_should_see_a_success_message() throws IOException, InterruptedException {
		
	    Assert.assertEquals(retail.getMessageShowed(), true);
	    Utilities.takeScreenShot("Demo Run MultiSet");
	    Thread.sleep(2000);
	    
	}

	
	
	
}
