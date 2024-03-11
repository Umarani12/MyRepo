package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample16 {

	public static void main(String[] args) throws InterruptedException{
		
     ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	Thread.sleep(5000);
	
	String Val= driver.findElement(By.tagName("button")).getText();
	
	System.out.println(Val);
	
	String nameVal = driver.findElement(By.id("Email")).getAttribute("name");
	
	System.out.println(nameVal);
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	}

}
