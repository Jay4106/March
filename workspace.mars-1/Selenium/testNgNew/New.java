package testNgNew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class New {
	WebDriver  d = new FirefoxDriver();
  @Test
  public void f() {
	  d.navigate().to("http://www.gmail.com");
	  
  }
  @BeforeClass
  public void beforeClass() {
  d.get("http://www.google.com");
  }
  

  @AfterClass
  public void afterClass() {
	  d.quit();
  }

}
