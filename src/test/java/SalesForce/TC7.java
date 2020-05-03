package SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC7 {
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
	
    driver.findElement(By.id("userNav-arrow")).click();
    Thread.sleep(2000);
 
	driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#PersonalInfo_font")).click();
	driver.findElement(By.cssSelector("#LoginHistory_font")).click();
	driver.findElement(By.partialLinkText("Download login histo")).click();

//Display & Layout
    driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
    Thread.sleep(2000);
	driver.findElement(By.cssSelector("#DisplayAndLayout_font")).click();
	driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']")).click();
 Thread.sleep(2000);
 Select dropDown1=new Select(driver.findElement(By.cssSelector("#p4")));
	dropDown1.selectByVisibleText("Salesforce Chatter");
	Thread.sleep(1000);
  
	WebElement element = driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element);
	actions.perform();	
	 driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
	driver.findElement(By.className("rightArrowIcon")).click();

//click on email link and email settings
	driver.findElement(By.id("EmailSetup_font")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("EmailSettings_font")).click();
		WebElement sendername= driver.findElement(By.id("sender_name"));
		sendername.clear();
		driver.findElement(By.id("sender_name")).sendKeys("Neharika Mudunuri");
		WebElement senderemail= driver.findElement(By.id("sender_email"));
		senderemail.clear();
		driver.findElement(By.id("sender_email")).sendKeys("neharika022@gmail.com");
		driver.findElement(By.id("auto_bcc1")).click();
		driver.findElement(By.name("save")).click();
		driver.findElement(By.id("CalendarAndReminders_font")).click();
				driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
				driver.findElement(By.id("testbtn")).click();
				System.out.println("POP UP WINDOW OPENED");
Thread.sleep(5000);
driver.quit();
}}
