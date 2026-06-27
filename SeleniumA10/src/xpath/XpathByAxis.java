package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxis {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/UMAMAHESHWARI/Desktop/Movie.html");
		
	WebElement c1 = driver.findElement(By.xpath("//td[text()='Dhurandhar']/following-sibling::td[2]")); 
	System.out.println("The collection of Dhurandhar:"+c1.getText());
	
	 WebElement c2 = driver.findElement(By.xpath("//td[text()='Toxic']/following-sibling::td[2]"));
	 System.out.println("The collection of Toxic:" + c2.getText());
	 
	WebElement c3 = driver.findElement(By.xpath("//td[text()='Youth']/following-sibling::td[2]"));
	System.out.println("The collection of Youth:"+ c3.getText());
	
	WebElement r1 = driver.findElement(By.xpath("//td[text()='Dhurandhar']/following-sibling::td[1]"));
	System.out.println("The IMDB ratings of Dhurandhar:"+ r1.getText());
	
	WebElement r2 = driver.findElement(By.xpath("//td[text()='Toxic']/following-sibling::td[1]"));
	System.out.println("The IMDB ratings of Toxic:" + r2.getText());
	
	WebElement r3 = driver.findElement(By.xpath("//td[text()='Youth']/following-sibling::td[1]"));
	System.out.println("The IMDB ratings of Youth: " +r3.getText());
	
	WebElement p1 = driver.findElement(By.xpath("//td[text()='Dhurandhar']/preceding-sibling::td[1]"));
	System.out.println("The position of Dhurandhar:"+ p1.getText());
	
	WebElement p2 = driver.findElement(By.xpath("//td[text()='Toxic']/preceding-sibling::td[1]"));
	System.out.println("The position of Toxic:"+ p2.getText());
	
	WebElement p3 = driver.findElement(By.xpath("//td[text()='Youth']/preceding-sibling::td[1]"));
	System.out.println("The position of Youth:"+ p3.getText());
	}

}
