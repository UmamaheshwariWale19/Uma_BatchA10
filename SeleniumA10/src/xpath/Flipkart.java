package xpath;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More'][1]")).sendKeys("mobiles" + Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'Samsung Galaxy F70e 5G ')]/../../..//div[text()='Bank Offer']")).click();
		
		Set<String> url = driver.getWindowHandles();
		for(String id:url) {
			System.out.println(id);
		
			if(url.equals("https://www.flipkart.com/samsung-galaxy-f70e-5g-limelight-green-128-gb")) 
			driver.switchTo().window(id);{
			
	WebElement discount = driver.findElement(By.xpath("(//h1[contains(text(),'Samsung Galaxy F70e')]/../../../../../../../../../.././../..//div[contains(text(),'%')])[3]"));
		  System.out.println(discount.getText());
				 
	}
}
	}
}
		 
		
	


