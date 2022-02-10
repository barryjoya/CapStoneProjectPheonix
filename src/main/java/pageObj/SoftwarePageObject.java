package pageObj;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {

	
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}
}
