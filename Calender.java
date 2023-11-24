package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;



public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]")).click();
		
		//List<WebElement> dates = driver.findElements(By.className("DayPicker-Day"));
		
		int count = driver.findElements(By.className("DayPicker-Day")).size();
		
		for(int i = 0; i<count; i++)
		{
			String text = driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if(text.equalsIgnoreCase("18"))
			{
				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}
			
		}
		
		

	}

}
