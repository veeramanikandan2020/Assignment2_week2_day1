package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
		
		//Basic Checkbox
		driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[2]")).click();
				
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//Tristates
		
		driver.findElement(By.xpath("//div[contains(@data-iconstates,'[\"\",\"ui-icon ui-icon-check')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@data-iconstates,'[\"\",\"ui-icon ui-icon-check')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@data-iconstates,'[\"\",\"ui-icon ui-icon-check')]")).click();
		
		Thread.sleep(2000);
		
		// isSelected is checked works fine
		
		boolean selected = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isSelected();
		
		if(selected == true)
			System.out.println("check box is Enabled");
		else
			System.out.println("Check box is Disabled");
		
		//Select Multiple Checkbox Window
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	
		//London - Grandparent to Grand child
		
		driver.findElement(By.xpath("(//li[@data-item-value='London']//div)[3]")).click();
	
		// Berlin - Grandparent to Grandchild
		driver.findElement(By.xpath("(//li[@data-item-value='Berlin']//div)[3]")).click();
		
		// Rome - - Grandparent to Grandchild
		driver.findElement(By.xpath("(//li[@data-item-value='Rome']//div)[3]")).click();
	
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
