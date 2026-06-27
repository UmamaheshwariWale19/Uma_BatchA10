package webelementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		boolean img = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(img);
		
		driver.quit();
	}

}
