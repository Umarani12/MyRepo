package testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample30 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		JavascriptExecutor execute = (JavascriptExecutor) driver;

		execute.executeScript("document.getElementsByTagName('button')[0].style.border ='5px red solid';");

		Thread.sleep(5000);

		execute.executeScript("document.getElementsByTagName('button')[0].click()");

		Thread.sleep(5000);

		execute.executeScript("document.getElementsByClassName('card-title')[5].scrollIntoView()");

		Thread.sleep(5000);

		driver.quit();

	}

}
