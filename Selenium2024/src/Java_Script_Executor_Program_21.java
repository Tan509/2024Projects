import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor_Program_21 {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
		
		 driver = new ChromeDriver();
		
		driver.get("https://freecrm.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement signBtn = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/a"));
		
		//border
       drawBorder(signBtn, driver);
       
       
       //screenshot
       takeScreenshot("Prototech_HomePage1");
       
       
       //generate alert
       
       //generateAlert(driver, "There is an issue with Login button on Login page");
       
       
       
       //click on any element by using JS executor
       
      // clickElementByJS(signBtn, driver);
       
       
       driver.navigate().refresh();
       
       
       //refresh pahe by JS
       refreshBrowserBy(driver);
       
       
       //get the title of the page by js
       
       System.out.println(getTitleByJS(driver));
       
       
       //scroll Page down
       
      //scrollPageDown(driver);
      
      //
      
      WebElement sales_crm = driver.findElement(By.xpath("/html/body/div[1]/footer/div/div/div[3]/p/a[1]"));
      
      scrollIntoView(sales_crm, driver);
       
      // driver.quit();
      

	}
	
	public static void drawBorder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void takeScreenshot(String fileName) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("/Users/apple/Desktop/seed_chetak/EclipseWorkSpace_2021/Selenium_2021/src/Screenshots/"+fileName+".jpg"));
		
	}
	
	
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
		
	}
	
	
	public static void clickElementByJS(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}

	
	public static void refreshBrowserBy(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public static void scrollIntoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}

	

}
