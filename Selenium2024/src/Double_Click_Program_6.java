import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Program_6 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.hdfcbank.com/");
		
		driver.navigate().to("https://api.jquery.com/dblclick/");
		
		WebElement btn = driver.findElement(By.xpath("/html/body/span"));
		
		
		Actions action = new Actions(driver);
		
		
		action.doubleClick(btn).build().perform();


	}

}
