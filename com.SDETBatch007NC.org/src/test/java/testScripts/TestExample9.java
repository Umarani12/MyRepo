package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample9 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.manage().window().minimize();

		Thread.sleep(5000);

		driver.quit();

	}

}
