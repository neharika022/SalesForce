package SalesForce;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC25 {
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
/*
	 	//Create Contacts
	     driver.findElement(By.cssSelector("#AllTab_Tab")).click();
			Thread.sleep(2000);
			
			 driver.findElement(By.linkText("Contacts")).click();
			 Thread.sleep(2000);
	
			 
			 
			 driver.findElement(By.name("new")).click();
			 Thread.sleep(2000);
		// Adding Last and AcCount Name	 
			 driver.findElement(By.id("name_lastcon2")).sendKeys("pericharla");
					 
			 driver.findElement(By.id("con4")).sendKeys("Neharika Mudunuri");
			driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
		System.out.println("The contact is created ");							
											 
	*/		
//TC26
	 /*
	 	driver.findElement(By.cssSelector("#AllTab_Tab")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.linkText("Contacts")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Create New View")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("fname")).sendKeys("July");
		 driver.findElement(By.id("devname")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
		System.out.println("Created View Page");	
			
		*/
	 
//TC27
	 /*
	 driver.findElement(By.cssSelector("#AllTab_Tab")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.linkText("Contacts")).click();
		 Thread.sleep(2000);
		 Select dropDown1= new Select (driver.findElement(By.id("hotlist_mode")));
			dropDown1.selectByVisibleText("Recently Created");	 
		 
	*/	 
//TC28		 
	 	/*
	 	driver.findElement(By.cssSelector("#AllTab_Tab")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.linkText("Contacts")).click();
		 Thread.sleep(2000);
		 Select dropDown2= new Select(driver.findElement(By.id("fcf")));
		 dropDown2.selectByVisibleText("My Contacts");
		driver.findElement(By.name("go")).click();								 
		*/						 

//TC29
	 /*
		
		 driver.findElement(By.cssSelector("#AllTab_Tab")).click();
			Thread.sleep(2000);
			
			 driver.findElement(By.linkText("Contacts")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[contains(text(),'ABCD')]")).click();
		*/
//TC30
			 
			/* 
			 driver.findElement(By.cssSelector("#AllTab_Tab")).click();
				Thread.sleep(2000);
				
				 driver.findElement(By.linkText("Contacts")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.linkText("Create New View")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.id("devname")).sendKeys("EFGH");
				 driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
				 System.out.println("ERROR : you must enter a value");
		
		*/
//TC31		
		
					driver.findElement(By.id("AllTab_Tab")).click();
					Thread.sleep(2000);
					
					 driver.findElement(By.linkText("Contacts")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.linkText("Create New View")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.id("fname")).sendKeys("ABCD");
					 driver.findElement(By.id("devname")).click();
		WebElement uniquename=driver.findElement(By.id("devname"));
		uniquename.clear();
		Thread.sleep(2000);
		driver.findElement(By.id("devname")).sendKeys("EFGH");
					 driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")).click();
		
//TC32

						driver.findElement(By.id("AllTab_Tab")).click();
						Thread.sleep(2000);
						
						 driver.findElement(By.linkText("Contacts")).click();
						 Thread.sleep(2000);
						 driver.findElement(By.name("new")).click();
						 Thread.sleep(2000);
					// Adding Last and AcCount Name	 
						 driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
								 
						 driver.findElement(By.id("con4")).sendKeys("Global Media");
						driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
					System.out.println("Error: Invalid Data.\r\n" + 
							"Review all error messages below to correct your data.");		
		
		
								 
			
}}
