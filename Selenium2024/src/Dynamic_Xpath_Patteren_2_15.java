import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_Patteren_2_15 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("My Info")).click();
		
		driver.findElement(By.linkText("Contact Details")).click();
		
		driver.findElement(By.xpath("//input[@value='Edit']")).click();
		
		//pattern 2
		
		//driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("Tanvi");
		
		
		driver.findElement(By.xpath("//input[contains(@id,'contact_street1')]")).sendKeys("hfxhx");
		
		driver.findElement(By.xpath("//input[contains(@id,'contact_street2')]")).sendKeys("dsafsaga");
		
		driver.findElement(By.xpath("//input[contains(@id,'contact_city')]")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[contains(@id,'contact_province')]")).sendKeys("Maharashtra");
		
		driver.findElement(By.xpath("//input[contains(@id,'contact_emp_hm_telephone')]")).sendKeys("674764764764");
		
		driver.findElement(By.xpath("//input[contsins(@id,'contact_emp_mobile')]")).sendKeys("5676543456");
		
		driver.findElement(By.xpath("//input[contains(@id,'contact_emp_oth_email')]")).sendKeys("abc@gmail.com");

		//driver.findElement(By.xpath("//input[contians(@id,'contact_emp_oth_email')]")).sendKeys("sdsdg");
		driver.findElement(By.xpath("//input[contains(@id,'btnSave')]")).click();
	}


	

}
