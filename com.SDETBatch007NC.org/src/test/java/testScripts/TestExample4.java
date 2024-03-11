package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample4 {

	 public static void main(String[] args)  throws InterruptedException {
		
    ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	
	driver.manage().window().maximize();
	
	   WebElement email = driver.findElement(By.id("Email"));
	
	   email.clear();
	
	   email.sendKeys("admin@yourstore.com");
	
	   Thread.sleep(6000);
	

	   driver.quit();
	
	}

}
