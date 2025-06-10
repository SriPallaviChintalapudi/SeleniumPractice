package maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void f1() {
	    driver.get("https://www.flipkart.com/");
		System.out.println("hi");
		driver.manage().window().maximize();
	}
	@Test
	public void f2() {
		System.out.println("hiiiiiiiiiiii");
		driver.findElement(By.xpath("(//img[@alt='Image'])[22]")).click();
	}
	@Test
	public void f3() throws InterruptedException {
		String ParentWindowHandle = driver.getWindowHandle();
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
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
//		WebElement textBox = driver.findElement(By.xpath("//form[@class='lt4VIO']"));
//		textBox.sendKeys("533464");
		Thread.sleep(4000);

		driver.close();
		
		driver.switchTo().window(ParentWindowHandle);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='_3RX0a-']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void f4() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Help Center']")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}
}
