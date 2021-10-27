package seleniumSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		driver.manage().window().maximize();
  
		List<WebElement> tablerows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(tablerows.size());
		
		List<WebElement> tablecol = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		System.out.println(tablecol.size());


		String progressValue = driver
				.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td"))
				.getText();
		System.out.println("progressValue for Interact with Elements:" + progressValue);

		List<WebElement> progValueList = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));

		ArrayList<Integer> table2 = new ArrayList<Integer>();
		for (int i = 2; i < progValueList.size(); i++) {
			String text = progValueList.get(i).getText();
			String newValues = text.replaceAll("%", "");
			table2.add(Integer.parseInt(newValues));

		}

		Integer minVal = Collections.min(table2);

		System.out.println(minVal);

		driver.findElement(By.xpath("//td[contains(text()," + minVal + ")]/following-sibling::td/input")).click();

	}

}
