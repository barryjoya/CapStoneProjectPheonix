package StepDefinition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.AmazonPageElement;

public class amazonLogin extends Base{

	AmazonPageElement amazon = new AmazonPageElement();
	
	@Given("user on amazon website")
	public void user_on_amazon_website() {
	   amazon.getAmazonLogo();
	    logger.info("Message is displayed");
	}

	@When("user click on sign button")
	public void user_click_on_sign_button() {
	    amazon.getAccountClick();
	    logger.info("User Clicked On Account");
	}

	@Then("user see userName <{string}> and password <{string}>")
	public void user_see_user_name_username_and_password_password(String username, String password) {
	    amazon.getEmail(username);
	    amazon.getContinueBut();
	    amazon.getPassword(password);
	    logger.info("user entered email and password");
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() {
	    amazon.getSubmit();
	    logger.info("user click on Submit button");
	}

	@Then("user see a amazon success message")
	public void user_see_a_amazon_success_message() {
	
	   Assert.assertEquals(amazon.getMessage("Help the people of Ukraine."), true);
	   logger.info("Message is Shown Successfully");
	}
	
}
