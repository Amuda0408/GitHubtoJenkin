package OpenSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openOnlinesite {

	public static void main(String[] args) {
		
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Chrome browser is launched");
			
			//launched costco site
			driver.get("https://www.costco.com/");		
			System.out.println("User enters costco.com in the url"); 
			//close the browser
					driver.quit();
		}


		

	}


