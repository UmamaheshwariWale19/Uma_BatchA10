package Assignment;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment14 {
   public static void main(String[] args) {
	
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   String stamptime = LocalDateTime.now().toString().replace(":", "-");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://www.shoppersstack.com/");
	   
	    driver.findElement(By.xpath("//img[@alt='iphone']")).click();
	    driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("123456");
	    
	WebElement ele = driver.findElement(By.xpath("//input[@id='Check Delivery']"));
	File temp = ele.getScreenshotAs(OutputType.FILE);
	File perm = new File("./Screenshots/"stamptime+".png");
	FileHandler.copy(temp, perm);)

}
}
