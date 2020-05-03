package SalesForce;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC33 {
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
//	setup for the login page
		driver.findElement(By.cssSelector("#username")).sendKeys("neharika.m@salesforce.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rememberUn")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
	Thread.sleep(3000);

	//driver.findElement(By.linkText("Home")).click();
	//		System.out.println("Print the First and Last Name");
	// System.out.println( driver.findElement(By.className("currentStatusUserName")).getText());
				
	
//TC34
	 
	 /*
	 driver.findElement(By.className("currentStatusUserName")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")).click();;
	 Thread.sleep(2000);
			
	 // driver.findElement(By
	
	 driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
	 Thread.sleep(2000);
	
	
	*/
	
//TC35	
	
		/*
	 driver.findElement(By.cssSelector("#AllTab_Tab")).click();
	 Thread.sleep(2000);
		driver.findElement(By.name("customize")).click();
		 Thread.sleep(2000);
		Select dropDown1= new Select (driver.findElement(By.id("duel_select_1")));
		dropDown1.selectByIndex(1);
					 driver.findElement(By.className("leftArrowIcon")).click();
		 driver.findElement(By.name("save")).click();
		 driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
									 
			driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#rememberUn")).click();
			driver.findElement(By.cssSelector("#Login")).click();
			Thread.sleep(2000);
	*/
	
//TC36
			
	/*
			driver.findElement(By.id("home_Tab")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sunday May 3, 2020")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")).click();
			
			//	driver.findElement(By.className("comboboxIcon")).click();
			driver.findElement(By.id("evt5")).sendKeys("Ohters");
			//				driver.findElement(By.id("EndDateTime_time"));
	Thread.sleep(2000);
					  WebElement EndTime = driver.findElement(By.id("EndDateTime_time"));
					  EndTime.clear();  
					  EndTime.sendKeys("9:00 PM");
						Thread.sleep(2000);
					  driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]")).click();
	
	System.out.println("The calander page is displayed with other activities");
	
		*/
	
//TC37	
	
			driver.findElement(By.cssSelector("#home_Tab")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.linkText("Sunday May 3, 2020")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("4:00")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("evt5")).sendKeys("Others");
			Thread.sleep(2000);
			 WebElement EndTime = driver.findElement(By.id("EndDateTime_time"));
			  EndTime.clear();  
			  EndTime.sendKeys("7:00 PM");
				Thread.sleep(2000);
				driver.findElement(By.id("IsRecurrence")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[contains(text(),'Weekly')]")).click();
				WebElement EndTime1 = driver.findElement(By.id("RecurrenceEndDateOnly"));
				  EndTime1.clear();  
				  EndTime1.sendKeys("5/18/2020");
				  EndTime1.click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.className("monthViewIconOn")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}

