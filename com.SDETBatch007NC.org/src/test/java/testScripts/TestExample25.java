package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample25 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//p[contains(text(),'Content management')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Topics (pages)')]")).click();

		Thread.sleep(5000);

		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id = 'topics-grid']/tbody/tr"));

		int rowsCount = allRows.size();
		System.out.println("All Rows Count Is : " + rowsCount);

		Thread.sleep(5000);

		List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id = 'topics-grid']/tbody/tr[1]/td"));

		int columnsCount = allColumns.size();

		System.out.println("All Columns Count Is : " + columnsCount);

		for (int r = 1; r <= rowsCount; r++) {

			for (int c = 1; c <= columnsCount; c++) {

				String val = driver
						.findElement(By.xpath("//table[@id = 'topics-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(val + " ");
			}

			System.out.println();
		}

		Thread.sleep(5000);

		driver.quit();

	}

}
