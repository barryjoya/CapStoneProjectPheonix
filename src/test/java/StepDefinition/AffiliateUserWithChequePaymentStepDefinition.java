package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.RetailPageObject;
import utilities.Utilities;

public class AffiliateUserWithChequePaymentStepDefinition extends Base {
	
	RetailPageObject check = new RetailPageObject();
	
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	    check.setAffiliateButton();
	    logger.info("User clicked on Affiliate button");
	}

//	@Then("User click on continue button option")
//	public void user_click_on_continue_button_option() {
//	    check.getClickOnContinueOption();
//	    logger.info("User clicked on Continue button");
//	}

	
	@Then("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	    List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
//	    check.getFirstNameField(data.get(0).get("firstName"));
//	    check.getLastNameField(data.get(0).get("lastName"));
//	    check.getInputEmail(data.get(0).get("email"));
//	    check.getInputTelephone(data.get(0).get("telephone"));
	    check.setInputCompany(data.get(0).get("company"));
	    check.setInputWebsite(data.get(0).get("website"));
	    check.setInputTax(data.get(0).get("taxID"));
	    check.setPaymentMethod(data.get(0).get("paymentMethod"));
	    check.setInputCheque(data.get(0).get("payPalEmailAccount"));
//	    check.getPassword(data.get(0).get("password"));
//	    check.getConfirmPassword(data.get(0).get("confirmPassword"));
	    
	    
	}

	@Then("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	    check.setCheckBox();
	    logger.info("User checked on CheckBox Button");
	    
	}

	
	
	@Then("User click on Continue button")
	public void user_click_on_continue_button() throws InterruptedException {
	    check.setClickOnContinue();
	    Thread.sleep(3000);
	    logger.info("User Click on Continue Button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException, InterruptedException {
	    Assert.assertEquals(check.getSuccessMessage(), true);
	    Thread.sleep(3000);
	    Utilities.takeScreenShot("Affiliate Registeration");
	    logger.info("user see Congratulation message");
	}

	
	
}
