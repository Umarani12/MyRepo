package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestExample26 {

	public static void main(String[] args) throws Exception{
		
		
		ChromeDriver driver = new ChromeDriver();
		
		Actions action = new Actions(driver);

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
       
		Thread.sleep(5000);
		
		action.moveToElement(driver.findElement(By.id("Email"))).perform();
		
		
		action.doubleClick().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.tagName("Button")).click();

		Thread.sleep(4000);
		
		action.moveToElement(driver.findElement(By.id("nopSideBarPusher"))).perform();
		
		Thread.sleep(4000);
		
		action.click().perform();
		
		Thread.sleep(4000);
		
		action.contextClick().perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		

		
		
		
		
		
		

	}

}
