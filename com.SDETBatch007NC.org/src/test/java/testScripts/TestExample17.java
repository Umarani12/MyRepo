package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample17 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(2000);

		boolean Val = driver.findElement(By.id("RememberMe")).isSelected();

		System.out.println("Is checkbox got Selected ? :" + Val);

		Thread.sleep(2000);

		boolean Val2 = driver.findElement(By.tagName("button")).isEnabled();

		System.out.println("Is LoginBtn Enabled ?:" + Val2);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(2000);

		boolean Val3 = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();

		System.out.println("Is Login Success:" + Val3);

		Thread.sleep(5000);

		driver.quit();

	}

}
