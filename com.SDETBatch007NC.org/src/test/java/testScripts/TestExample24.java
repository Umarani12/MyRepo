
package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample24 {

	public static void main(String[] args) throws Exception{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(7000);
		
		driver.switchTo().frame(3);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath ("//h5[contains(text(),'High Tatras 3')]|following-sibling[last]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
