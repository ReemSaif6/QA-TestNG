package Test;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class testParameterWithXML {
	
	WebDriver driver;
	String driverPath = "C:\\Users\\dell\\Desktop\\chromedriver-win64\\geckodriver.exe";
	
	@Test 
	@Parameters({"author","searchKey"}) 
	public void testParameterWith_XML( @Optional("Abc")String author,String searchKey) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",driverPath);
		driver= new FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.get("https://google.com");
		WebElement searchText = driver.findElement(By.name("q"));
		
		searchText.sendKeys(searchKey); 
		
		System.out.println("Welcome ->"+ author + " Your search key is ->"+searchKey); 
		System.out.println("Thread will sleep now " ) ; 
		Thread.sleep(3000); 
		System.out.println("Value in Google Search Box = " + searchText.getAttribute ( " value " ) + "::: Value given by input = " + searchKey ) ; 
		
		AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));	
	}
}
