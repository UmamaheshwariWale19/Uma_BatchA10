package webelementsMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demowebshop.tricentis.com/");
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("count of links:" + links.size());
	for(WebElement ele: links) {
		System.out.println("Names of the links are:" + ele.getText());
		System.out.println("URL of the links are:"+ ele.getAttribute("href"));
	}

     driver.quit();
}
}
