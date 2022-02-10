package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.RetailPageObject;
import utilities.Utilities;

public class EditAffiliateInformationStepDefinition extends Base {

	RetailPageObject edit = new RetailPageObject();
	
//	@Given("User click  on MyAccount")
//	public void user_click_on_my_account() {
//	    edit.getClickOnAccount();
//	    logger.info("User Clicked on MyAccount");
//	}
//
//	@When("User click on Login")
//	public void user_click_on_login() {
//	    edit.getClickOnLogin();
//	    logger.info("User clicked on Login");
//	    
//	}
//
//	@When("User enter username <{string}> and password <{string}>")
//	public void user_enter_username_and_password(String userName, String password) {
//	    edit.getUserName(userName);
//	    edit.getPassword(password);
//	    logger.info("User Entered UserName and Password");
//	    
//	}
//
//	@When("User click on Login button")
//	public void user_click_on_login_button() {
//	    edit.getSubmitButton();
//	    logger.info("User Clicked On Submit Button");
//	}
//	
	//=========================================================
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	     edit.getEditInfo();
	     logger.info("User click on Edit your affiliate information link");
		
	}

	@Then("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	    edit.getBankRadioButton();
	    logger.info("User Click on transfer Radio button");
	}

	@Then("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	   List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
	   edit.getBankInputField(data.get(0).get("bankName"));
	   edit.getBankBranchField(data.get(0).get("abaNumber"));
	   edit.getBankSwiftField(data.get(0).get("swiftCode"));
	   edit.getBankAccountName(data.get(0).get("accountName"));
	   edit.getBankAccountNumber(data.get(0).get("accountNumber"));
	}

//	@And("User click on Continue button")
//	public void user_click_on_continue_button() {
//		edit.getContinueButton();
//		logger.info("User Clicked On continue Button");
//	}
	
//	@Then("User should see a success message")
//	public void user_should_see_a_success_message() throws IOException {
//		Assert.assertEquals(edit.getSuccessAlertMessage(), true);
//		Utilities.takeScreenShot("Edit Information Message");
//		logger.info("User see Success Message ( Success: Your account has been successfully updated.)");
//		
//	}
	
}
