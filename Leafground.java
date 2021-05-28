package week2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		
		WebElement drop= driver.findElement(By.id("dropdown1"));
	    Select dd=new Select(drop);
	    dd.selectByIndex(1);
		
		
	    WebElement training= driver.findElement(By.name("dropdown2"));
	    Select pro=new Select(drop);
	    pro.selectByVisibleText("Appium");
	    
	    WebElement val= driver.findElement(By.id("dropdown3"));
	    Select lr=new Select(val);
	    lr.selectByValue("4");
	    
	    WebElement dd1= driver.findElement(By.className("dropdown"));
	    Select d=new Select(dd1);
	    d.selectByVisibleText("Selenium");
	    
	
	    
	    WebElement selectTrainingProgram = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")); 
	  
	    new Select(selectTrainingProgram).selectByVisibleText("Loadrunner"); 
	  
	
	   driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option")).click();
	    
	  
	
	}

}
