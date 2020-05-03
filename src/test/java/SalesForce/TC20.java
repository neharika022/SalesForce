package SalesForce;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC20 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Eclipse\\eclipse.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("browser launched..");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("https://login.salesforce.com/");
		System.out.println("App URL passed..");
		driver.manage().window().maximize();  // to maximize the browser
		System.out.println("Browser get maximizded..");
		Thread.sleep(1000);
//		setup for the login page
		driver.findElement(By.cssSelector("#username")).sendKeys("neharika.m@salesforce.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rememberUn")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
	 //Thread.sleep(3000);
	/*	
//Leads TC20
	
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		System.out.println("Navigated to Leads Page");


//TC21 
		System.out.println(driver.findElement(By.id("fcf")).getText());
				
//TC22		
		
		Select dropDown1= new Select(driver.findElement(By.id("fcf")));
		dropDown1.selectByVisibleText("My Unread Leads");
		Thread.sleep(4000);
		 driver.findElement(By.id("userNav-arrow")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.partialLinkText("Logo")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
			Thread.sleep(1000);
		  driver.findElement(By.cssSelector("#Login")).click();
			Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
		// Thread.sleep(3000);					
		 driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Leads")).click();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		 Thread.sleep(2000);
System.out.println("The Report is Displayed");

//TC23
	
	Select dropDown2= new Select(driver.findElement(By.id("fcf")));
	dropDown2.selectByVisibleText("Today's Leads");
	System.out.println("Todays Lead are Displayed");
Thread.sleep(3000);
*/
//TC24

		     driver.findElement(By.cssSelector("#AllTab_Tab")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Leads")).click();
				Thread.sleep(2000);
				System.out.println("Navigated to Leads Page");
				driver.findElement(By.name("new")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
				driver.findElement(By.id("lea3")).sendKeys("ABCD");
				driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
System.out.println("Newly created Leads Page is Displayed");
Thread.sleep(4000);
driver.close();
	}}
