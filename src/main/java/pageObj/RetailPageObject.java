package pageObj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class RetailPageObject extends Base{

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
//==============================  Affiliate User With Check Payment =======================
	
	
	
	@FindBy(xpath ="//a[text()='Register for an affiliate account']")
	private WebElement affiliateButton;
	public void setAffiliateButton() {
		affiliateButton.click();
	}
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement clickOnContinueOption;
	public void setClickOnContinueOption() {
		clickOnContinueOption.click();
	}
	
//	@FindBy(id="input-firstname")
//	private WebElement firstNameField;
//	public void getFirstNameField(String fName) {
//		firstNameField.sendKeys(fName);
//	}
//	
//	@FindBy(id="input-lastname")
//	private WebElement lastNameField;
//	public void getLastNameField(String lastName) {
//		lastNameField.sendKeys(lastName);
//	}
//	
//	@FindBy(id="input-email")
//	private WebElement inputEmail;
//	public void getInputEmail(String email) {
//		inputEmail.sendKeys(email);
//	}
//	
//	@FindBy(id="input-telephone")
//	private WebElement inputTelephone;
//	public void getInputTelephone(String telephone) {
//		inputTelephone.sendKeys(telephone);
//	}
	
	@FindBy(id="input-company")
	private WebElement inputCompany;
	public void setInputCompany(String company) {
		inputCompany.sendKeys(company);
	}
	
	@FindBy(id="input-website")
	private WebElement inputWebsite;
	public void setInputWebsite(String website) {
		inputWebsite.sendKeys(website);
	}
	
	@FindBy(id="input-tax")
	private WebElement inputTax;
	public void setInputTax(String tax) {
		inputTax.sendKeys(tax);
	}
	
	@FindBy(xpath="//input[@value='paypal']")
	private WebElement paymentMethod;
	public void setPaymentMethod(String payPal) {
		paymentMethod.click();
	}
	
	@FindBy(id="input-paypal")
	private WebElement inputCheque;
	public void setInputCheque(String cheque) {
		inputCheque.sendKeys(cheque);
	}
	
	@FindBy(id="input-password")
	private WebElement inputPassword;
	public void setInputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@placeholder='Password Confirm']")
	private WebElement confirmPassword;
	public void setConfirmPassword(String confirmPass) {
		confirmPassword.sendKeys(confirmPass);
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	public void setCheckBox() {
		checkBox.click();
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement clickOnContinue;
	public void setClickOnContinue() {
		clickOnContinue.click();
	}
	
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']") //div[@id='content']//h1
	private WebElement successMessage;
	
	public boolean getSuccessMessage() {
		Utilities.highlightelementRedBorder(successMessage);

		if(successMessage.getText().equalsIgnoreCase("Success: Your account has been successfully updated."))
		return true;
		else 
			return false;
	}
	
	
	//====================================== Account Sign in  =======================================
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement clickOnAccount;
	public void getClickOnAccount() {
		clickOnAccount.click();
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement clickOnLogin;
	public void getClickOnLogin() {
		clickOnLogin.click();
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement userName;
	public void getUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	public void getPassword(String password) {
		this.password.sendKeys(password);
	}
	
	
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement submitButton;
	public void getSubmitButton() {
		submitButton.click();
	}
	
	@FindBy(xpath="//div[@id='content']//h2[text()='My Account']")
	private WebElement verifyLoginPage;
	
	public boolean getVerifyLoginPage() {
		Utilities.highlightelementRedBorder(verifyLoginPage);

		if(verifyLoginPage.isDisplayed());
			return true;
		//if(verifyLoginPage.getText().equalsIgnoreCase("My Account"))
		
		//else
			//return false;
		
	}
	
	//=============================== Edit Affiliate Information ===========================================
	
	@FindBy(linkText="Edit your affiliate information")
	private WebElement editInfo;
	public void getEditInfo() {
		editInfo.click();
	}
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankRadioButton;
	public void getBankRadioButton() {
		bankRadioButton.click();
	}
	
	@FindBy(id="input-bank-name")
	private WebElement bankInputField;
	public void getBankInputField(String bankName) {
		bankInputField.sendKeys(bankName);
	}
	
	@FindBy(id="input-bank-branch-number")
	private WebElement bankBranchField;
	public void getBankBranchField(String branchName) {
		bankBranchField.sendKeys(branchName);
	}
	
	
	@FindBy(id="input-bank-swift-code")
	private WebElement bankSwiftField;
	public void getBankSwiftField(String bankSwift) {
		bankSwiftField.sendKeys(bankSwift);
	}
	
	@FindBy(id="input-bank-account-name")
	private WebElement bankAccountName;
	public void getBankAccountName(String accountName) {
		bankAccountName.sendKeys(accountName);
	}
	
	@FindBy(id="input-bank-account-number")
	private WebElement bankAccountNumber;
	public void getBankAccountNumber(String accountNumber) {
		bankAccountNumber.sendKeys(accountNumber);
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	public void getContinueButton() {
		continueButton.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAlertMessage;
	public boolean getSuccessAlertMessage() {
		if(successAlertMessage.getText().equalsIgnoreCase(" Success: Your account has been successfully updated."))
			return true;
		else
			return false;
	}
	//=========================Edit Account Information ===========================================
	
	@FindBy(linkText="Edit your account information")
	private WebElement editAccountInformation;
	public void setEditAccountInformation() {
		editAccountInformation.click();
	}
	
	@FindBy(id="input-firstname")
	private WebElement inputFirstName;
	public void setInputFirstName(String fName) {
		inputFirstName.clear();
		inputFirstName.sendKeys(fName);
	}
	
	@FindBy(id="input-lastname")
	private WebElement inputLastName;
	public void setInputLastName(String lName) {
		inputLastName.clear();
		inputLastName.sendKeys(lName);
	}
	
	@FindBy(id="input-email")
	private WebElement inputEmailField;
	public void setInputEmailField(String email) {
		inputEmailField.clear();
		inputEmailField.sendKeys(email);
	}
	
	@FindBy(id="input-telephone")
	private WebElement inputTelephoneField;
	public void setInputTelephoneField(String Telephon) {
		inputTelephoneField.clear();
		inputTelephoneField.sendKeys(Telephon);
	}
	
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButtonOption;
	public void setContinueButtonOption() {
		continueButtonOption.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertSuccess;
	public boolean getAlertSuccess() {
		if(alertSuccess.getText().contains("Success"))
			return true;
		else
			return false;
	}
	
}
