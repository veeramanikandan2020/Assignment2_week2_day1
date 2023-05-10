package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		
//		1. Launch http://leaftaps.com/opentaps
//			2. Enter username as demoSalesManager
//			3. Enter password as crmsfa
//			4. Click on Login
//			5. Click on CRM/SFA
//			6. Click on Leads
//			7.Click on Create lead
//			8. Enter the mandatory fields
//			9. Select Employee in source dropdown using index
//			10.Select Automobile in MarketCampaign using visibleText
//			11.Select Corporation in Ownership using value
//			12.Click create
//			13.Verify the title
//		
		// Create object for Chrome Driver
		
		ChromeDriver driver = new ChromeDriver();
		
		//EdgeDriver driver1 = new EdgeDriver();
		
		//System.out.println(driver.getTitle());
		
		driver.get("http://leaftaps.com./opentaps/control/main");
		
		//driver.get("https://www.facebook.com/login");
		
		// to maximize window
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("username"));
		
		findElement.sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// to verify Title
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sasken");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Veeramanikandan");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manoharan");
		
		WebElement SDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select sec = new Select(SDD);
		
		sec.selectByIndex(4);
		
		WebElement Mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select mark = new Select(Mark);
		
		mark.selectByVisibleText("Automobile");
		
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select own = new Select(owner);
		
		own.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
	
		
	}
	

}
