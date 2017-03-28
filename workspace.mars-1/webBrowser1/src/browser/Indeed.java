package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Indeed {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/chromeDriver.exe");
	
         driver= new ChromeDriver();
         driver.get("www.indeed.com");
         driver.findElement(By.id("where"));
         driver.close();
	}

}
