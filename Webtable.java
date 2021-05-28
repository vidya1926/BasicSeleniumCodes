package week2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> tablerows =driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(tablerows.size());

	//	List<WebElement> tablecol =driver.findElements(By.xpath("//table[@id='table_id']//td"));
	//	System.out.println(tablecol.size());
		
		for(int i=2;i<tablerows.size();i++)//search starts from second row.
		{
		String text=driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td[2]")).getText();
		System.out.println(text);
		String percentage=text.replaceAll("\\D","");
		System.out.println(percentage);
		
		}
     String learnToInteract = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']")).getText();
	
	List<WebElement> mentorName =driver.findElements(By.xpath("(//table[@id='table_id']/tbody/tr[3])"));
	
	for (WebElement mentor : mentorName)
	{
		System.out.println(mentor.getText());
	
	}
	
	
	
	//driver.findElement(By.xpath("(//tr[@class='even']//input)[2]")).click();*/
	}}
