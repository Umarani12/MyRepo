package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample3 {

	public static void main(String[] args) {
		
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
	driver.findElement(By.id("Email")).clear();

	driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

	driver.findElement(By.name("Password")).clear();

	driver.findElement(By.name("Password")).sendKeys("admin");

	driver.findElement(By.tagName("button")).click();

		
		
		
		
		
		
		
		

	}

}
