package week2.day1;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBrowser {
	
	public static void main(String args[])
	
	{
		// step 1 - setup the driver

		WebDriverManager.chromedriver().setup();
		
		// step 2 - launching chrome browser
		
	ChromeDriver driver = new ChromeDriver();
	
	// get the url
	
	driver.get("http://leaftaps.com/opentaps/control/main");
		
	// to maximize the url - page
	
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className ("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmugapriya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alagarsamy");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shanmugapriya");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Management");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Shanmugapriya Alagarsamy from management department");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmugapriya.alagarsamy@gmail.com");
	
	WebElement elementStateprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select statedd = new Select(elementStateprovince);
	statedd.selectByVisibleText("New York");
	
	WebElement elementsourcedd= driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select sourcedd = new Select(elementsourcedd);
	sourcedd.selectByVisibleText("Employee");
	
	driver.findElement(By.name("submitButton")).click();
	
	String title = driver.getTitle();
	System.out.println("The title is " + title );
	
	
	
	
	
	
	
	
		
		
	}
	
	

}
