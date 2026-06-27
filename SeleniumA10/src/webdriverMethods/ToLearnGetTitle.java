package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) {
			System.out.println("Welcome page is Displayed");
		}
	 else {
		System.out.println("Welcome page is Displayed");
	}

}
}
