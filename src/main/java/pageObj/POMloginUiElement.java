package pageObj;





import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;
import utilities.Utilities;

public class POMloginUiElement extends Base{

	public POMloginUiElement() {
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccount;
	public void getMyAccount() {
		myAccount.click();
	
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	public void getLogin() {
		login.click();
	}

	@FindBy(id = "input-email")
	private WebElement userName;
	public void getUserName(String str) {
		userName.sendKeys(str);
	}
	
	@FindBy(id="input-password")
	private WebElement password;
	public void getPassword(String str) {
		password.sendKeys(str);
	}
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement clickLogin;
	public void getClickLogin() {
		clickLogin.click();
		
		
	}
	@FindBy(xpath ="//div[@id='content']//h2[1]")
	private WebElement messageShowed;
	public boolean getMessageShowed() throws IOException {
		messageShowed.isDisplayed();
		Utilities.highlightelementBackground(messageShowed);
		if(messageShowed.getText().contains("My Account")) 
			return true;
			else
				return false;
		
	}
	
	
}
