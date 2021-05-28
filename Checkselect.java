package week2.assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com");
		driver.manage().window().maximize();
		WebElement val=	driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[5]"));
		val.click();
		int i=0;
		WebElement val1 = driver.findElement(By.xpath("//select[@name='dropdown2']")); 
		
		Select tool=new Select(val1);
		List<WebElement> choose= tool.getOptions();
		for (WebElement opt : choose) {
			 {
			i++;
			if (i==5){System.out.println(opt.getText());
			
		}
			opt.click();
		//Direct method of selecting the last option
		/* WebElement val= driver.findElement(By.id("dropdown3"));
		    Select lr1=new Select(val);
		  lr1.selectByValue("4");*/
		   
	

	}
		}}
	}

