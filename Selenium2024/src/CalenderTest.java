import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderTest {

	static WebDriver driver;

	public static void main(String[] args) {

		// https://jqueryui.com/datepicker/#date%E2%88%92range

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click();

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));

		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		String month = monthYearVal.split(" ")[0].trim();
		String year = monthYearVal.split(" ")[1].trim();
		
		System.out.println(monthYearVal+" "+month+" "+ year);
		
		while(!(month.equals("June") && year.equals("2022")))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();
			
			 monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
			 
			 System.out.println(monthYearVal);
			 month = monthYearVal.split(" ")[0].trim();
			 year = monthYearVal.split(" ")[1].trim();
		}
		
		driver.findElement(By.xpath("//a[text()='23']")).click();
		//driver.quit();

	}

}
