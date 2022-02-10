package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.RetailPageObject;
import utilities.Utilities;

public class EditAccountInformation  extends Base {

	
	RetailPageObject obj = new RetailPageObject();
	
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	    obj.setEditAccountInformation();
	    logger.info("User Clicked on Edit Information");
	}

	@Then("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
	   obj.setInputFirstName(data.get(0).get("firstname"));
	   obj.setInputLastName(data.get(0).get("lastName"));
	   obj.setInputEmailField(data.get(0).get("email"));
	   obj.setInputTelephoneField(data.get(0).get("telephone"));
	   
	}

	@Then("User click on continue button")
	public void user_click_on_continue_button() {
	    obj.setContinueButtonOption();
	    logger.info("User Clicked on Continue Option");
	}

	@And("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws IOException {
	    obj.getAlertSuccess();
	    Assert.assertEquals(obj.getAlertSuccess(), true);
	    Utilities.takeScreenShot("Edit Information");
	    logger.info("user see success message");
	    
	}
	
	
	
	
}
