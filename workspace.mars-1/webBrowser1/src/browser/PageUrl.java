package browser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageUrl {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		d.findElement(By.className("gb_P")).click();
		Thread.sleep(1000);
		String URL = d.getCurrentUrl();
		
		if(URL.equals("https://www.google.com/gmail/about/"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		d.close();
		
		
		
		

	}

}
