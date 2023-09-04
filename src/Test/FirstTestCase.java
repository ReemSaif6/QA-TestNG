package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class FirstTestCase {

	public String baseUrl = "https://www.itgsoftware.com/quality-assurance";
	String driverPath = "C:\\Users\\dell\\Desktop\\chromedriver-win64\\chromedriver.exe";
	public WebDriver driver;
	
	@Test
	public void verifyHomepageTitle() {
		System.out.println("la");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle = "Quality Assurance";
		WebElement actualTitle = driver.findElement(By.cssSelector(".quality-assurance-header>h3"));
		Assert.assertEquals(actualTitle, expectedTitle, "Actual: "+actualTitle);
		driver.close();
		
	}
}
