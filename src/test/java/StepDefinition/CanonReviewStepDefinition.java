package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.DesktopsPageObject;
import utilities.Utilities;

public class CanonReviewStepDefinition extends Base {

	
	DesktopsPageObject canonReview = new DesktopsPageObject();
	
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    canonReview.setClickOnCanonImg();
	    logger.info("User Clicked On Canon Image");
	    
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    canonReview.setClickOnReview();
	    logger.info("User Clicked On Review Button");
		
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	   List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
	   canonReview.setFirstName(data.get(0).get("yourname"));
	   canonReview.setInputText(data.get(0).get("yourReview"));
	   canonReview.setRatingField(data.get(0).get("Rating"));
	   
	   
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		canonReview.setContinueButton();
		logger.info("User Clicked on Continue Button");
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws IOException, InterruptedException {
		
		Assert.assertEquals(canonReview.getMessageShowSuccessfully(), true);
		Thread.sleep(2000);
		Utilities.takeScreenShot("Canon Success Message");
		logger.info("User See Success Message");
	}
	
}
