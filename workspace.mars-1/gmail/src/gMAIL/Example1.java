package gMAIL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {

		// Create the WebDriver
		WebDriver d = new FirefoxDriver();

		// Open Url
		Thread.sleep(10000);
		d.get("https://www.google.co.in/?gws_rd=ssl");

		// click on hyperlink
		Thread.sleep(10000);
		d.findElement(By.linkText("Gmail")).click();

		// send the emailid to textbox
		Thread.sleep(10000);
		d.findElement(By.id("Email")).sendKeys(
				"maheshprojectdeveloper@gmail.com");

		// click on nextbutton
		Thread.sleep(10000);
		d.findElement(By.xpath(".//*[@id='next']")).click();

		// send the password to textbox
		Thread.sleep(10000);
		d.findElement(By.name("Passwd")).sendKeys("lakshmi@143");

		// click on signbutton
		Thread.sleep(10000);
		d.findElement(By.id("signIn")).click();

		// click on hyperlink
		Thread.sleep(10000);
		d.findElement(
				By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a"))
				.click();

		// click on signout button
		Thread.sleep(10000);
		d.findElement(By.xpath(".//*[@id='gb_71']")).click();

	}

}
