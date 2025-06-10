package maven;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;

public class HDFC {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void BeforeTest() throws InterruptedException {
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Welcome to HDFC Bank NetBanking";
		Assert.assertEquals(actualTitle,expectedTitle,"This doesn't match the actual title");
		System.out.println("Matched");
		SoftAssert softAssertobj = new SoftAssert(); 
		softAssertobj.assertNotEquals(actualTitle, expectedTitle,"This is matched");
//		System.out.println("MisMatched");
		
		boolean theActualTitle = driver.getTitle().equalsIgnoreCase("Welcome to HDFC Bank NetBanking");
		
		Assert.assertTrue(theActualTitle, "The actual title is matching");
		
		
		
		Thread.sleep(3000);
	}
	@Test(priority=-1)
	public void TestCase() throws InterruptedException {
		driver.switchTo().frame("login_page");
		WebElement ContinueBtn1 = driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']"));
		ContinueBtn1.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void FirstTestCase() throws InterruptedException {
		//driver.switchTo().frame("login_page");
		WebElement UserIdTextBox = driver.findElement(By.name("fldLoginUserId"));
		//UserIdTextBox.click();
		UserIdTextBox.sendKeys("Mahesh");
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void secondTestCase() throws InterruptedException {
		WebElement ContinueBtn = driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']"));
		ContinueBtn.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void ThirdTestCase() throws InterruptedException {
		Thread.sleep(5000);
		WebElement PassowrdTextBox = driver.findElement(By.xpath("//input[@id='password']"));
		PassowrdTextBox.click();
		PassowrdTextBox.sendKeys("SDFGfghjk");
		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void FourthCaase() throws InterruptedException {
		WebElement LoginBtn  = driver.findElement(By.id("kc-login"));
		LoginBtn.submit();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void FifthCase() throws InterruptedException {
		WebElement PassowrdTextBox2 = driver.findElement(By.xpath("//input[@id='password']"));
		//PassowrdTextBox2.click();
		PassowrdTextBox2.sendKeys("HIIII");
		Thread.sleep(2000);
	}
	
	@Test(priority = 6)
	public void SixthCase() throws InterruptedException {		
		WebElement CaptchaTextBox = driver.findElement(By.id("input-captcha"));
		CaptchaTextBox.click();
		CaptchaTextBox.sendKeys("45678yh");
		Thread.sleep(5000);
	}
	
	@Test(priority = 7)
	public void SeventhCase() throws InterruptedException {
		Thread.sleep(5000);
		WebElement LoginBtn2 = driver.findElement(By.name("login"));
		LoginBtn2.click();
		Thread.sleep(5000);
	}
	
//	@Test(priority = 8)
//	public void EightCase() throws InterruptedException {
//		driver.switchTo().activeElement();
//		Thread.sleep(2000);
//		WebElement cancelbtn = driver.findElement(By.linkText("Close"));
//		cancelbtn.click();
//		Thread.sleep(5000);
//	}
	
	@Test(priority = 9)
	public void NinthCase() throws InterruptedException {
		Thread.sleep(2000);
		WebElement RegisterLink = driver.findElement(By.linkText("Register Now"));
		RegisterLink.click();
		Thread.sleep(5000);
	}
	
//	@Test(priority = 10)
//	public void EightCase() throws InterruptedException {
//		driver.switchTo().activeElement();
//		Thread.sleep(2000);
//		WebElement cancelbtn = driver.findElement(By.id("close-btn"));
//		cancelbtn.click();
//		Thread.sleep(5000);
//	}
	
	@AfterTest
	public void AfterTest() {
		driver.close();
	}
}


