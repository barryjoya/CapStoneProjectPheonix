package pageObj;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utilities;

public class gmailElements extends Base {

	public gmailElements(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement userName;
	public void getUserName(String userName) {
		this.userName.sendKeys(userName);
		this.userName.findElement(By.xpath("//span[text()='Next']")).click();
		
	}
	
	@FindBy(xpath ="//input[@type='password']")
	private WebElement password;
	public void getPassword(String password) {
		this.password.sendKeys(password);
		this.userName.click();

	}
	
	@FindBy(id=":a.mn")
	private WebElement message;
	public void getMessage() throws IOException {
		message.getText();
		Utilities.takeScreenShot("gmail Message");
		Utilities.highlightelementRedBorder(message);
	}
	
}
