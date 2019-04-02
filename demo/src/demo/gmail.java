package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class gmail 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "G:\\tarun Automation\\gecko\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("taruntheja619@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(10000);
			
		act.moveToElement(driver.findElement(By.id("password"))).click();
		act.sendKeys("Tteja619@");
		act.build().perform();
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(10000);
		
		act.moveToElement(driver.findElement(By.className("aic"))).click();
		act.build().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id(":pk")).click();
		
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec("G:\\tarun Automation\\autoIT\\test3.exe");
		
		
		
		
		
		

	}

}
