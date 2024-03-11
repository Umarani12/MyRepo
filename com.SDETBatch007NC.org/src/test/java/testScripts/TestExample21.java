package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample21 {

	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(),  'Sales')][1]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(),  'Orders')][1]")).click();

		Thread.sleep(5000);

		WebElement BillingCountry = driver.findElement(By.id("BillingCountryId"));

		Select selection = new Select (BillingCountry);
		
		List<WebElement>allOptions = selection.getOptions();
		
		for (WebElement singleOption : allOptions) {
			
			String value = singleOption.getText();
			
			System.out.println(value);
		}
		
		Thread.sleep(5000);
		
		driver.quit();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
