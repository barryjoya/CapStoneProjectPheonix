package StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObj.HomePageObj;
import utilities.Utilities;

public class currencyValueChangeStepDef extends Base {
	
	HomePageObj home = new HomePageObj();
	
	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
		
		home.setCurrencyDropDown();
		logger.info("User Clicked on the Currency drop down Option");
		Thread.sleep(1000);
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws InterruptedException {
	    home.setCurrencySelect();
	    logger.info("User Select the new Currency");
	    Thread.sleep(1000);
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException, InterruptedException {
	    Assert.assertEquals(home.getCurrencyShowed(), true);
	    Thread.sleep(3000);
	    Utilities.takeScreenShot("Currencychange");
	    logger.info("User see currency Change");
	    
	}

}
