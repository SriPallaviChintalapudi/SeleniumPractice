package codes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipWindowHnadles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		String ParentWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//img[@alt='Image'])[22]")).click();
		System.out.println("parentwindow");
		Thread.sleep(3000);
		
		//Set <String> windowHandles = driver.getWindowHandles();
		driver.findElement(By.xpath("(//img)[5]")).click();
		Thread.sleep(4000);
		for(String childWindow : driver.getWindowHandles()) {	
				
				driver.switchTo().window(childWindow);
				
			}
		WebElement text = driver.findElement(By.xpath("//a[@class='CDJO0-']"));
		text.click();
//		WebElement textBox = driver.findElement(By.xpath("//form[@class='lt4VIO']"));
//		textBox.sendKeys("533464");
		Thread.sleep(4000);

		driver.close();
		
		driver.switchTo().window(ParentWindowHandle);
		driver.navigate().back();
		driver.quit();
		
	}
	
}
