package SalesForce;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC6 {
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
	//	setup for the login page
	driver.findElement(By.cssSelector("#username")).sendKeys("neharika.m@salesforce.com");
	driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#rememberUn")).click();
	driver.findElement(By.cssSelector("#Login")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
	driver.findElement(By.id("userNavButton")).click();
	//driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("My Profile")).click();
	Thread.sleep(2000);
	//driver.findElement(By.className("mruText")).click();
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector("body.hasMotif.userTab.UserProfilePage.ext-webkit.ext-chrome.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outerNoSidebar td.noSidebarCell div.profilePage.userProfilePage:nth-child(3) div.leftContent div.contactInfo.profileSection:nth-child(4) div.vfButtonBar h3:nth-child(1) div.vfButtonBarButton div.editPen a.contactInfoLaunch.editLink > img:nth-child(1)")).click();
	Thread.sleep(1000);
  
	driver.findElement(By.xpath("//a[contains(text(),'About')]")).sendKeys(Keys.TAB);	

	//driver.switchTo().alert().accept();
	//alt.click();
	
	
	Thread.sleep(1000);
	driver.findElement(By.id("lastName")).sendKeys("Mudunuri");
	driver.findElement(By.className("zen-btn zen-primaryBtn zen-pas")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
	driver.findElement(By.cssSelector("body")).sendKeys("A MESSAGE TO OUR CLIENTS DURING THE CORONAVIRUS (COVID-19) OUTBREAK : STAY HOME! STAY SAFE!");
	driver.findElement(By.id("publishersharebutton")).click();
	Thread.sleep(2000);
	//	driver.quit();	
}
}