package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class LoggingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseUrl = "https://www.itgsoftware.com/quality-assurance";
		String driverPath = "C:\\Users\\dell\\Desktop\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		
		WebDriver driver = new ChromeDriver();
		Logger log = Logger.getLogger("logs"); 
		driver.get(baseUrl); 
		log.debug("opening webiste"); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		String expectedTitle = "Quality Assurance"; 
	    WebElement headerElement = driver.findElement(By.cssSelector(".quality-assurance-header>h3")); 
		String actualTitle = headerElement.getText();
	    
	    log.debug ("Validating the header"); 
		Assert.assertEquals(actualTitle, expectedTitle, "Actual:" + actualTitle); 
		log.debug("close the browser"); 
		driver.quit();

	}

}
