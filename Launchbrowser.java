package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String title=driver.getTitle();
	System.out.println(title);
    driver.findElement(By.linkText("CRM/SFA")).click();
     //create account
    driver.findElement(By.linkText("Create Account")).click();
    
    driver.findElement(By.id("accountName")).sendKeys("Employee1");
    
    driver.findElement(By.id("groupNameLocal")).sendKeys("Sanjay");
    driver.findElement(By.id("annualRevenue")).sendKeys("1234657");
    
    
    
    driver.findElement(By.name("parentPartyId")).sendKeys("");
    driver.findElement(By.id("officeSiteName")).sendKeys("Test Leaf");
    
    WebElement currency= driver.findElement(By.id("currencyUomId"));
    Select cur =new Select(currency);
    cur.selectByVisibleText("INR - Indian Rupee");
    
    WebElement industry= driver.findElement(By.name("industryEnumId"));
    Select ind=new Select(industry);
    ind.selectByVisibleText("Computer Software");
    
    driver.findElement(By.id("numberEmployees")).sendKeys("120");
        
    
    WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
    Select corp=new Select(ownership);
    corp.selectByVisibleText("Corporation");
    
    
    driver.findElement(By.id("sicCode")).sendKeys("Emp12");
    
    WebElement source= driver.findElement(By.name("dataSourceId"));
    Select src1=new Select(source);
    src1.selectByVisibleText("Cold Call");	
   
    driver.findElement(By.id("tickerSymbol")).sendKeys("TL");
    
    WebElement initial= driver.findElement(By.name("initialTeamPartyId"));
    Select ini=new Select(source);
    ini.selectByVisibleText("");
    		
    WebElement marketing= driver.findElement(By.id("marketingCampaignId"));
    Select mar=new Select(marketing);
    ini.selectByVisibleText("Employee");
    
    driver.findElement(By.name("description")).sendKeys("working with enthu");
    driver.findElement(By.name("importantNote")).sendKeys("Team Effort");
    
    driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("2");
    
    driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("1");
    driver.findElement(By.id("primaryPhoneExtension")).sendKeys("91");
    driver.findElement(By.id("primaryEmail")).sendKeys("abc.1@gmail.com");
    driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9136987421");
    driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("vijay");
    driver.findElement(By.id("primaryWebUrl")).sendKeys("www.abc.com");
    
    
    
    driver.findElement(By.id("generalToName")).sendKeys("Sanjay");
    driver.findElement(By.id("generalAttnName")).sendKeys("Manager");
    driver.findElement(By.id("generalAddress1")).sendKeys("NO:5 SS APT");
    driver.findElement(By.id("generalAddress2")).sendKeys("Anna Nagar");
    driver.findElement(By.id("generalCity")).sendKeys("Chennai");
    driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("2");
    
    
    WebElement country= driver.findElement(By.id("generalCountryGeoId"));
    Select count=new Select(country);
    count.selectByVisibleText("India");
    
    
    driver.findElement(By.id("generalPostalCode")).sendKeys("600001");
    driver.findElement(By.id("generalPostalCodeExt")).sendKeys("333"); 
    
    WebElement province= driver.findElement(By.id("generalStateProvinceGeoId"));
    Select state=new Select(province);
    count.selectByIndex(3);
        
    driver.findElement(By.className("smallSubmit")).click();
	String title1 =driver.getTitle();
	System.out.println(title1);
	
	}

}
