package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample18 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		boolean Val = driver.findElement(By.id("RememberMe")).isSelected();

		System.out.println("Is checkbox got Selected ? :" + Val);

		Thread.sleep(3000);

		boolean Val2 = driver.findElement(By.tagName("button")).isEnabled();

		System.out.print("Is LoginBtn Enabled ?:" + Val2);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		boolean Val3 = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).isDisplayed();
		
		System.out.println("Is Log in Successed and Dashboard displayed ?;" +Val3);
		
		driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();

	    driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();

		Thread.sleep(3000);

		boolean Val5 = driver.findElement(By.className("float-left")).isDisplayed();

		System.out.println("Is Products page Displayed?:" + Val5);

		Thread.sleep(3000);

		driver.findElement(By.name("SearchProductName")).sendKeys("Digital Storm VANQUISH 3 Custom Performance PC");

		Thread.sleep(3000);

		driver.findElement(By.id("search-products")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		boolean Val6 = driver.findElement(By.id("Email")).isDisplayed();

		System.out.println("Is Logout Success? :"+ Val6);

		Thread.sleep(5000);

		driver.quit();

	}

}
