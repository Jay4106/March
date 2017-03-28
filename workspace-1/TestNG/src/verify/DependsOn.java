package verify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(verify.Listener.class)
public class DependsOn {
	WebDriver g;
	
	@BeforeClass
	public void webDriver()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
	 g= new FirefoxDriver();
	}
	@Test
	public void page(){
	
	
    
     g.get("http://www.google.com");
		g.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean b = g.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertEquals(true, b);
		
	
	}
	@Test ( dependsOnMethods = "page")
	
	public void page2()
	{
		g.navigate().to("http://www.amazon.com");
		
		
	}
    @Test ( dependsOnMethods = "page2")
	
	public void page3()
	{
		g.navigate().to("http://www.yahoo.com");
		g.quit();
		
	}
	
	

}
