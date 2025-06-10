package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class ByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestinghelp.com/");
		driver.manage().window().maximize();
		String str = driver.getTitle();
		System.out.println(str);
		
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("Maven");
		String mytxt = txtSearch.toString();
		
		WebElement button = driver.findElement(By.name("sa"));
		String btnText = button.toString();
		button.click();
		
		System.out.println(mytxt);
		System.out.println(btnText);
		
		driver.close();
		
		
		driver.findElement(By.name("q")).sendKeys("maven");
		driver.findElement(By.name("sa")).click();
		
	}
	

}
