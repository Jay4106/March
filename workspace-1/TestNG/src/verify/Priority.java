package verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Priority {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("http://www.gmail.com");
		d.findElement(By.id("Email")).sendKeys("vraj0852");
		d.findElement(By.id("next")).click();
		String sv= d.findElement(By.id("email-display")).getText();
		System.out.println(sv);
		Assert.assertTrue(true, sv);
		d.close();
		
	}
	

}
