import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Authentication_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		driver.get("http//admin:admin@the-internet.herokuapp.com/basic_auth");

		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
		
	}

}
