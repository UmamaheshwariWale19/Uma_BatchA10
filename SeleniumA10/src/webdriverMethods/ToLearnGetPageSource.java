package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	String code = driver.getPageSource();
	System.out.println(code);
}

}
