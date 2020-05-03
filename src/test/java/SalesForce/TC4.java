package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Eclipse\\eclipse.exe");
		WebDriver driver=new ChromeDriver();      
		System.out.println("browser launched..");
		driver.get("https://login.salesforce.com/");
		System.out.println("App URL passed..");
		driver.manage().window().maximize();  // to maximize the browser
		System.out.println("Browser get maximizded..");
		Thread.sleep(1000);
// Reset PASSWORD
		
		driver.findElement(By.cssSelector("#forgot_password_link")).click();
		System.out.println("Reset password");
		driver.findElement(By.cssSelector("#un")).sendKeys("neharika.m@salesforce.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		//driver.close();	
// Validating User A/c
		
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("123");
		driver.findElement(By.cssSelector("#password")).sendKeys("22131");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println("Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		Thread.sleep(3000);
		driver.quit();
}}
