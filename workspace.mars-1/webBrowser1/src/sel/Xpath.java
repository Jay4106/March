package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko");
		WebDriver d = new FirefoxDriver();
		d.get("http://automationpractice.com/index.php?controller=authentication&back=order-slip");
		//absolute xpath. creates problem when physical location of the element changes
		d.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/b")).click();
		//// navigating back
		d.navigate().back();
		//using relative path. short and accurate even if the physical place changes 
		d.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]")).click();	
		d.close();

	}

}
