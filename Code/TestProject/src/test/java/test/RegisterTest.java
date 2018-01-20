package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Constant;
import utility.Person;

public class RegisterTest extends BaseTest {
	
  @Test
  @Parameters({"email","password"})
  public void registerTest(String email, String password) {
	  app.homePage().openSignInPage();
	  
	  Person p = new Person();
	  p.setFirstName(Constant.firstName);
	  p.setLastName(Constant.lastName);
	  p.setEmail(email);
	  p.setPassword(password);
	  p.setAddress1(Constant.address1);
	  p.setCity(Constant.city);
	  p.setState(Constant.state);
	  p.setZipCode(Constant.zipCode);
	  p.setCountry(Constant.country);
	  p.setMobilePhone(Constant.mobilePhone);
	  p.setAlias(Constant.alias);
	  
	  app.signInPage().tryRegister(p);
	  
	  Assert.assertEquals(p.getFirstName() + " " + p.getLastName(), app.homePage().getSignedUser());
  }
  

}
