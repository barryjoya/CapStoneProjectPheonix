package StepDefinition;
import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObj.DesktopsPageObject;

import utilities.Utilities;

public class DesktopPageStepDefinition extends Base {

	
	
	DesktopsPageObject obj = new DesktopsPageObject();
	

	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertEquals(obj.getText(), true);
	    logger.info("Text WebPage is Displayed");

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	   obj.getDesktop();
	   logger.info("user click on desktop");
	   
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	    obj.getAllDesktop();
	    logger.info("user click on Show all desktop");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException, InterruptedException {
		Utilities.scrollDownPage();
		
		Thread.sleep(1000);
		Utilities.scrollUpPage();
		
		obj.getDesktopMessage("Desktop");
	  logger.info("Desktop Message Shown");
	  Utilities.takeScreenShot("DesktopMessage");
	}
	
	
}
