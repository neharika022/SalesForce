package SalesForce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC12 {
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
	//	driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
	 //   Thread.sleep(3000);
		
		//Account 
	driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
	 Thread.sleep(3000);
	driver.findElement(By.linkText(	"Accounts")).click();
	Thread.sleep(2000);
	System.out.println("Account page is Displayed");

	//driver.findElement(By.xpath("//select[@id='00B5w00000CnhQ1_listSelect']"));
	driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
	driver.findElement(By.id("fname")).sendKeys("Sateesh");
		WebElement uniquename=	driver.findElement(By.id("devname"));
		uniquename.clear();
		Thread.sleep(3000);
		driver.findElement(By.id("devname")).sendKeys("Sateesh ");
	
		Select dropDown1=new Select	(driver.findElement(By.id("fcol1")));
		dropDown1.selectByVisibleText("Account Name");
		Thread.sleep(3000);
		Select dropDown2=new Select	(driver.findElement(By.id("fop1")));
		dropDown2.selectByVisibleText("contains");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")).click();
	Thread.sleep(3000);
	driver.close();
	}


	}
