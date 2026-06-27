package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//https://www.flipkart.com/
	
	String url = driver.getCurrentUrl();
    System.out.println(url);
    
    if(url.equals("https://www.amazon.in/")) {
    	System.out.println("Welcome is displayed");
   }else {
    	System.out.println("Welcome is not displayed");
    }
}
}




