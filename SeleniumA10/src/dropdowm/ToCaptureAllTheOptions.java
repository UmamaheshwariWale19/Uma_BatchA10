package dropdowm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCaptureAllTheOptions {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/UMAMAHESHWARI/Desktop/Multiselect.html");
		
	WebElement dropdown3 = driver.findElement(By.id("Countries"));
	Select sel = new Select(dropdown3);
	sel.selectByIndex(1);
	sel.selectByValue("5");
	
	Select sel1 = new Select(dropdown3);
	List<WebElement> allOptions = sel.getOptions();
	for(WebElement ele: allOptions) {
		System.out.println(ele.getText());
	}
	}

}
