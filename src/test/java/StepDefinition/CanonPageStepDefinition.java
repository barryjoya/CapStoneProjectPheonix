package StepDefinition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.junit.Assert;

import pageObj.DesktopsPageObject;
import utilities.Utilities;

public class CanonPageStepDefinition extends Base {

	
	DesktopsPageObject canon = new DesktopsPageObject();
	
	@Then("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	    canon.setAddToCartCanon();
	    logger.info("Canon is Added to Cart");
	}

	@Then("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	   canon.setCanonColorOption();
	   logger.info("Red color is Selected");
	   
	}
	


	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws IOException, InterruptedException {
	    canon.getCanonSuccesMessage();
	    logger.info("Success Message is Shown");
	    Thread.sleep(1000);
	    Assert.assertEquals(canon.getText(), true);
	    Utilities.takeScreenShot("Canon EOS");
	    
	}
	
}
