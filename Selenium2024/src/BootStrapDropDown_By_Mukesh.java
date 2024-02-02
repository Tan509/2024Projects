import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown_By_Mukesh {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary dropdown-toggle')]")).click();

		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu test')]//li//a"));

		for (int i = 0; i <dd_menu.size(); i++) {

			
			
			WebElement element = dd_menu.get(i);
			
			String innerHtml = element.getAttribute("innerHTML");
			
			if(innerHtml.contentEquals("JavaScript"))
			{
				element.click();
				break;
			}
			
			System.out.println(innerHtml);
		}
		
		
		/*for(int i=0;i<=dd_menu.size();i++)
		{
			Thread.sleep(3000);
			System.out.println(dd_menu.get(i).getText());
			if(dd_menu.get(i).getText().equals("JavaScript"))
			{
				Thread.sleep(3000);
				dd_menu.get(i).click();
				Thread.sleep(3000);
				break;
			}
		}*/
		//driver.quit();

	}

}
