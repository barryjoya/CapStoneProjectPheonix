package StepDefinition;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObj.DesktopsPageObject;
import utilities.Utilities;

public class hpStepDefinition extends Base {

	
	
	
	DesktopsPageObject hp = new DesktopsPageObject();
	
	
	@Then("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	   hp.getAddToCartHp();
	   logger.info("HP added To Cart");
	}

	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	    hp.getQuantityHp();
	    logger.info("Quantity Added 2");
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    hp.getAddToCartHpNextPage();
	    logger.info("2 HP added");
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer item) throws InterruptedException, IOException {
	   
		Assert.assertEquals(hp.getmessageSuccessHP(), true);
	    Thread.sleep(3000);
	    logger.info("Message Shown Succesfully");
	    Utilities.takeScreenShot("HP Sucess Message");
	}
	
}
