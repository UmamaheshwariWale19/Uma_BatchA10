package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
 boolean status = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']")).isSelected();
    System.out.println(status);
    
   WebElement radio = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@id='pollanswers-1']"));
   radio.click();
   
   boolean text = radio.isSelected();
      System.out.println(text);
   
	}
    }
	
