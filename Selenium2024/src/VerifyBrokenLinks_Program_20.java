import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrokenLinks_Program_20 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.hdfcbank.com/");
		
		driver.navigate().to("https://www.softwaretestingmaterial.com/selenium-interview-questions/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Size: "+ links.size());
		
		for(int i =0;i<links.size();i++)
		{
			
			WebElement ele = links.get(i);
			
			String url = ele.getAttribute("href");
			
			checkConnection(url);
			
		}
		

	}
	
	
	public static void checkConnection(String linkUrl) 
	{
		try 
		{
			URL url = new URL(linkUrl);
			
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			
			httpURLConnect.setConnectTimeout(30000);
			
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode() == 200)
			{
				
				System.out.println(linkUrl + "-" + httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND)
			{
				
				System.out.println(linkUrl + "-" +httpURLConnect.getResponseMessage() + "-" +HttpURLConnection.HTTP_NOT_FOUND);
			}		
			
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
			
			
		
	

	}

}
