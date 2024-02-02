import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Program_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://prototechsolutions.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Products"))).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Journals"))).build().perform();
		
		driver.quit();
	}

}
