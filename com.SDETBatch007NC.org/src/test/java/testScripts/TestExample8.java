package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample8 {

	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver= new ChromeDriver();	
		
    driver.manage().window().maximize();
		
	driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");	
		
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
	driver.navigate().forward();
	
	Thread.sleep(5000);
	
	driver.navigate().refresh();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
	
	
	
	
	
		
		
		
		

	}

}
