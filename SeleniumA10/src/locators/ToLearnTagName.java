package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//System.out.println(allLinks.size());
		//for(WebElement ele:allLinks) {
			//String names = ele.getText();
			//System.out.println(names);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement ele:allLinks) {
		String names = ele.getText();
		System.out.println(names);
		
		
		List<WebElement> allImg = driver.findElements(By.tagName("img"));
		System.out.println(allImg.size());
		
		
		}
		
	}

}
