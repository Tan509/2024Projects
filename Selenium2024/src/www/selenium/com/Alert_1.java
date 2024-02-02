package www.selenium.com;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://crm.unipartsgroup.com/Login.aspx");
		
		Alert alert = driver.switchTo().alert();
		
		String msg = alert.getText();
		
		System.out.println(msg);
		
		if(msg.contains("Please enter User Name."))
		{
			alert.accept();
		}
		else
		{
			System.out.println("no option");
		}
		
		driver.quit();

		
	}

}
