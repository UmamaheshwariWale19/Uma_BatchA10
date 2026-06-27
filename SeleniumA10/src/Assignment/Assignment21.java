package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		FileInputStream fis = new FileInputStream("./TestData/resumedata.properties");
		Properties prop = new Properties();
		 prop.load(fis);
		String url = prop.getProperty("url");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.linkText("REGISTER NOW")).click();
		String Name = prop.getProperty("Name");
		String Email = prop.getProperty("Email");
		String Mobile = prop.getProperty("Mobile");
		String Age = prop.getProperty("Age");
		System.out.println(Age);
		
		driver.findElement(By.id("firstname")).sendKeys(Name);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("mobile")).sendKeys(Mobile);
		//driver.findElement(By.id("datepicker")).sendKeys(Age);
		driver.findElement(By.xpath("(//span[@class='year']//..//..//..//..//..//..//..//span[contains(@class,'month')])[6]"));
		
		
	driver.findElement(By.id("file-upload")).click();
       File f = new File("‪C:\\Users\\UMAMAHESHWARI\\Documents\\maual.resume1.docx");
         String abs = f.getAbsolutePath();
         Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@type='file]")).sendKeys(abs);
		
       driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
		
		
		
		
	}

}
