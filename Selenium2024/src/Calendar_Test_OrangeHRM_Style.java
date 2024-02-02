import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar_Test_OrangeHRM_Style {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Datepicker.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		boolean b = false;
		String date = "28/February/2023";

		// 1. Separate day, month, year

		// date.split("/");

		String dateArr[] = date.split("/");

		String day = dateArr[0]; // 12

		String month = dateArr[1]; // May

		String year = dateArr[2]; // 2022

		// 2. Click on date picker

		driver.findElement(By.id("datepicker2")).click();

		// 3. Select Month and year

		Select monthval = new Select(driver.findElement(By.xpath("//select[@title = 'Change the month']")));

		Thread.sleep(3000);
		monthval.selectByVisibleText(month);

		Select yearval = new Select(driver.findElement(By.xpath("//select[@title = 'Change the year']")));
		Thread.sleep(3000);
		yearval.selectByVisibleText(year);

		// 4. Select date

		int rows = driver.findElements(By.xpath("//div[@class='datepick']/div[2]/div/table/tbody/tr")).size();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= 7; j++) {
				String dayval = driver.findElement(By.xpath("//div[@class='datepick']/div[2]/div/table/tbody/tr["+i+"]/td["+j+"]"))
						.getText();
				
				System.out.println(dayval);
				if(dayval.equals(day))
				{
					driver.findElement(By.xpath("//div[@class='datepick']/div[2]/div/table/tbody/tr["+i+"]/td["+j+"]")).click();
					b = true;
					break;
					
				}
				
				if(b)
				{
					break;
				}
			}
		}

	}

}
