package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC1 {
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
//		setup for the login page
		driver.findElement(By.cssSelector("#username")).sendKeys("neharika.m@salesforce.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rememberUn")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(3000);	
		System.out.println("ERROR MESSAGE : Please enter password");
		driver.quit();	
}}
