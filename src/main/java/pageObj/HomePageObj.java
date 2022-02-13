package pageObj;

import java.io.IOException;
import java.util.List;

import org.apache.commons.collections.functors.IfClosure;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class HomePageObj extends Base {

	
	public HomePageObj () {
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement messageTest;
	
	public boolean getText() {
		messageTest.isDisplayed();
		String actualMessage="TEST ENVIRONMENT";
		String expectedMessage ="TEST ENVIRONMENT";
		if(actualMessage.equalsIgnoreCase(expectedMessage))
			
		return true;
		else
			return false;
	}
	
	
	@FindBy(css="//*[text()='Currency']")
	private WebElement showCurrency;
	public boolean getCurrency() {
		if(showCurrency.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	public boolean getSearch() {
		if(searchBar.isEnabled())
			return true;
			else
				return false;
	}
	
	@FindBy(css="//*[text()='123456789']")
	private WebElement showPhoneNumber;
	public boolean getPhoneNumber() {
		if(showPhoneNumber.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(css="//*[@class='col-sm-3']//parent::h5")
	private List<WebElement> showInformation;
	public void getInformation() {
		for (WebElement information : showInformation) {
			information.isDisplayed();
			information.getText();
			
			
		}
	}
	
	@FindBy(css="//*[@class='col-sm-3']//parent::h5[text()='Customer Service']")
	private WebElement showCustomerService;
	private void getCustomerServices() {
		for (WebElement customer : showInformation) {
			customer.isDisplayed();
			customer.getText();
			
		}
	}
	
	@FindBy(css="//*[text()='Contact Us']")
	private WebElement showContactUs;
	public boolean getContactUs() {
		if(showContactUs.isDisplayed())
			return true;
		else
			return false;
		
	}	
	


	
	@FindBy(css="//*[text()='Returns']")
	private WebElement showReturn;
	public boolean getReturn() {
		if(showReturn.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(css="//*[text()='Site Map']")
	private WebElement showSiteMap;
	public boolean getSiteMap() {
		if(showSiteMap.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	@FindBy(css="//*[@class='col-sm-3']//parent::h5[text()='Extras']")
	private WebElement showExtra;
	public boolean getExtra() {
		if(showExtra.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(css="//*[text()='Brands']")
	private WebElement showBrand;
	public boolean getBrand() {
		if(showBrand.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(css ="//*[text()='Gift Certificates']")
	private WebElement showCertificate;
	public boolean getCertificate() {
		if(showCertificate.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	@FindBy(css ="//*[text()='Affiliate']")
	private WebElement showAffiliate;
	public boolean getAffiliate() {
		if(showAffiliate.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	
	@FindBy(css ="//*[text()='Specials']")
	private WebElement showSpecialse;
	public boolean getSpecials() {
		if(showSpecialse.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	
	
	
	
	
	
	@FindBy(css="//*[@class='col-sm-3']//parent::h5[text()='My Account']")
	private WebElement showMyAccount;
	public boolean getMyAccount() {
		if(showMyAccount.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath ="//a[text()='My Account']")
	private WebElement showAccount;
	public boolean getAccount() {
		if(showAccount.isDisplayed())
			return true;
		else 
			return false;
	}
	
	@FindBy(xpath ="//a[text()='Order History']")
	private WebElement showOrderHistory;
	public boolean getOrderHistory() {
		if(showOrderHistory.isDisplayed())
			return true;
		else 
			return false;
	}
	
	@FindBy(css ="//*[text()='Wish List']")
	private WebElement showWishList;
	public boolean getWishList() {
		if(showWishList.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	@FindBy(css ="//*[text()='Newsletter']")
	private WebElement showNewsletter;
	public boolean getNewsletter() {
		if(showNewsletter.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	@FindBy(css="//*[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	public boolean getSearchButton() {
		if(searchButton.isEnabled())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement accountButton;
	
	public boolean getAccountButton() {
		if(accountButton.isEnabled())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//span[text()='Wish List (0)']")
	private WebElement wishButton;
	
	public boolean getWishButton() {
		if (wishButton.isEnabled())
			return true;
		else 
			return false;
		
	}
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement shopingCartIsActive;
	public boolean getShopingCart() {
		if(shopingCartIsActive.isEnabled() )
			return true;
		else
			return false;
	
	
	}
	
	@FindBy(xpath="//span[text()='Checkout']")
	private WebElement checkoutButton;
	public boolean getCheckout() {
		if(checkoutButton.isEnabled())
			return true;
		else
			return false;
	}
	@FindBy(xpath = "//div[@id='cart']//button[@type='button']")
	private WebElement cartButton;
	public boolean getCartButton() {
		Utilities.highlightelementRedBorder(cartButton);
		if(cartButton.isEnabled())
			return true;
		else
			return false;
	}
	
	//====================================Home Page Currency=================================
	
		@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
		private WebElement currencyDropDown;
		public void setCurrencyDropDown() throws InterruptedException {
			currencyDropDown.click();;
			//Utilities.waitAndClickElement(currencyDropDown);
		}
		
		@FindBy(xpath="//ul[@class='dropdown-menu']//li") //button[@name='EUR']
		private List<WebElement> currencySelect;
		
		public void setCurrencySelect() throws InterruptedException {
			for(WebElement element : currencySelect) {
				if(element.getText().contains("Euro")) {
				element.click();
				break;
				}
			}

		}
		
		@FindBy(xpath="//span[text()='Currency']")
		private WebElement currencyShowed;
		public boolean getCurrencyShowed() throws IOException {
			currencyShowed.getText().contains("Currency");
			Utilities.highlightelementRedBorderAndTakeScreenshot(currencyShowed, "showed");
			return true;
			
			
		}
	
		//========================Cart option click =====================================
		
		@FindBy(xpath="//button[starts-with(@class,'btn btn-inverse')]")
		public WebElement continueButtonClick;
		public void getContinueButtonClick() {
			continueButtonClick.click();
			

		}
		
		@FindBy(xpath="//ul[starts-with(@class,'dropdown-menu p')]")
		private WebElement cartIsEmpty;
		public boolean getCartIsEmpty() {
			Utilities.highlightelementRedBorder(cartIsEmpty);
			if(cartIsEmpty.getText().contains("Your shopping cart is empty!"))
				return true;
			else
				return false;
		}
}
