package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	WebDriver driver;
	 public DropDown(WebDriver driver) {
		this.driver=driver; 
	 }
	 
	 @FindBy(how = How.XPATH,using ="//*[@id=\"extra\"]/select[3]") WebElement DROP_DOWN_MENUE;
	 
	 
	 public List<String> listOfDropDownMonths() {
		 
		 List<String> dropDownValue = new ArrayList<String>(); //storing the elements in arraylist 
		 
		 Select sel = new Select(DROP_DOWN_MENUE); 
		 
		 List<WebElement> allOptions = sel.getOptions(); //get all options in the dropdown using the sel object variable
		 
		 for(int i=0; i<allOptions.size(); i++) {
			 dropDownValue.add(i, allOptions.get(i).getText());
		    
		 }
		return dropDownValue;
		 
}
	 public void validateDropDown() {
		 
		 DROP_DOWN_MENUE.click();
		 
		 boolean list = DROP_DOWN_MENUE.isDisplayed();
		 
		
		 if(list) {
			 System.out.println("DROP DOWN HAS ALL LIST OF MONTHS"+ " "  +list);
			 System.out.println(list);
		 
	 }else {
		 System.out.println("drop down does not have all list of months");
	 }
		 
	 }
	 

}
