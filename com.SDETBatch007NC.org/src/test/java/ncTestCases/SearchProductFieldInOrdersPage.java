package ncTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.NCDashboardPage;
import ncPages.NCLoginPage;
import ncPages.NCOrdersPage;
import ncPages.NCUtilities;

public class SearchProductFieldInOrdersPage {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		NCUtilities ncu = new NCUtilities(driver);
			NCLoginPage nlp = new NCLoginPage(driver);
			NCDashboardPage ndp = new NCDashboardPage(driver);
			NCOrdersPage nop = new NCOrdersPage(driver);

			ncu.setUp();
			nlp.enterEmail();
			nlp.enterPassword();
			nlp.clickOnLoginBtn();
			Thread.sleep(5000);
			ndp.verifyDashboard();
			ncu.clickOnSales();
			Thread.sleep(3000);
			ncu.clickOnOrders();
			Thread.sleep(7000);
			nop.enterProduct();
			Thread.sleep(3000);
			nop.clickOnSearch();
			Thread.sleep(5000);
	        ncu.doLogout();
			Thread.sleep(5000);
			ncu.tearDown();

		}



	}


