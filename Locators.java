package DemoProject;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("Binayak");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText());
		
		
	}

}
