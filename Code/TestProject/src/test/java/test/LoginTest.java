package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
  @Test
  @Parameters({"email","password"})
  public void trySuccessLogin(String email, String password) {
	  app.homePage().openSignInPage();
	  app.signInPage().tryLogin(email, password);
	  assertTrue(app.homePage().isLogoutDisplayed());
  }
  
  @Test
  @Parameters({"password"})
  public void tryFailureLogin(String password) {
	  app.homePage().openSignInPage();
	  app.signInPage().tryLogin("WrongEmail", password);
	  assertTrue(app.homePage().isSignInDisplayed());
  }
}
