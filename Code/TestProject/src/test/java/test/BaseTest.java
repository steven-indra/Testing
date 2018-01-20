package test;


import pageObjects.AppPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
  protected AppPage app;
  private WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/java/test/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	  
	  app = new AppPage(driver);
  }

  @AfterTest
  public void afterTest() {
	  if (app != null) {
			app.quit();
		}
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://automationpractice.com");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
