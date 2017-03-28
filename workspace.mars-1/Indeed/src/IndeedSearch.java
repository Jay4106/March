import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedSearch {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromeDriver\\chromedriver.exe");
		WebDriver i = new FirefoxDriver();
		i.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		i.get("http://www.indeed.com");
		i.findElement(By.id("what")).sendKeys("QA Selenium Testng cucumber");
		i.findElement(By.id("where")).clear();
		i.findElement(By.id("fj")).click();
		//Thread.sleep(1000);
		i.navigate().refresh();
		//Thread.sleep(1000);
		i.findElement(By.linkText("date")).click();
		//Thread.sleep(1000);
		i.findElement(By.linkText("Contract")).click();
	}

}
