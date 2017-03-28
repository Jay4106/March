package browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.name("proceed")).click();
		Thread.sleep(10000);
		Alert Pop = d.switchTo().alert();
		String PopMessage = Pop.getText();
	    System.out.println(PopMessage);
	    Pop.accept();
		

	}

}
