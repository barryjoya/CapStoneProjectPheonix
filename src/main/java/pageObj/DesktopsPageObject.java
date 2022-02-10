package pageObj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {
	
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement messageTest;
	
	public boolean getText() {
		messageTest.isDisplayed();
		String actualMessage="TEST ENVIRONMENT";
		String expectedMessage =messageTest.getText();
		if(actualMessage.equalsIgnoreCase(expectedMessage))
			
		return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Desktops']")
	private WebElement desktopClick;
	public void getDesktop() {
		desktopClick.click();
	}
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement allDesktop;
	public void getAllDesktop() {
		allDesktop.click();
	}
	
	@FindBy(xpath="//h2[text()='Desktops']")
	private WebElement desktopMessage;
	public boolean getDesktopMessage(String message) {
		return message.equalsIgnoreCase(desktopMessage.getText());
	}
	
	
	
	
	@FindBy(xpath ="//img[@title='Apple Cinema 30\"']")
	private WebElement showAppleCinema;
	public boolean getAppleCinema() {
		if(showAppleCinema.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@title='Canon EOS 5D']")
	private WebElement showCanonEOS;
	public boolean getCanonsEOS() {
		if(showCanonEOS.isDisplayed())
			return true;
		else
			return false;
		
	}
	
//	@FindBy(xpath="//div[@id='content']//div[4]//div[2]//div//div[2]//div[2]//button[1]//span")
//	private WebElement addToCartCanon;
//	public void getAddToCartCanon() {
//		addToCartCanon.click();
//	}
	
	//========================== Canon Add to Cart==============================
	@FindBy(xpath="//span[text()='Add to Cart']")
	private List<WebElement> addToCartCanon;
	public void setAddToCartCanon() {
		for (int i = 0; i < addToCartHp.size(); i++) {
			if(i==1) {
				addToCartCanon.get(i).click();
				break;
			}
		}
	}

	@FindBy(xpath="//select[@id='input-option226']//child::option")//select[@id='input-option226']//child::option[@value='15']
	private List<WebElement> canonColorOption;
	public void setCanonColorOption() {
		for (int i = 0; i <canonColorOption.size() ; i++) {
			if(this.canonColorOption.get(i).getText().equalsIgnoreCase("red")) {
				canonColorOption.get(i).click();
				break;
			}
			
		}
	}
	
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement quantityCanon;
	public void setQuantityCanon() {
		quantityCanon.clear();
		quantityCanon.sendKeys("1");
		
	}
	 
	@FindBy(xpath ="//button[@id='button-cart']")
	private WebElement addToCartNextPageCanon;
	public void setAddToCartNextPageCanon() {
		addToCartNextPageCanon.click();
	}
	
	@FindBy(xpath ="//div[text()='Success: You have added ']")
	private WebElement canonSuccesMessage;
	public boolean getCanonSuccesMessage() {
		canonSuccesMessage.isDisplayed();
		String actual = canonSuccesMessage.getText();
		String expected = "Success: You have added";
		if(actual.contains(expected))
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//img[@title='HP LP3065']")
	private WebElement showHP;
	public boolean getShowHP() {
		if(showHP.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	private List<WebElement> addToCartHp;
	public void getAddToCartHp() {
		for (int i = 0; i < addToCartHp.size(); i++) {
			if(i==2) {
				addToCartHp.get(i).click();
				break;
			}
				
			
		}
		
	}
	
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement quantityHp;
	public void getQuantityHp() {
		quantityHp.clear();
		quantityHp.sendKeys("1");
		
	}
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement addToCartHpNextPage;
	public void getAddToCartHpNextPage() {
		addToCartHpNextPage.click();
	}
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageSuccessHP;
	public boolean getmessageSuccessHP() {
		
		if(messageSuccessHP.getText().contains("Success: You have added")) 
			return true;
			else
				return false;
	
	}
	
	//==============================Canon Review ================================================
	
	@FindBy(xpath="//a[text()='Canon EOS 5D Camera']")
	private WebElement clickOnCanonImg;
	public void setClickOnCanonImg() {
		clickOnCanonImg.click();
	}
	
	
	
	@FindBy(xpath ="//a[text()='Reviews (0)'] ")
	private WebElement clickOnReview;
	public void setClickOnReview() {
		clickOnReview.click();
	}
	
	
	@FindBy(xpath ="//input[@id='input-name'] ")
	private WebElement firstName;
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
		
	}
	
	@FindBy(xpath="//textarea[@id='input-review']")
	private WebElement inputText;
	public void setInputText(String text) {
		inputText.sendKeys(text);
	}
	
	
	@FindBy(xpath="//div[@class='form-group required']//div//input")
	private List <WebElement> ratingField;
	public void setRatingField(String number) {
		for (Integer i = 0; i < ratingField.size(); i++) {
			if(i.toString().equalsIgnoreCase(number)) {
				ratingField.get(i).click();
				break;
			}
			
		}
	}
	
	
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement continueButton;
	public void setContinueButton() {
		continueButton.click();
	}
	
	
	
	@FindBy(xpath="//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement messageShowSuccessfully;
	public boolean getMessageShowSuccessfully() {
		if(messageShowSuccessfully.isDisplayed())
			return true;
		else
			return false;
		
		//===============================================================================
		
		
	}
	@FindBy(xpath ="//img[@title='HTC Touch HD']")
	private WebElement showHTC;
	public boolean getHTC() {
		if(showHTC.isDisplayed())
			return true;
		else
			return false;
	}
	@FindBy(xpath="//img[@title='iPhone']")
	private WebElement showIphone;
	public boolean getIphone() {
		if(showIphone.isDisplayed())
			return true;
		else
			return false;
	}

	
	@FindBy(xpath="//img[@title='iPod Classic']")
	private WebElement showIpod;
	public boolean getIpod() {
		if(showIpod.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@title='MacBook']")
	private WebElement showMacbook;
	public boolean getMacbook() {
		if(showMacbook.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@title='MacBook Air']")
	private WebElement showMacbookAir;
	public boolean getMacbookAir() {
		if(showMacbookAir.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@title='Palm Treo Pro']")
	private WebElement showPalm;
	public boolean getPalm() {
		if(showPalm.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@title='Product 8']")
	private WebElement showProduct8;
	public boolean getProduct8() {
		if(showProduct8.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@title='Samsung SyncMaster 941BW']")
	private WebElement showSamsung;
	public boolean getSamsung() {
		if(showSamsung.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@title='Sony VAIO']")
	private WebElement showSonyVaio;
	public boolean getSonyVaio() {
		if(showSonyVaio.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@class='list-group']//parent::a")
	private List<WebElement> showAllTaskBar;
	public void getAllTaskBar() {
		for (WebElement taskBar : showAllTaskBar) {
			taskBar.getText();
			taskBar.isDisplayed();
		}
	}
	
	//====================================Home Page Currency=================================
	
	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencyDropDown;
	public void getCurrencyDropDown() {
		currencyDropDown.click();
	}
	
	@FindBy(name="EUR") //button[@name='EUR']
	private WebElement currencySelect;
	public void getCurrencySelect() {
		currencySelect.click();
	}
	
}
