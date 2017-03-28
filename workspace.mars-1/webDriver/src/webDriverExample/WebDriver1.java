package webDriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver1 {

	public static void main(String[] args)
	{
		// create the browser object
				
		WebDriver d=new FirefoxDriver();
		
		
		//  open url		
		d.get("https://www.google.co.in");
		
		
		// get the title
		String t = d.getTitle();
		System.out.println("Title : "+t);
		
		
		// get the current url
		
		String url = d.getCurrentUrl();
		System.out.println("Current Url : "+url);
		
		
		// navigate to
		d.navigate().to("http://www.facebook.com");
		
		// back to url
		d.navigate().back();
		
		
		// forward url
		d.navigate().forward();
		
		
		// open gmail
		
		d.get("http://www.gmail.com");
		
		d.findElement(By.id("Email")).sendKeys("vj@gmail.com");
		
		d.findElement(By.xpath(".//*[@id='next']")).click();
		
		

	}

}

