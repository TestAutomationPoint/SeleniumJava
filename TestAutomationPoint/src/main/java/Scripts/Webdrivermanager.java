package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJava\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testautomationpoint.com/");
		
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("http://www.testautomationpoint.com/");*/
		
	}

}
