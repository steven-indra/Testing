package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

	@FindBy(how = How.LINK_TEXT, using="Sign in")
	private WebElement signIn;
	
	@FindBy(how = How.LINK_TEXT, using="T-SHIRTS")
	private WebElement tShirts;
	
	@FindBy(how = How.CLASS_NAME, using="account")
	private WebElement signedUser;
	
	@FindBy(how = How.CLASS_NAME, using="logout")
	private WebElement logoutBtn;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void openSignInPage()
	{
		signIn.click();
	}
	
	public void openTShirtsCategory()
	{
		tShirts.click();
	}
	
	public String getSignedUser()
	{
		waitUntilElementDisplayed(signedUser);
		return signedUser.getText();
	}
	
	public Boolean isLogoutDisplayed()
	{
		return logoutBtn.isDisplayed();
	}
	
	public Boolean isSignInDisplayed()
	{
		return signIn.isDisplayed();
	}
}
