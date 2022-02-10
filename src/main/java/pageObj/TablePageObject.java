package pageObj;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablePageObject extends Base  {

	
	public TablePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
