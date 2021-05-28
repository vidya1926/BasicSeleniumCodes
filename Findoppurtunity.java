package week2.assignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findoppurtunity {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//div[@id='label']//a[1]")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/opportunitiesMain']")).click();
	//	driver.findElement(By.xpath("//div[@class='x-grid3-header-offset']//table"));
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		
		List<WebElement> find= driver.findElements(By.xpath("//div[@id=\\\"ext-gen543\\\"]"));
		for (WebElement opp : find) {
			System.out.println(opp.getText());
			
		}
String t1=driver.getTitle();
System.out.println(t1);

		
//a[@id='ext-gen824']
	
	}

}
