package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class AddRemoveMacbook extends Base {

	
	LaptopsNoteBooksPageObject lapTop = new LaptopsNoteBooksPageObject();
	
	
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		lapTop.setLaptopNotebook();
		logger.info("User Clicked on Laptop tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		lapTop.setAllLaptoNotebook();
		logger.info("User Clicked On show All Laptop");
		
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
	    lapTop.setMacbook();
	    logger.info("User Clicked on Macbook item");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
	    Assert.assertEquals(lapTop.getShowMessageSuccess(),true);
	    logger.info("User See (Success: You have added) ");
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String str) {
		Assert.assertEquals(lapTop.getAddToCartMessage(str), true);
		logger.info("User Sees Price on Add To Cart");
		
	}
	
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    lapTop.setAddToCartButtonClicked();
	    logger.info("user clicked on add to cart Button");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    lapTop.setRemoveRedX();
	    logger.info("User clicked on ");
	}
	
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String cart) throws IOException, InterruptedException {
		Thread.sleep(2000);
	   Assert.assertEquals(lapTop.getMessageShownEnd(cart), true);
	   Utilities.takeScreenShot("macbook pro");
	   logger.info("End Message Shown");
	}


}
