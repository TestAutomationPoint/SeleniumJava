package Scripts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertshandling {
	
	
	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				//With webdriver manager,initiating the driver and opening the website
		
				ChromeDriver driver;
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("http://www.testautomationpoint.com/alertstestpage");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				//Enter username and password and click submit button
				
				driver.findElement(By.id("exampleusername")).sendKeys("55");
				driver.findElement(By.id("exampleInputPassword")).sendKeys("text");
				driver.findElement(By.xpath("//*[@id=\"mytextbox\"]/form/button")).click();
				
				//synchronise and wait until alert present
				
				Thread.sleep(5000);
				WebDriverWait w=new WebDriverWait(driver,30);
				if(w.until(ExpectedConditions.alertIsPresent())==null)
				{
					System.out.println("Alert not present");
										
				}
				else
				{
					//get text of the alert
					
					String str=driver.switchTo().alert().getText();
					System.out.println(str);
					
					//accept alert
					
					driver.switchTo().alert().accept();	
					Thread.sleep(5000);
					
					//enter username and location
					driver.findElement(By.id("exampleusername")).clear();
					driver.findElement(By.id("exampleusername")).sendKeys("ravi");
					Thread.sleep(5000);
					driver.findElement(By.id("location")).click();
					
					//synchronise and wait until alert present
					
					Thread.sleep(5000);
					if(w.until(ExpectedConditions.alertIsPresent())==null)
					{
						System.out.println("Alert not present");
											
					}
					else
					{
						//get text of the alert
						
						String str1=driver.switchTo().alert().getText();
						System.out.println(str1);	
						
						//send text to alert
						
						driver.switchTo().alert().sendKeys("Hyderabad");
						Thread.sleep(5000);
						
						//accept alert
						
						driver.switchTo().alert().accept();
						driver.findElement(By.xpath("//*[@id=\"mytextbox\"]/form/button")).click();
						
						//synchronise and wait until alert present
						
						Thread.sleep(5000);
						if(w.until(ExpectedConditions.alertIsPresent())==null)
						{
							System.out.println("Alert not present");
												
						}
						else
						{
							//dismiss alert
							
							driver.switchTo().alert().dismiss();
						}
						
					}
				}
				driver.close();
				
				

	}

}
