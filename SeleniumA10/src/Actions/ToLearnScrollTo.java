package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrollTo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(2000);
		
		
		
		WebElement ele = driver.findElement(By.xpath("//button[@title='More News']"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform(); 
		ele.click();
		//act.scrollByAmount(0, 2000).perform();
		
	}

}
