package codes;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.ui.Select;

public class DropDownOption {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.zoom.com/");
//		
//		WebElement SolutionsDropdownOption = driver.findElement(By.cssSelector(".zmnav_main-nav__megamenu-trigger"));
//		SolutionsDropdownOption.click();
//		WebElement educationoption = driver.findElement(By.linkText("Education"));
//		educationoption.click();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement SearchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchTextBox.click();
		SearchTextBox.sendKeys("A");
		
		
		WebElement ComboBox = driver.findElement(By.id("searchDropdownBox"));
		
		ComboBox.click();
		
		Select select = new Select(ComboBox);
		
		select.selectByIndex(1);
		select.selectByVisibleText("Amazon Fresh");
		//select.deselectAll();
		
	}

}
