
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


package uk;


public class Sel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread.sleep(2000);

		WebDriver dr=new FirefoxDriver();

		dr.get("https://uk.webuy.com/");
		dr.findElement(By.id("stext")).sendKeys("iphone");
		dr.findElement(By.xpath(".//*[@id='topLinksArea']/ul/li[1]/a")).click();
		dr.findElement(By.class("listBuyButton_mx")).click();
		dr.findElement(By.class("listBuyButton_mx")).click();
		dr.findElement(By.xpath(".//*[@id='buyBasketRow']/td[2]/a")).click();
		dr.findElement(By.xpath("html/body/div[4]/div[1]/div[3]/div[2]/form/table/tbody/tr[1]/td[5]/a/img
		")).click()
		dr.findElement(By.class(“ buybasket”)).click();


	}

}
