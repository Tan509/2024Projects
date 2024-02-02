package BootStrap_DropBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
		//driver.findElement(By.xpath("//button[contains(@ckass,'multiselect dropdown-toggle btn btn-default']")).click();

		//driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle btn btn-default')]")).click();
	
		List<WebElement> list =driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
		
	
	
		System.out.println(list.size());
		
		for(int i=0;i<=list.size();i++)
		{
			
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Angular"))
			{
				list.get(i).click();
				break;
			}
		}
		
	
	}

}
