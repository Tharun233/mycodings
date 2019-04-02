package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "G:\\tarun Automation\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("hc")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
		driver.findElement(By.id("googlePlusBtn1")).click();
		
		
		Thread.sleep(5000);
		
		Set<String> st=driver.getWindowHandles();
		System.out.println(st);
		Object arr=st.toArray();
		String st1=arr.toString();
		
		driver.switchTo().window("6442450984");
		System.out.println(driver.getTitle());
	
		
		
		System.out.println("Hello World");

	}

}
