package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayendran");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajkumar");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jayendran");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jayendran.rajkumar@gmail.com");
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select state = new Select(dropDown);
		
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jay");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("The Title is "+driver.getTitle());
		

	}

}
