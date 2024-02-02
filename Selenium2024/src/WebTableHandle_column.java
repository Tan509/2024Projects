import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle_column {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[7]/td[1]
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		int rowCount = list.size();
		
		System.out.println("rowCount: "+rowCount);

		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";

		for (int i = 2; i <= rowCount; i++) {
			String actualXpath = beforeXpath + i + afterXpath;

			WebElement element = driver.findElement(By.xpath(actualXpath));

			System.out.println(element.getText());

			if (element.getText().equals("Island Trading")) {
				System.out.println("Company name" + element.getText() + "is found at position" + i);
				break;
			}
		}

		System.out.println("-----------");

		//// *[@id="customers"]/tbody/tr[2]/td[2]

		String afterXpathContact = "]/td[2]";

		for (int i = 2; i <= rowCount; i++) {
			String actualContactXpath = beforeXpath + i + afterXpathContact;

			WebElement element = driver.findElement(By.xpath(actualContactXpath));

			System.out.println(element.getText());

		}
		
		System.out.println("-----------");
		
		////*[@id="customers"]/tbody/tr[2]/td[3]

		String afterCountryXpath = "]/td[3]";
		
		for(int i=2;i<= rowCount;i++)
		{
			String actualCountryXpath = beforeXpath+i+afterCountryXpath;
			
			WebElement element= driver.findElement(By.xpath(actualCountryXpath));
			
			System.out.println(element.getText());
		}
		
		
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		
		int colCount = cols.size();
		
		System.out.println("num of col: "+ colCount );
		
		System.out.println("Column Names are:");
		
		////*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		String beforeColXpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String afterColXpath = "]";
		
		for(int i=1;i<=colCount;i++)
		{
			WebElement element = driver.findElement(By.xpath(beforeColXpath+i+afterColXpath));
			String colTitle = element.getText();
			System.out.println(colTitle);
		}
		
		driver.quit();
	}

}
