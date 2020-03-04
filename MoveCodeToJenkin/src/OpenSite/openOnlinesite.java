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
			
			//launched ikea site
			driver.get("https://www.ikea.com/");		
			System.out.println("User enters ikea.com in the url"); 
			//close the browser
					driver.quit();
		}


		

	}


