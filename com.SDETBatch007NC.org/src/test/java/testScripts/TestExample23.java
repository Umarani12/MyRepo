package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample23 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		Thread.sleep(3000);

		driver.findElement(By.id("alertButton")).click();

		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();

    	Thread.sleep(3000);

		popup.accept();

		Thread.sleep(3000);
      
		driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(2000);
		
		Alert popup2 = driver.switchTo().alert();

		Thread.sleep(2000);

		popup2.dismiss();

		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		driver.findElement(By.id("promtButton")).click();

		Thread.sleep(2000);

		Alert popup3 = driver.switchTo().alert();

		Thread.sleep(2000);

		String alertMsg = popup3.getText();

		Thread.sleep(2000);

		System.out.println(alertMsg);

		popup3.sendKeys("I Love You Amma");
		 
		Thread.sleep(2000);
		
		popup3.accept();
		
	    Thread.sleep(2000);

		driver.quit();

	}

}
