package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("iphone 17 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//span[contains(text(),'iPhone Air ')]"));
		for(WebElement ele : names) {
		String brandname = ele.getText();
		System.out.println(brandname);
		
		List<WebElement> prices = driver.findElements(By.xpath("(//span[contains(text(),'iPhone' )])//../../../..//span[contains(text(),'₹')]"));
		for(WebElement ele1 : prices) {
		String range = ele1.getText();
		System.out.println(range);
		}
		
		
		
		}
		
		
	}

}
