package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/51");
		Thread.sleep(15000);
		
		String text = driver.findElement(By.xpath("(//span[text()='iphone']/..//span[contains(text(),'₹')])[1]")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("(//button[@name='addToCart'])[1]")).click();
		
		 
		
	}

}

//(//span[text()='iphone']