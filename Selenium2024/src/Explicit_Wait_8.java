import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.bind.v2.model.core.Element;

public class Explicit_Wait_8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		
	
		boolean status = element.isDisplayed();
	
		
		if(status)
		{
			System.out.println("elemnyt is displayed");
		}
		else
		{
			System.out.println("not displyed");
		}
		
		driver.quit();

		
		
	}

}
