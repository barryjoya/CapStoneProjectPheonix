package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObj.LaptopsNoteBooksPageObject;
import utilities.Utilities;


public class validateMacbookProPrice extends Base {

	LaptopsNoteBooksPageObject obj = new LaptopsNoteBooksPageObject();
	
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	   obj.getClickOnMacbookPro();
	   logger.info("User Clicked On Macbook Pro");
	}

	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double price) throws IOException {
	    Assert.assertEquals(obj.getMacbookProPrice(price.toString()), true);
	   // Utilities.highlightelementRedBorder(obj.getMacbookProPrice(""));
	    Utilities.takeScreenShot("Macbook Pro price");
	    logger.info("user sees $2000 on UI");
	}
	
}
