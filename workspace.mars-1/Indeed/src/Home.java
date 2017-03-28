import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Home {

	public static void main(String[] args) throws Throwable {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
		WebDriver i = new FirefoxDriver();
		i.get("http://www.indeed.com");
		//String Handle = i.getWindowHandle();
		//System.out.println(Handle);
		i.findElement(By.id("where")).clear();
		i.findElement(By.id("what")).clear();
		
		//i.findElement(By.linkText("Advanced Job Search")).click();
		/*i.findElement(By.id("as_any")).sendKeys("QA Selenium Testng cucumber");
		Select dropdown = new Select (i.findElement(By.id("jt")));
		dropdown.deselectByValue("Contract");
		i.findElement(By.id("where")).clear();
		Select dropdown2 = new Select (i.findElement(By.id("fromage")));
		dropdown2.selectByValue("within 7 days");
		Select dropdown3 = new Select (i.findElement(By.id("sort")));
		dropdown3.selectByValue("date");
		i.findElement(By.id("sort")).click();*/
		i.findElement(By.id("fj")).click();
		Thread.sleep(2000);
		i.navigate().refresh();
		Thread.sleep(1000);
		i.findElement(By.linkText("date")).click();
		
		/*System.out.println("alert started");
		Actions action = new Actions(i);
		WebElement mouseover = i.findElement(By.id("prime-popover-close-button"));
		Thread.sleep(3000);
		action.moveToElement(mouseover).click().perform();
		System.out.println("alert ended");*/
	}

}

