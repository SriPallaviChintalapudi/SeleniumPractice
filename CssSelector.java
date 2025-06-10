package codes;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.zoho.com/meeting/");
    driver.manage().window().maximize();
    //id css selector
    
    //1st method syntax driver.findElement(By.cssSelector("tagname#IdValue"))
    WebElement EmailTextBox = driver.findElement(By.cssSelector("input#email"));
    EmailTextBox.click();
    EmailTextBox.sendKeys("abc123@gmail.com");
    //
    WebElement PasswordTextBox = driver.findElement(By.cssSelector("#password"));
    PasswordTextBox.click();
    PasswordTextBox.sendKeys("123456");
    
    PasswordTextBox.clear();
    PasswordTextBox.sendKeys("Pallavi");
    //WebElement MobileTexBox1 = driver.findElement(By.cssSelector(input[id = "rmobile"]));
    WebElement MobileTexBox = driver.findElement(By.cssSelector("input[id = 'rmobile']"));
    MobileTexBox.sendKeys("9876543210");
     
   //class css selector
    
    //1st method driver.findElement(by.cssSelector("tagname.(class value)"));
//    WebElement CheckBox = driver.findElement(By.cssSelector("input.za-tos"));
//    CheckBox.click();
    WebElement CheckBoxLabel = driver.findElement(By.cssSelector("label[for='tos']"));
    CheckBoxLabel.click();
    System.out.println("checkbox is selected");

    //2nd method driver.findElement(by.cssSelector(".class value"));
    WebElement PasswordShowBtn = driver.findElement(By.cssSelector(".zpassword-show"));
    PasswordShowBtn.click();
    
    //3rd method driver.findElement(by.cssSelector("tagName[class='classvalue']"));
    WebElement TryNowBtn = driver.findElement(By.cssSelector("input[class = 'signupbtn']"));
    TryNowBtn.submit();
    
    
    Thread.sleep(2000);
    driver.close();
    
	}

}
