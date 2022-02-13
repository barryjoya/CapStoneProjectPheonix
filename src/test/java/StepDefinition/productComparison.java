package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class productComparison extends Base {

	LaptopsNoteBooksPageObject compare = new LaptopsNoteBooksPageObject();
	
	
	
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	   compare.getmacbookComparisonButton();
	  logger.info("user clicked on macbook ");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    compare.getMacbookAirComparisonButton();
	    logger.info("user clicked on Macbook Air");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	 
		Assert.assertEquals(compare.getSuccessMessage(), true);
		logger.info("User See success Message");
		
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	  compare.getClickOnComparison();
	  logger.info("user clicked on product comparison");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException, InterruptedException {
	    
	    Assert.assertEquals(compare.getProductMessage(), true);
	    Thread.sleep(3000);
	    
	    Utilities.takeScreenShot("Macbook Comparison Success Message");
	    logger.info("Success Message is Shown");
	}
	
}
