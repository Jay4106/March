package gmailLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
     WebDriver d = new FirefoxDriver();
     d.get("http://www.google.com");
     d.navigate().to("http://www.facebook.com");
	}

}
