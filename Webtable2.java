package seleniumSample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable2 {

	public static void main(String[] args) {	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement table = driver.findElement(By.id("table_id"));
		 List<WebElement> list1 = driver.findElements(By.xpath("//*[@id='table_id']/tbody/tr"));
	        System.out.println(list1.size());
	        
	        List<WebElement> list2 = driver.findElements(By.xpath("//*[@id='table_id']/tbody/tr[1]/th"));
	        System.out.println(list2.size());
		
		/*List<WebElement> row = table.findElements(By.tagName("tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table//tr[1]/th"));
		System.out.println("The row count of this table is: "+ row.size());
		System.out.println("The column count of this table is: "+col.size());
				
		for(int i=2; i<row.size();i++)
		{
		WebElement name = driver.findElement(By.xpath("//table//tr["+i+"]/td[1]"));
		if(name.getText().contains("Elements")) {
			
		WebElement check = driver.findElement(By.xpath("//table//tr["+i+"]/td[2]"));
		System.out.println(check.getText());*/
			}
		
		
		
	}


