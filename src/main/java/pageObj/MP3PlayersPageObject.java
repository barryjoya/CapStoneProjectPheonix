package pageObj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class MP3PlayersPageObject extends Base {

	
	public MP3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='MP3 Players']")
	private WebElement showMp3Player;
	public void getMp3Player() {
		showMp3Player.click();
	}
	
	@FindBy(xpath="//a[text()='Show All MP3 Players']")
	private WebElement showAllMp3Player;
	public void getAllMp3Player() {
		showAllMp3Player.click();
	}
	
	@FindBy(xpath="//div[@id='content']//parent::h2")
	private WebElement showMp3Text;
	public boolean getMp3Text() {
		if(showMp3Text.isDisplayed()) 
			return true;
			else
				return false;
		
	}
	@FindBy(xpath="//select[@id='input-sort']//parent::option")
	private List<WebElement> showAllSortBy;
	public void getAllSortBy() {
		for (WebElement allSortby : showAllSortBy) {
			allSortby.isDisplayed();
		}
	}
	
	@FindBy(xpath="//select[@id='input-limit']//parent::option")
	private List <WebElement> showInputLimit;
	public void getInputLimit() {
		for (WebElement inputLimit : showAllSortBy) {
	inputLimit.getText();
		}
	}
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement button;
	public boolean getButton() {
		if(button.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//button[@id='grid-view']")
	private WebElement button1;
	public boolean getButton1() {
		if(button1.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//a[text()='Product Compare (0)']")
	private WebElement ProductCompare;
	public boolean getProductCompare() {
		if(ProductCompare.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//label[text()='Sort By:']")
	private WebElement SortBy;
	public boolean getSortBy() {
		if(SortBy.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//select[@id='input-sort']//parent::option")
	private List<WebElement> inputSort;
	public void getInputSort() {
		for (WebElement sort : inputSort) {
			sort.getText();
			System.out.println(sort.toString().substring(1, 3));
		}
	}
	
	
	@FindBy(xpath="//label[text()='Show:']")
	private WebElement showButton;
	public boolean getShowButton() {
		if(showButton.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy (xpath = "//div[@class='caption']//child::p[1]")
	private List<WebElement> ipodText;
	public void getIpodText() {
	for(WebElement i:ipodText) {
		if(i.getText().contains("Born to be worn")) {
			i.isDisplayed();
		}
	}
	}
	
	
   
	
	
	@FindBy(xpath="//div[@class='caption']//child::p[1]")
	private List<WebElement> ipodNano;
	public void getIpodNano() {
		for (WebElement nano : ipodNano) {
			if(nano.getText().contains("Video in your pocket")) {
				nano.isDisplayed();
			}
		}
		
		
		
	}
	
	@FindBy(xpath="//div[@class='caption']//child::p[1]")
	private List<WebElement> ipodClassic;
	public void getIpodClassic() {
		for (WebElement classic : ipodClassic) {
			if(classic.getText().contains("More room to movet")) {
				classic.isDisplayed();
			}
		}
	}	
		@FindBy(xpath="//div[@class='caption']//child::p[1]")
		private List<WebElement> ipodTouch;
		public void getIpodTouch() {
			for (WebElement touch : ipodTouch) {
				if(touch.getText().contains("Revolutionary multi-touch interface")) {
					touch.isDisplayed();
				}
			}
		}
		
		
		
		
	
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[1]//div//div[2]//div[2]//button[1]")
	private WebElement addToCartClassic;
	public boolean geAddToCartClassic() {
		if(addToCartClassic.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[1]//div//div[2]//div[2]//button[2]")
	private WebElement wishListClassic;
	public boolean getWishListClassic() {
		if(wishListClassic.isDisplayed())
			return true;
		else
			return false;
	}
	@FindBy(xpath="//div[@id='content']//div[4]//div[1]//div//div[2]//div[2]//button[3]")
	private WebElement addToCompareClassic;
	public boolean getAddToCompareClassic() {
		if(addToCompareClassic.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[2]//div//div[2]//div[2]//button[1]")
	private WebElement addToCartNano;
	public boolean getAddToCartNano() {
		if(addToCartNano.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[2]//div//div[2]//div[2]//button[2]")
	private WebElement addToWishListNano;
	public boolean getAddToWishListNano() {
		if(addToWishListNano.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[2]//div//div[2]//div[2]//button[3]")
	private WebElement addToCompareNano;
	public boolean getAddToCompareNano() {
		if(addToCompareNano.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	private WebElement addToCartShuffle;
	public boolean getAddToCartShuffle() {
		if(addToCartShuffle.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[2]")
	private WebElement addToWishShuffle;
	public boolean getAddToWishShuffle() {
		if(addToWishShuffle.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement addToCompareShuffle;
	public boolean getAddToCompareShuffle() {
		if(addToCompareShuffle.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[4]//div//div[2]//div[2]//button[1]")
	private WebElement addToCartTouch;
	public boolean getAddToCartTouch() {
		if(addToCartTouch.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[4]//div//div[2]//div[2]//button[2]")
	private WebElement addToWishTouch;
	public boolean getAddToWishTouch() {
		if(addToWishTouch.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath="//div[@id='content']//div[4]//div[4]//div//div[2]//div[2]//button[3]")
	private WebElement addToCompareTouch;
	public boolean getAddToCompareTouch() {
		if(addToCompareTouch.isDisplayed())
			return true;
		else
			return false;
		
	}
	

	
	
}
