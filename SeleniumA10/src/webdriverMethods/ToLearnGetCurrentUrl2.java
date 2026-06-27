package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl2 {
public static void main(String[] args) {
 WebDriver driver = new ChromeDriver();
 
 driver.get("https://www.zomato.com/");
String url = driver.getCurrentUrl();
System.out.println(url);

if(url.equals("https://www.zomato.com/")) {
	System.out.println("Welcome page is displayed");
}else {
	System.out.println("Welcome page is not displayed");
}
}
}
