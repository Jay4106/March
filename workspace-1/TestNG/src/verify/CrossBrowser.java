package verify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver d;
	@Test
	@Parameters("browser")
	public void browserName(String Browser)
	{
		if(Browser.equalsIgnoreCase("firefox"))
		{
       System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
       d= new FirefoxDriver();
       System.out.println("firefox Started");
		}
		else if(Browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromeDriver\\chromedriver.exe");
		d= new ChromeDriver();
		System.out.println("chrome started");
		}
		
		else if(Browser.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Java\\ieDriver\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		d = new InternetExplorerDriver(capabilities);
		d.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		System.out.println("ie started");
		}
		
	}
	@Test(dependsOnMethods="browserName")
	public void page()
	{
		d.get("http://www.google.com");
		d.get("http://www.yahoo.com");
		d.quit();
	}
}
