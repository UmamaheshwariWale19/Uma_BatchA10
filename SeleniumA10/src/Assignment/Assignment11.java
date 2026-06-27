package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.pinterest.com/");
		Thread.sleep(1000);
		
		 List<WebElement> image= driver.findElements(By.tagName("img"));
		System.out.println("The count of imgs:"+ image.size());
		for(WebElement ele : image) {
			//String source = ele.getAttribute("src");
			//System.out.println(source);
			System.out.println("The sources of imgaes:"+ele.getAttribute("src"));
			
			
		}
	}

}

