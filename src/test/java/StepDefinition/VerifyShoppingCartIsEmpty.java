package StepDefinition;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.junit.Assert;
import pageObj.HomePageObj;
import utilities.Utilities;

public class VerifyShoppingCartIsEmpty extends Base {

	HomePageObj cart = new HomePageObj();
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		cart.getContinueButtonClick();
		logger.info("User click on Shoping Cart");
	
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException, InterruptedException {
	    
	    Assert.assertEquals(cart.getCartIsEmpty(), true);
	    Thread.sleep(3000);
	    Utilities.takeScreenShot("Cart Validations");
	    logger.info("User validated the cart is Empty");
	}
}
