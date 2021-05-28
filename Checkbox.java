package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
     	driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[7]/a/img").click();
	
		WebElement checkbox = driver.findElement(By.xpath("//div[@class='example']//label"));
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		
		if(!checkbox.isSelected()) {
					
			driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();			
		}
		
		      WebElement chk=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
		
		      System.out.println("The checkbox is selection state is - " + chk.isSelected());
		
		
	        driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']")).click();
	
		    Thread.sleep(2000);
		
	        driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]")).click();
	
	     

	         driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
			
	}


	}
	