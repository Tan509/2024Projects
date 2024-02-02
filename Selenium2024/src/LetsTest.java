import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LetsTest {

@Test 
public void checkPage()
{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://talent.com");
	Assert.assertEquals("Tallent", driver.getTitle());
}
}
