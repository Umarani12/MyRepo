package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample19 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(),  'Catalog')][1]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(),  'Products')][1]")).click();

		Thread.sleep(5000);

		WebElement Manufacturer = driver.findElement(By.id("SearchManufacturerId"));

		Select selection = new Select(Manufacturer);

		selection.selectByVisibleText("Apple");

		Thread.sleep(3000);

		selection.selectByIndex(3);

		Thread.sleep(3000);

		selection.selectByValue("2");

		Thread.sleep(5000);

		driver.quit();

	}

}
