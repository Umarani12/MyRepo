package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample6 {

	public static void main(String[] args) throws InterruptedException{
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");	
		
		List<WebElement>allinputs=driver.findElements(By.xpath("//div[@class='master-wrapper-page']/preceding::div"));
				
		int count = allinputs.size();
		
		System.out.println("All inputs size is:" + count);	
				
				Thread.sleep(5000);
				
				driver.quit();
				
				
				
				
				
				
				
				
		
		
		

	}

}
