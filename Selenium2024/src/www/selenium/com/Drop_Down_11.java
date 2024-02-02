package www.selenium.com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		
	
		getDropDownValue(country,"CANADA");
		
		//driver.quit();
		

	}
	
	public static void getDropDownValue(WebElement element, String value)
	{
		Select select = new Select(element);
	/*	
		select.selectByIndex(2);
		select.selectByValue("2");
		select.selectByVisibleText("Indow");
		*/
		List<WebElement> countryList = select.getOptions();
		
		System.out.println("Size: "+ countryList.size());
		
		for(int i=0; i< countryList.size();i++)
		{
			String countryNames = countryList.get(i).getText();
			
			System.out.println(i +" "+ countryNames);
			
			if(countryNames.contains(value))
			{
				countryList.get(i).click();
				break;
			}
		}
	}
}

