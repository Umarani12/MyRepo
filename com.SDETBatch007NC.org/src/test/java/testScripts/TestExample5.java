package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample5 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Password']"));
		
		Thread.sleep(6000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
