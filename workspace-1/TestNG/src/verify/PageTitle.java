 package verify;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitle {

	@Test
	public void VerifyTitle()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		String Title = d.getTitle();
		Assert.assertEquals(Title, "Google");
		d.close();
		
	}

}
