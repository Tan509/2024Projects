import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollToBottom_Program_22 {

	@Test
	public void scrollDown() {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.softwaretestingmaterial.com");
		// to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
