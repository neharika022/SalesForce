package SalesForce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC11 {
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
//		setup for the login page
		driver.findElement(By.cssSelector("#username")).sendKeys("neharika.m@salesforce.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rememberUn")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
	Thread.sleep(3000);
		
		//Account 
	driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
	driver.findElement(By.linkText(	"Accounts")).click();
	Thread.sleep(2000);
	System.out.println("Account page is Displayed");
	//driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
	driver.findElement(By.id("fname")).sendKeys("Neha022");
			driver.findElement(By.id("devname")).sendKeys(" ");
	driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
	Thread.sleep(5000);
System.out.println("Newwely added view is displayed");
	driver.close();
	}}
