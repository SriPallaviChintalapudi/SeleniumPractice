package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:/Users/siva/workspace/Selenium/driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/"); 
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("6309497735");
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();
	System.out.println(driver.getTitle());
	
	
	Thread.sleep(2000);
	driver.close();
	

	}

}
