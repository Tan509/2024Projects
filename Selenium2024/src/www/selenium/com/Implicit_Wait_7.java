package www.selenium.com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='post-body-7708391096228750161']/button")).click();
		
		WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean status = element.isDisplayed();
		
		if(status)
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element does not displyed");
		}
		
		driver.quit();
		
		

	}


}
