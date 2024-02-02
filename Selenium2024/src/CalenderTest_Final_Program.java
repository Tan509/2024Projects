import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderTest_Final_Program {

	static WebDriver driver;

	public static void main(String[] args) {

		// https://jqueryui.com/datepicker/#date%E2%88%92range
		
		//https://www.goibibo.com/
		
		//https://www.marriott.com/default.mi#

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click(); // date enter text box

		WebDriverWait wait = new WebDriverWait(driver, 5);

		// wait until date table gets loaded
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));

		selectDate("15", "August", "2023");
		//driver.quit();

	}
	
	public static String[] getMonthYear(String monthYearVal)
	{
		return monthYearVal.split(" ");
	}
	
	public static void selectDate(String exDay,String exMonth,String exYear)
	{
		
		if(exMonth.equals("February") && Integer.parseInt(exDay)>29)
		{
			System.out.println("Wrong Date : " + exMonth + " : "+exDay);
			return;
		}
		
		if(Integer.parseInt(exDay)>31)
		{
			System.out.println("Wrong Date : " + exMonth + " : "+exDay);
			return;
		}
		
		
		// here class name propertu of month year for ek July 2021
		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearVal);
		
		while(!(getMonthYear(monthYearVal)[0].equals(exMonth) && getMonthYear(monthYearVal)[1].equals(exYear)))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();
			
			 monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		
		
		
		try
		{
		driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Wrong Date : " + exMonth + " : "+exDay);
		}
	}

}
