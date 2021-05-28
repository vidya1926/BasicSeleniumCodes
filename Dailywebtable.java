package week2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dailywebtable {
	
			public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leafground.com/pages/table.html");
				
				driver.manage().window().maximize();
				
				
			String tablerow = driver.findElement(By.xpath("//table[@class='display']//tr")).getText();
				System.out.println(tablerow);
	}

}
