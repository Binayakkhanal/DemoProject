package DemoProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;


public class ScopeHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moha.gov.np/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = driver.findElement(By.xpath("/html/body/footer/div/div/div[2]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		// Click on the each link in the column and check if the pages are opening
		
				for(int i = 1; i < columndriver.findElements(By.tagName("a")).size();i++)
				{
					String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
					
					columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
					
				}	
					Set<String> abc = driver.getWindowHandles();
					Iterator<String> it = abc.iterator();
					
					while(it.hasNext())
					{
						driver.switchTo().window(it.next());
						System.out.println(driver.getTitle());
					}

	}

}
