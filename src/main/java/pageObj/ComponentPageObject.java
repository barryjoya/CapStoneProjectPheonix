package pageObj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentPageObject extends Base {

	public ComponentPageObject() {
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Components']")
	private WebElement clickOnComponent;
	public void getClickComponent() {
		clickOnComponent.click();
	}
	
	@FindBy(xpath="//a[text()='Show All Components']")
	private WebElement showAllComponent;
	public void getShowAllcomponent() {
		showAllComponent.click();
	}
	
	@FindBy(xpath="//div[@id='content']//child::h2[text()='Components']")
	private WebElement showComponent;
	public boolean getAllComponents() {
		if (showComponent.isDisplayed()) 
			return true;
					
		else 
			return false;
		
	}
	
	
	@FindBy(xpath="//div[@class='list-group']//child::a")
	private List<WebElement> showAll;
	
	public void getShwoAll() {
		for (WebElement element : showAll) {
			element.isDisplayed();
			element.getText();
			
		}
	}
	
	@FindBy(xpath="//img[@class='img-responsive']")
	private WebElement HpImageIsDisplayed;
	public boolean getHPImage() {
		if(HpImageIsDisplayed.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	
}
