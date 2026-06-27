package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c2785778308-3 icon-cancel')]")).click();
		
		driver.findElement(By.id("password")).sendKeys("vai@1234");
		
		WebElement eyeI = driver.findElement(By.xpath("//img[contains(@src,'assets/img/Revamp/icon_eye_close.svg')]"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(eyeI).perform();
	}

}
