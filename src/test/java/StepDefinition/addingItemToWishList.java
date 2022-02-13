package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObj.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class addingItemToWishList extends Base {

	LaptopsNoteBooksPageObject wishList = new LaptopsNoteBooksPageObject();
	
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	wishList.setWishListButton();
	logger.info("user clicked on WishList Button");
		
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws InterruptedException, IOException {
	   Assert.assertEquals(wishList.getwishListMessageIsDisplayed(), true);
	   Thread.sleep(3000);
	  
	   Utilities.takeScreenShot("Sony Vaio ScreenShot");
	   
	}
	
}
