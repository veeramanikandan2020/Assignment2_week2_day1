package week2.day1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		
		EdgeDriver driver1 = new EdgeDriver();
		
		driver1.get("https://www.facebook.com/login");
		
		//GeckoDriver driver2 = new GeckoDriver();
		
		//driver2.get("https://www.facebook.com/login");

	}

}
