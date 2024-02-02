import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_Screenshots_13 {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
			
	        System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
			
		    driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/popup.php");	
			
			takeScreenShot("guru991");
		}
		
		public static void takeScreenShot(String fileName) throws IOException
		{
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(file,new File("/Users/apple/Desktop/seed_chetak/EclipseWorkSpace_2021/Selenium_2021/src/Screenshots/"+fileName+".jpg"));
		}
	

}
