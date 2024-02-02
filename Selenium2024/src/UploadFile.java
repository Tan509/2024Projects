
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UploadFile {
	/*private RemoteWebDriver driver;
	@BeforeClass
	public void setUp() throws Exception {
System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void UploadTest() throws Exception {
	driver.get("https://github.com/settings/profile");
	Thread.sleep(2000);// Xpath for Edit button

	WebElement file = driver.findElement(By.xpath("//div[@class='position-absolute bg-gray-dark rounded-2 text-white px-2 py-1 left-0 bottom-0 ml-2 mb-2']")).click(); //link text locator for uploading a photo..
	WebElement addFile = driver.findElement(By.linkText("Upload a photo...")).click();
	// Mention the own path of the file location

	// Add file method 
	addFile.sendKeys("/Users/apple/Downloads/flower1.jpeg");// For setting a profile picture

	driver.findElement(By.linkText("Set new profile picture")).click();
	Thread.sleep(2000);// Image name can be of your choice

	if(driver.findElement(By.xpath(".//a[text()='caps.jpeg']")).isDisplayed()) {
	assertTrue(true, "Profile picture is Uploaded");
	}else {
	assertTrue(false, "Profile picture not Uploaded");
	}
	}
	@AfterClass
	public void tearDown() throws Exception {
	driver.quit();
	}*/
}
