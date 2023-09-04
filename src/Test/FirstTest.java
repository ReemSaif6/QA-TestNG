package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lancome-usa.com/");
        
        driver.findElement(By.className("c-modal__close")).click();
        
        WebElement logoElement = driver.findElement(By.className("c-logo")); 
        
        if (logoElement.isDisplayed()) {
            System.out.println("Logo is displayed!");
        } else {
            System.out.println("Logo is not displayed.");
        }
	}
}
