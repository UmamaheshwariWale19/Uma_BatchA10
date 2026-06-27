package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vaishnavi@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pass@123");
		WebElement button = driver.findElement(By.xpath("//div[@role='none']"));
		
		boolean text = button.isEnabled();
		System.out.println(text);
	}

}
