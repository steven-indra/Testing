package pageObjects;

import org.openqa.selenium.WebDriver;

public class AppPage {
	WebDriver driver;
	
	public AppPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage homePage() {
        return new HomePage(driver);
    }
	
	public SignInPage signInPage() {
        return new SignInPage(driver);
    }
	
	public ShopPage shopPage() {
        return new ShopPage(driver);
    }
    
    public void quit() {
        driver.quit();
    }
}
