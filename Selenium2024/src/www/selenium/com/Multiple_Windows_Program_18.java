package www.selenium.com;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows_Program_18 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");	
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();		
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		
		while(i1.hasNext())
		{
			String childWindow = i1.next();
			
			if(!MainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				 driver.findElement(By.name("emailid"))
                 .sendKeys("gaurav.3n@gmail.com");                			
                 
                 driver.findElement(By.name("btnLogin")).click();			
                              
			// Closing the Child Window.
                     driver.close();		
			}
			
			
		}
		
		driver.switchTo().window(MainWindow);

	
	}

}
