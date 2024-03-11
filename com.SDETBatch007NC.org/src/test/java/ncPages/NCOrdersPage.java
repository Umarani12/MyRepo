package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 Create a class for a Web Page
	public class NCOrdersPage {

		WebDriver driver;

		// Rule-2 Provide the Web Elements information
		By productfield = By.xpath("//input[@id = 'search-product-name']");
		By searchBtn = By.xpath("//button[@id ='search-orders']");
		
		// Rule-3 Create the methods for each web elements
		public void enterProduct() {
			driver.findElement(productfield).sendKeys("SDET");
		}

		public void clickOnSearch() {
			driver.findElement(searchBtn).click();
		}

		
		//Rule-4 Create the constructor for each page class with WebDriver object as argument
		public NCOrdersPage(WebDriver d){
			this.driver = d;
		}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

