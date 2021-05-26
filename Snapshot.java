package week2.day2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/table.html");
	
	driver.manage().window().maximize();

File snap=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(snap,new File("snap.png"));
	
	
}

	
	
	
	
	
	

}
