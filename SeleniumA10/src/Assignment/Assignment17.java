package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment17 {
   public static void main(String[] args) {
	
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	   
	   WebElement ele = driver.findElement(By.xpath("//section[text()='Web Elements']"));

		Select sel = new Select(ele);
		
		sel.selectByIndex(2);
		
		WebElement ele1 = driver.findElement(By.xpath("//p[text()='Actions']"));
		Select sel2 = new Select(ele1);
		
		sel2.selectByIndex(5);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		WebElement ele3 = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('disabled')",ele3);
		ele3.click();
		
		driver.findElement(By.id("//button[@id='submitButton']")).click();
		}
}

