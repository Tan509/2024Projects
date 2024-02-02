import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_Pattern_1_15 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("My Info")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		//pattern 1
		
		//driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Marne");
		
		driver.findElement(By.xpath("//input[@title='First Name']")).clear();
		
		driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys("Tara");
		
		driver.findElement(By.xpath("//input[@title='Middle Name']")).sendKeys("Ravi");
		
		
		driver.findElement(By.xpath("//input[@title='Last Name']")).clear();
		
		driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys("Verma");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).clear();
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys("897");
		
		driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys("5676546556");
		
		driver.findElement(By.xpath("//input[@id='personal_txtNICNo']")).sendKeys("56465476467");
		
		driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys("764764");
		
	
		
		//driver.findElement(By.xpath("//input[@type='button']")).click();
		
		


	}

}
