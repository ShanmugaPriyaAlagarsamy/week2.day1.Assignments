package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmugapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alagarsamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shanmugapriya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Shanmugapriya from QA Team");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shanmugapriyaalagarsamy@gmail.com");
		WebElement stateelement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ddstateelement = new Select(stateelement);
		ddstateelement.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note to team is to complete testing in 2 days");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title of the page is: " + driver.getTitle());
			
				

	}

}
