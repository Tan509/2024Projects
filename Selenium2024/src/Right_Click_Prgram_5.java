import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Prgram_5 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.navigate().to("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement btn = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(btn).build().perform();

	}

}
