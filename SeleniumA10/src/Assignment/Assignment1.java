package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Online Hotel Booking")) {
			System.out.println("Welcome page is Displayed");
		}
	 else {
		System.out.println("Welcome page is Displayed");
	}
		String code = driver.getPageSource();
		System.out.println(code);
 
 Dimension size = driver.manage().window().getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	
	 Point position = driver.manage().window().getPosition();
     System.out.println(position.getX());
     System.out.println(position.getY());
     
     driver.quit();
	}}
  
