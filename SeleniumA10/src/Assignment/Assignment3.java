package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Vaishnavi");
		driver.findElement(By.name("LastName")).sendKeys("Wale");
		driver.findElement(By.id("Email")).sendKeys("vaishnaviwale0@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vai@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Vai@1234");
	}

}
