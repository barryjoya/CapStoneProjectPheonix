package pageObj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AolLogin extends Base {

	public AolLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='desktop-user-navigation' and @id='td-app-aol-module-2']//span//following::span[contains(text(),'Login / Join')]")
	private List<WebElement> login;
	
	public void getLogin() {
		for (WebElement i : login) {
			if(i.getText().equals(1)) {
				i.click();
			}
		}
	}
	
	
}
