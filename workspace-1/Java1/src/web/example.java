package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create the browser object
		
				WebDriver d=new FirefoxDriver();
				
				
				
				
				// navigate to
				d.navigate().to("http://www.facebook.com");
				
				// back to url
				d.navigate().back();
				
				
				// forward url
				d.navigate().forward();
				
				
				// open gmail
				
				d.get("http://www.gmail.com");
				
				d.findElement(By.id("Email")).sendKeys("maheshprojectdeveloper@gmail.com");
				
				d.findElement(By.xpath(".//*[@id='next']")).click();
				
				

			}

		}