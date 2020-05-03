package SalesForce;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.FirefoxDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApp {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver ();
	System.out.println("browser launched..");
	driver.get("https://login.salesforce.com/");
	System.out.println("App URL passed..");
	//driver.manage().window().maximize();  // to maximize the browser
	System.out.println("Browser get maximizded..");
	Thread.sleep(1000);
//	setup for the login page
	driver.findElement(By.cssSelector("#username")).sendKeys("neharika.m@salesforce.com");
	driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#rememberUn")).click();
	driver.findElement(By.cssSelector("#Login")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
	driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	System.out.println("Login successful");
driver.quit();	
}
}
