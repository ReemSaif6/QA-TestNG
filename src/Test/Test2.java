// 4
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lancome-usa.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.className("c-modal__close")).click();
        
        driver.findElement(By.className("c-user")).click();
       
        
	}

}
