package javaPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.Input;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExample21 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		List<WebElement> allInputs = driver.findElements(By.xpath("//input"));

		for (WebElement input : allInputs) {
			
		String val = input .getAttribute("name");

		System.out.println(val);
		}
		Thread.sleep(5000);

		driver.quit();

	}
}