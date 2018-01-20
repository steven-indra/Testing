package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BugTest extends BaseTest {
  
  @Test
  public void BUG001() {
	  app.homePage().openTShirtsCategory();
	  app.shopPage().checkedAvailability();
	  Assert.assertFalse(app.shopPage().isAlertDisplayed(),"There should be no alert displayed");
  }
}
