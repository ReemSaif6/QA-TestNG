package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lancome-usa.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.className("c-modal__close")).click();
        
        ///////////////////////////
        
        WebElement myBagElement =driver.findElement(By.className("c-minicart-icon__link"));
        
        if (myBagElement.isDisplayed()) {
            System.out.println("My Bag is displayed!");
        } else {
            System.out.println("My Bag is not displayed.");
        }
        
        //////////////////////////
        
        WebElement myAccountElement =driver.findElement(By.className("c-user"));
        
        if (myAccountElement.isDisplayed()) {
            System.out.println("My Account is displayed!");
        } else {
            System.out.println("My Account is not displayed.");
        }

        /////////////////////////
       
        WebElement emailSignUpElement =driver.findElement(By.className("c-text-field__input"));
        
        if (emailSignUpElement.isDisplayed()) {
            System.out.println("Email Sign Up is displayed!");
        } else {
            System.out.println("Email Sign Up is not displayed.");
        }
	}

}
