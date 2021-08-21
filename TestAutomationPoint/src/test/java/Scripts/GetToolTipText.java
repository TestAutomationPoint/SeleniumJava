package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetToolTipText {

	public static void main(String[] args) throws InterruptedException {
						
				//set webdrivermanager for chrome
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();

				
				//Open url
				
				driver.get("http://www.testautomationpoint.com/Tooltip");
				
				//maximise browser
				
				driver.manage().window().maximize();
				
				//identify the object and get tooltip text
				
				String strtext = driver.findElement(By.id("toolTipButton")).getAttribute("title");
				
				//print the text
				
				System.out.println(strtext);
				
				//validation
				Thread.sleep(3000);
				
				if(strtext.equals("I am a button")) 
				{							
		            System.out.println("Test Case Passed");					
		        }	
				else
				{
					 System.out.println("Test Case Failed");	
				}
				
				//close the browser
				
		        driver.close();

	}

}
