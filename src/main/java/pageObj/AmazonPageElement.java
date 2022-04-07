package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class AmazonPageElement extends Base{
	
	public AmazonPageElement() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="//a[@id='nav-logo-sprites']")
	private WebElement amazonLogo;
	public void getAmazonLogo() {
		amazonLogo.isDisplayed();
	}
	
	@FindBy(xpath ="//a[@id='nav-link-accountList']")
	private WebElement acountClick;
	public void getAccountClick() {
		acountClick.click();
	}
	
	@FindBy(name ="email")
	private WebElement email;
	public void getEmail(String email) {
		this.email.sendKeys(email);
	}
	@FindBy(id="continue")
	private WebElement continueBut;
	public void getContinueBut() {
		continueBut.click();
	}
	
	@FindBy(name ="password")
	private WebElement password;
	public void getPassword(String password) {
		
		this.password.sendKeys(password);
		
	}
	
	@FindBy(id="signInSubmit")
	private WebElement submit;
	public void getSubmit() {
		submit.click();
	}
	
	@FindBy(xpath = "//span[text()='Help the people of Ukraine.']")
	private WebElement message;
	public boolean getMessage(String message) {
		Utilities.highlightelementBorderAndBackground(this.message);
		return message.equalsIgnoreCase(this.message.getText());
		
	}
	

}
