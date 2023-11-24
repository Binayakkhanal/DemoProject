package DemoProject;

//import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafariOptions options = new SafariOptions();
		
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("ipaddress:4444");
//		options.setCapability("proxy", proxy);
		
		options.setAcceptInsecureCerts(false);
		
		WebDriver driver = new SafariDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		

	}

}
