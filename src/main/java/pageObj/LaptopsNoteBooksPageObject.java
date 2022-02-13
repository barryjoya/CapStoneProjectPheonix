package pageObj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
		
		
	}
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Add And Remove Macbook     <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Laptops & Notebooks']")
	private WebElement clickOnLaptopNoteBooks;
	public void setLaptopNotebook() {
		clickOnLaptopNoteBooks.click();
	}
	
	@FindBy(xpath = "//div[@class='dropdown-menu']//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopNotebooks;
	public void setAllLaptoNotebook() {
		showAllLaptopNotebooks.click();
		showAllLaptopNotebooks.getText();
	}
	
	@FindBy(xpath="//div[@id='content']//h2[text()='Laptops & Notebooks']")
	private WebElement notebookLaptopMessage;
	public boolean getLaptopNotebookMessage() {
		if(notebookLaptopMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//button[@id='list-view']")
	private WebElement showListView;
	public boolean setListView() {
		if(showListView.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//select[@id='input-sort']//parent::option")
	private List <WebElement> showSortBy;
	
	public void setListSortBy() {
		for (WebElement list : showSortBy) {
			list.isEnabled();
			list.getText();
		}
	}
	@FindBy(xpath="//select[@id='input-limit']//parent::option")
	private List<WebElement> showBar;
	public void setShowBar() {
		for (WebElement show : showBar) {
			show.isEnabled();
			show.getText();
		}
	}
	
	@FindBy(xpath ="//img[@alt='HP LP3065']")
	private WebElement showHP;
	public boolean getHP() {
		if(showHP.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//img[@alt='MacBook']")
	private WebElement showMacbook;
	public void setMacbook() {
		showMacbook.click();
	}
		
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement macbookAddToCart;
	public void setMacbookAddToCart() {
		macbookAddToCart.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement showMessageSuccess;
	public boolean getShowMessageSuccess() {
		Utilities.highlightelementRedBorder(showMessageSuccess);
		if(showMessageSuccess.getText().contains("Success: You have added "))
			return true;
		else
			return false;
	}
	//=====================================================================
	@FindBy(id="cart-total")
	private WebElement addToCartMessage;
	public boolean getAddToCartMessage(String str) {
		if(this.addToCartMessage.getText().contains(str))
			return true;
			else 
				return false;
	}
	
	@FindBy(xpath="//button[@type='button']//span")
	private WebElement addToCartButtonClicked;
	public void setAddToCartButtonClicked() {
		addToCartButtonClicked.click();
	}
	
	@FindBy(xpath="//button[@title='Remove']")
	private WebElement removeRedX;
	public void setRemoveRedX() {
		removeRedX.click();
	}
	
	
	@FindBy(id="cart-total")
	private WebElement messageShownEnd;
	public boolean getMessageShownEnd(String str) {
		Utilities.highlightelementRedBorder(messageShownEnd);
		if(this.messageShownEnd.getText().equalsIgnoreCase(str)) 
			return true;
			else 
			return false;
	}
	
	
	
	
	
//==================================Product Comparison===============================================
	
	@FindBy(xpath="//div[@class='row']//div//div//div//div//div//div//button[@data-original-title='Compare this Product']")
	private List<WebElement>macbookComparisonButton;
	public void getmacbookComparisonButton() {
		macbookComparisonButton.get(1).click();
	}
	
	
	
	@FindBy(xpath="//div[@class='row']//div//div//div//div//div//div//button[@data-original-title='Compare this Product']")
	private List<WebElement>macbookAirComparisonButton;
	public void getMacbookAirComparisonButton() {
		macbookAirComparisonButton.get(2).click();
	}
	
	
	
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	public boolean getSuccessMessage() {
		successMessage.getText().equalsIgnoreCase(" Success: You have added ");
			return true;
	
	}
	
	
	@FindBy(xpath ="//a[@id='compare-total']")
	private WebElement clickOnComparison;
	public void getClickOnComparison() {
		clickOnComparison.click();
	}
	
	
	@FindBy(linkText="Product Comparison")
	private WebElement productMessage;
	public boolean getProductMessage() {
		Utilities.highlightelementBackground(productMessage);
		productMessage.getText().equalsIgnoreCase("Product Comparison");
		return true;
	}
	
	
	//==========================Adding Item To WishList========================================
	
	
	@FindBy(xpath="//button[@type='button']//child::i[@class='fa fa-heart']")
	private List<WebElement> wishListButton;
	public void setWishListButton() {
		wishListButton.get(4).click();
		
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishListMessageIsDisplayed;
	public boolean getwishListMessageIsDisplayed() {
		Utilities.highlightelementRedBorder(wishListMessageIsDisplayed);
		if(wishListMessageIsDisplayed.getText().contains("You must login or create an account to save Sony VAIO to your wish list!"))
			return true;
		else
			return false;
		 
	}
	
	
	//===============================Macbook price Validation=====================
	
	@FindBy(xpath="//img[@title='MacBook Pro']")
	private WebElement clickOnMacbookPro;
	public void getClickOnMacbookPro() {
		clickOnMacbookPro.click();
	}

	
	@FindBy(xpath="//ul[@class='list-unstyled']//h2")
	private WebElement macbookProPrice;
	public boolean getMacbookProPrice(String str) {
		Utilities.highlightelementRedBorder(macbookProPrice);
		if(macbookProPrice.getText().contains("$2,000.00")) {
			return true;
		}else 
			return false;
	}
	
//	@FindBy(tagName="a")
//	private List<WebElement> verifyDesktopUI;
//	public boolean getVerifyDeskTopUi() {
//		for (WebElement element : verifyDesktopUI) {
//			
//			if(element.isDisplayed())
//				return true;
//			
//		}
//		return false;
//		
//	}
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//img[@alt='MacBook Air']")
	private WebElement showMacbookAir;
	public boolean getShowMacbookAir() {
		
		if(showMacbookAir.isDisplayed())
			return true;
		else
			return false;
		
		
		
	}
	
	@FindBy(xpath = "//img[@alt='MacBook Pro']")
	private WebElement showMacbookPro;
	public boolean getMacbookPro() {
		if(showMacbookPro.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	@FindBy(xpath = "//img[@alt='Sony VAIO']")
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
	
	
}
