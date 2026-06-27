package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment20 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h5[text()='iFrame Demo']/..//..//input[contains(@type,'text')]")).sendKeys("selenium");
		
	WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'text')"));
    File temp = ele.getScreenshotAs(OutputType.FILE);
	File prem = new File("./screenshots/image.png");
	FileHandler.copy(temp, prem);
	}

}
