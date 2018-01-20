package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopPage extends BasePage {

	@FindBy(how = How.ID, using="layered_quantity_1")
	private WebElement availabilityCheck;
	
	@FindBy(how = How.CLASS_NAME, using="alert-warning")
	private WebElement alert;
	
	public ShopPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void checkedAvailability()
	{
		toogleFilter(availabilityCheck);
	}
	
	private void toogleFilter(WebElement element)
	{
		element.click();
	}
	
	public String getAlertText()
	{
		return alert.getText();
	}
	
	public Boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
}
