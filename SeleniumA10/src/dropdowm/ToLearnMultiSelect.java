package dropdowm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/UMAMAHESHWARI/Desktop/Multiselect.html");
		
		WebElement dropdown2 = driver.findElement(By.id("Countries"));
		Select sel = new Select(dropdown2);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("8");
		//sel.selectByVisibleText("Poland");
		Thread.sleep(3000);
		
		sel.deselectByIndex(1);
	}

}
