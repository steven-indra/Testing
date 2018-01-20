package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	
	BasePage(WebDriver driver)
	{
		this.driver = driver;
		
		initializeElements();
	}
	
	protected void initializeElements()
	{
		PageFactory.initElements(driver, this);
	}
	
	protected void waitUntilElementDisplayed(WebElement element)
	{
		new WebDriverWait(driver, 30).until(x -> element.isDisplayed());
	}
	
	protected void scrollToElement(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
