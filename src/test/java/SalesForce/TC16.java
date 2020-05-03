package SalesForce;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC16 {

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
	driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]")).click();
	 Thread.sleep(3000);
		
		//Account 
	driver.findElement(By.xpath("//li[@id='AllTab_Tab']")).click();
Thread.sleep(3000);
driver.findElement(By.partialLinkText("Opportuniti")).click();
Thread.sleep(3000);	
driver.findElement(By.linkText("Edit")).click();
Thread.sleep(2000);
Select dropDown1=new Select	(driver.findElement(By.xpath("//select[@id='fcol1']")));
dropDown1.selectByVisibleText("Opportunity Name");
Thread.sleep(2000);
Select dropDown2=new Select	(driver.findElement(By.id("fcol2")));
dropDown2.selectByVisibleText("Account Name");

Select dropDown3=new Select	(driver.findElement(By.id("fcol3")));
dropDown3.selectByVisibleText("Close Date");

Select dropDown4=new Select	(driver.findElement(By.id("fcol4")));
dropDown4.selectByVisibleText("Stage");
	

Select dropDown5=new Select	(driver.findElement(By.id("fcol5")));
dropDown5.selectByVisibleText("Probability (%)");
driver.findElement(By.id("bool_filter_toggle")).click();;
	driver.findElement(By.id("fAddRowLink")).click();
	
	Select dropDown6=new Select	(driver.findElement(By.id("fcol6")));
	dropDown6.selectByVisibleText("Lead Source");
	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("body.hasMotif.opportunityTab.filterEdit.FilterEditPage.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer td.oRight div.bPageBlock.brandSecondaryBrd.bEditBlock.secondaryPalette:nth-child(3) div.pbBottomButtons:nth-child(15) table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) td.pbButtonb > input.btn.primary:nth-child(1)")).click();
driver.findElement(By.cssSelector("body.hasMotif.opportunityTab.filterEdit.FilterEditPage.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer td.oRight div.bPageBlock.brandSecondaryBrd.bEditBlock.secondaryPalette:nth-child(3) div.pbHeader:nth-child(13) table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) td.pbButtonb > input.btn.primary:nth-child(1)")).click();
Thread.sleep(4000);
}}