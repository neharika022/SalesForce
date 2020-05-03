package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC9 {
	public static void main(String[] args) throws InterruptedException {
		/*WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		*/
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Eclipse\\eclipse.exe");
		WebDriver driver=new ChromeDriver();
		  
		System.out.println("browser launched..");
		Thread.sleep(2000);
		driver.get("https://login.salesforce.com/");
		
		System.out.println("App URL passed..");
		driver.manage().window().maximize();  // to maximize the browser
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
		Thread.sleep(2000);
		System.out.println("Login Successful ! ");
		//Navigate to logout
	    driver.findElement(By.id("userNav-arrow")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	     Thread.sleep(3000);
		 driver.close();
}}
