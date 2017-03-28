package carrerLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\gecko\\geckodriver.exe");
		WebDriver c = new FirefoxDriver();
		c.get("http://www.careerbuilder.com");
		c.findElement(By.id("header-menu-sign-in-link"));
	}

}
