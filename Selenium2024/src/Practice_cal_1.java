import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_cal_1 {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));

		selectDate("32","March","2022");

		//driver.quit();

	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}

	public static void selectDate(String exDay, String exMonth, String exYear) throws InterruptedException {

		if(exMonth.equals("February") && Integer.parseInt(exDay) > 29)
		{
			System.out.println("Wrong date: " + exMonth + ":" + exDay);
			return;
		}
		
		if(Integer.parseInt(exDay)>31)
		{
			System.out.println("Wrong date: " + exMonth + ":" + exDay);
			return;
		}
		
		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();

		System.out.println(monthYearVal);

		while (!(getMonthYear(monthYearVal)[0].equals(exMonth) && getMonthYear(monthYearVal)[1].equals(exYear))) {

			driver.findElement(By.linkText("Next")).click();
					
			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		
		try
		{
		driver.findElement(By.xpath("//a[text()='"+ exDay +"']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid Date");
		}
	}

}
