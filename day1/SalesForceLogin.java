package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {

	public static void main(String[] args) throws InterruptedException {
//		Launch https://login.salesforce.com/
//			Enter username as hari.radhakrishnan@qeagle.com
//			3. Enter password as Leaf@1234
//			4. Click on Login
//			5. Verify the title(getTitle)
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		
		driver.findElement(By.id("Login")).click();
		
		//7 sec webpage is waited
		
		Thread.sleep(7000);
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
