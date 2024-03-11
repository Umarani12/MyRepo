package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample31 {

	public static void main(String[] args) throws Exception{
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		boolean appear = driver.findElement(By.id("Email")).isDisplayed();
		
		if(appear= true) {
			System.out.println("Login Page got Loaded Successfully");
		driver.findElement(By.tagName("button")).click();
		}
		else {
			System.out.println("Login Page not Loaded So Iam Refreshing the Page");
			driver.navigate().refresh();
		}
		Thread.sleep(5000);
		driver.quit();
			
			}
		}


