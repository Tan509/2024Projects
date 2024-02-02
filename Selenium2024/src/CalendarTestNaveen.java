import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarTestNaveen {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		driver.findElement(By.name("Submit")).click();

		driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.linkText("Employee List")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("0007")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='frmEmpPersonalDetails']/fieldset/ol[2]/li[4]/img")).click();

		String date = "31-Oct-2025";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")));
		select1.selectByVisibleText(year);

		Thread.sleep(6000);

		/// html/body/div[3]/table/tbody/tr[1]
		// html/body/div[3]/table/tbody/tr[1]/td[1]/a

		/// html/body/div[3]/table/tbody/tr[1]/td[1]/a
		/// html/body/div[3]/table/tbody/tr[1]/td[2]/a
		// *[@id='ui-datepicker-div']/table/tbody/tr[1]/td[3]/a

		// *[@id="ui-datepicker-div"]/table/tbody/tr[3]/td[1]/a
		// -----

		/*
		 * /html/body/div[3]/table/tbody/tr[1]/td[1]/a
		 * /html/body/div[3]/table/tbody/tr[1]/td[2]/a
		 * /html/body/div[3]/table/tbody/tr[1]/td[6]/a
		 * /html/body/div[3]/table/tbody/tr[1]/td[7]/a
		 * 
		 * /html/body/div[3]/table/tbody/tr[2]/td[1]/a
		 * /html/body/div[3]/table/tbody/tr[5]/td[1]/a
		 */

		/*
		 * /html/body/div[3]/table/tbody/tr[1]/td[1]/a
		 * /html/body/div[3]/table/tbody/tr[5]/td[1]/a
		 */

		// String beforeXpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[";
		/// html/body/div[3]/table/tbody/tr[5]
		String beforeXpath = "/html/body/div[3]/table/tbody/tr[";

		// String beforeXpath = "/html/body/div[3]/table/tbody/tr[";

		String afterXpath = "]/td[";

		Thread.sleep(3000);
		
		final int totalWeekDays = 7;
		
		boolean flag = false;
		
		String dayVal = null;
		
		for (int rowNum = 1; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= 7; colNum++) {

				try
				{
			     dayVal = driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]/a"))
						.getText();
			     Thread.sleep(3000);
				}
				catch(Exception e)
				{
					System.out.println("Please enter a correct daye value");
					flag = false;
					break;
				}
				System.out.println("dayVal: " + dayVal);

				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]/a")).click();
					flag = true;
					break;

				}
			}
			if(flag)
			{
				break;
			}
		}

		//driver.quit();

	}

}
