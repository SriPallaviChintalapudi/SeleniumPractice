package maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class forms {
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest()
	public void BeforeTest() throws InterruptedException {
		driver.get("https://registration.shramsuvidha.gov.in/user/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	@Test(priority=1)
		public void TestCase() throws InterruptedException {
			WebElement UserNameTextBox = driver.findElement(By.xpath("//input[@id='UserUsername']"));
			//UserNameTextBox.click();
			UserNameTextBox.sendKeys("Pallavi");
		
			Thread.sleep(5000);
		}
	@Test(priority=2)
	public void TestCaseTwo() throws InterruptedException {
		WebElement UserPasswordTextBox = driver.findElement(By.xpath("//input[@id='UserPassword']"));
		UserPasswordTextBox.click();
		UserPasswordTextBox.sendKeys("Pallavi@123");
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void TestcaseThree() throws InterruptedException {
		WebElement UserVerificationBox = driver.findElement(By.xpath("//input[@id='UserSsecurity']"));
		UserVerificationBox.click();
		UserVerificationBox.sendKeys("UIN5346");
		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void TestCaseFour() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.xpath("//input[@title='login']"));
		loginButton.submit();
		driver.close();
	}
}
