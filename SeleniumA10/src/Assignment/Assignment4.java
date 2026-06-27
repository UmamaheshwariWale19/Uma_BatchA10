package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("vaishnaviwale0@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("vai@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("Email")).sendKeys("vaishnaviwale0@gmail.com");
	}

}
