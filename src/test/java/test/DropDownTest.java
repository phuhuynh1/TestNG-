package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DropDown;
import util.BrowserFactory;

public class DropDownTest {
	
WebDriver driver;
	
	@Test
	public void validateDropDownMenue() {
		
		driver = BrowserFactory.browserInit();
		DropDown dropDownList = PageFactory.initElements(driver, DropDown.class);
		dropDownList.listOfDropDownMonths();
		dropDownList.validateDropDown();
	}
}

