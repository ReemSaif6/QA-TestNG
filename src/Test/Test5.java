package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lancome-usa.com/account");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.className("c-modal__close")).click();
        
        
        
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email'][name='email']"));
        emailField.sendKeys("sreem9504@gmail.com");
        
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password'][name='password']"));
        passwordField.sendKeys("reeM2468@");
        
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit'][name='submit']"));
        loginButton.click();
        
        

	}

}
