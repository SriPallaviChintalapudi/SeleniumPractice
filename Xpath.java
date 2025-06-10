package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Xpath {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		
		//Xpath axes
		//xpath parent
		WebElement parent = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input/parent::div"));
		//parent.click();
		System.out.println("Found the parent");
		
		//Child
		WebElement child = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/child::input"));
		child.sendKeys("120325630");
		Thread.sleep(5000);
		System.out.println("Child is working");
		
		//ancestor
		WebElement ancestor = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input/ancestor::div"));
		System.out.println("Ancestor is found");
		
		//descendant
		child.clear();
		WebElement descendant = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/descendant::input"));
		descendant.click();
		descendant.sendKeys("0000000");
		System.out.println("found the descendant");
		
		
		//following
		WebElement following = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/span/following::span"));
		String FollowingText = following.getText();
		System.out.println(FollowingText);
		System.out.println("following is found");
		
		//following sibling
		WebElement followingSibling = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/span/following-sibling::p"));
		String FollowingSiblingText = followingSibling.getText();
		System.out.println(FollowingSiblingText);
		System.out.println("Following-sibling is found");
		driver.close();
		
		//preceding is followed by preceding word
		//preceding-sibling is followed by the preceding keyword
		//self
		//attribute
		
	}

}
