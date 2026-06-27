package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
	private static final String Enter = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		 WebElement pr = driver.findElement(By.xpath("//td[text()='Aer Lingus']/following-sibling::td[3]"));
		 System.out.println("The price of Aer Lingus:"+ pr.getText());
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//td[text()='Aer Lingus']/preceding-sibling::td[2]")).click();
		 
		 driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Vaishnavi");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='address']")).sendKeys("BTM Layout");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Banglore");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karnataka");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("560076");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("987654321");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2035");
		 driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Vaishnavi");
		 driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		 driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	
	}

}
