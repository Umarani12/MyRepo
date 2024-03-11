package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample22 {

	public static void main(String[] args) throws Exception {
		
        ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),  'Sales')][1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),  'Orders')][1]")).click();

		Thread.sleep(3000);

		WebElement BillingCountry = driver.findElement(By.id("BillingCountryId"));

		Thread.sleep(3000);
				
		BillingCountry.sendKeys(Keys.DOWN); 
		
		Thread.sleep(3000);
		
		BillingCountry.sendKeys(Keys.DOWN);
		
		Thread.sleep(3000);
		
		BillingCountry.sendKeys(Keys.DOWN) ;
		
		Thread.sleep(3000);
		
		BillingCountry.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
