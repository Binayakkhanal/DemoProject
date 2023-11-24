
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		
		
		

	}

}
