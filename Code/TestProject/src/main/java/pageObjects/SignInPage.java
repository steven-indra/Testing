package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import utility.Person;

public class SignInPage extends BasePage {
	
	@FindBy(how = How.ID, using="email_create")
	public WebElement emailRegister;
	
	@FindBy(how = How.ID, using="SubmitCreate")
	public WebElement createAccountBtn;
	
	@FindBy(how = How.ID, using="customer_firstname")
	public WebElement firstName;
	
	@FindBy(how = How.ID, using="customer_lastname")
	public WebElement lastName;
	
	@FindBy(how = How.ID, using="passwd")
	public WebElement password;
	
	@FindBy(how = How.ID, using="address1")
	public WebElement address1;
	
	@FindBy(how = How.ID, using="city")
	public WebElement city;
	
	@FindBy(how = How.ID, using="id_state")
	public WebElement state;
	
	@FindBy(how = How.ID, using="postcode")
	public WebElement zipCode;
	
	@FindBy(how = How.ID, using="id_country")
	public WebElement country;
	
	@FindBy(how = How.ID, using="phone_mobile")
	public WebElement mobilePhone;
	
	@FindBy(how = How.ID, using="alias")
	public WebElement alias;
	
	@FindBy(how = How.ID, using="submitAccount")
	public WebElement submitAccountBtn;
	
	@FindBy(how = How.ID, using="SubmitLogin")
	public WebElement submitLoginBtn;
	
	@FindBy(how = How.ID, using="email")
	public WebElement loginEmail;
	
	@FindBy(how = How.ID, using="passwd")
	public WebElement loginPassword;
	
	public Select dropDownState;
	public Select dropDownCountry;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void tryRegister(Person registerData)
	{
		emailRegister.sendKeys(registerData.getEmail());
		createAccountBtn.click();
		
		waitUntilElementDisplayed(firstName);
		
		firstName.sendKeys(registerData.getFirstName());
		lastName.sendKeys(registerData.getLastName());
		password.sendKeys(registerData.getPassword());
		address1.sendKeys(registerData.getAddress1());
		city.sendKeys(registerData.getCity());
		dropDownState = new Select(state);
		dropDownState.selectByVisibleText(registerData.getState());
		zipCode.sendKeys(registerData.getZipCode());
		dropDownCountry = new Select(country);
		dropDownCountry.selectByVisibleText(registerData.getCountry());
		mobilePhone.sendKeys(registerData.getMobilePhone());
		alias.sendKeys(registerData.getAlias());
		
		scrollToElement(submitAccountBtn);
		submitAccountBtn.click();

	}
	
	public void tryLogin(String email, String password)
	{
		loginEmail.sendKeys(email);
		loginPassword.sendKeys(password);
		submitLoginBtn.click();
	}
}
