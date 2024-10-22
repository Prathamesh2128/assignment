package Farmers.Farmers;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Farmers.Farmers.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
