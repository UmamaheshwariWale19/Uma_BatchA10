package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Leaving From']")).sendKeys("Banglore" + Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Going To']")).sendKeys("Mumbai" + Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		
		List<WebElement> buses = driver.findElements(By.xpath("//div[@class='busname']"));
		System.out.println(buses.size());
		for(WebElement bus : buses) {
		System.out.println(bus.getText());
	
	 List<WebElement> prices = driver.findElements(By.xpath("//span[text()='Price']"));
	 System.out.println(prices.size());
	 for(WebElement price : prices) {
		 System.out.println(price.getText());
	 }

		
	}

	}
}
