package codes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;

import org.apache.commons.io.FileUtils;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class ById {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		String str = driver.getTitle();
		System.out.println(str);
		WebElement journeyQuotalist = driver.findElement(By.id("journeyQuota"));
		Select selectoptions = new Select(journeyQuotalist);
		selectoptions.selectByIndex(0);
		selectoptions.selectByValue("EmtLadeise");
		selectoptions.selectByVisibleText("LADIES");
		/*WebElement studentRadionbtn = driver.findElement(By.id("chkStudent"));
		studentRadionbtn.click();
		Thread.sleep(3000);
		WebElement seniorRadionbtn = driver.findElement(By.id("chkSeniorCitizen"));
		seniorRadionbtn.click();
		if(studentRadionbtn.isSelected())
		{
			System.out.println("The student radio button is selected");
		}
		else
		{
			String studentTxt = studentRadionbtn.getAttribute("value");
			System.out.println("The student radion button is unselected and Text is :" + studentTxt);
		}
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //
		 * Wait for the "About" button to be clickable WebElement aboutButton =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//button[contains(text(), 'About')]"))); String aboutButtonText =
		 * aboutButton.toString(); System.out.println(aboutButtonText);
		 * aboutButton.click();
		 */

		/*
		 * WebElement LocationButton =
		 * driver.findElement(By.id("location-banner-button")); String LocationButtonTxt
		 * = LocationButton.toString(); System.out.println(LocationButtonTxt);
		 * LocationButton.click(); driver.navigate().back(); WebElement rideLnk =
		 * driver.findElement(By.className("css-ekbqzf"));
		 * System.out.println(rideLnk.toString()); rideLnk.submit();
		 
		WebElement pricesLink = driver.findElement(By.linkText("See prices"));
		// System.out.println(pricesLink.getText());
		pricesLink.click();
		WebElement phTextbox = driver.findElement(By.id("PHONE_NUMBER_or_EMAIL_ADDRESS"));
		phTextbox.sendKeys("12345");
		
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/uberscreenshot.png");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Taken Screenshot of Uber see prices page");
		// driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		System.out.println("Application backward to uber.com");
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		System.out.println("Application forwarded see prices page");
		
		byte[] byteFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		File destFile2 = new File("./Screenshots/uberscreenshot2.bmp");
		FileOutputStream fos = new FileOutputStream(destFile2);
		fos.write(byteFile);
		System.out.println("Taken 2nd Screenshort of see prices successfully");

		Thread.sleep(3000);
		driver.navigate().to("https://www.rapido.bike/Home");
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement searchBoxtxt = driver.findElement(By.name("q"));
		if(searchBoxtxt.isDisplayed())
		{
			if(searchBoxtxt.isEnabled())
			{
				searchBoxtxt.sendKeys("12345");
				Thread.sleep(5000);
			}
			else
			{
				System.out.println("The search box is not enabled");
			}
		}
		else
		{
			System.out.println("The Search is not displayed");
		}
		searchBoxtxt.clear();
		searchBoxtxt.sendKeys("67890");
		String displayedTxt = searchBoxtxt.getAttribute("value");
		System.out.println("The Seachbox displayed text is : " + displayedTxt);
		WebElement brandChkbox = driver.findElement(By.className("_6i1qKy"));
		brandChkbox.click();
		if(brandChkbox.isSelected())
		{
			System.out.println("The CheckBox Assured is being Selected");
		}
		else
		{
			System.out.println("The CheckBox Assured is not selected ");
		}
		Thread.sleep(3000);
		brandChkbox.click();*/
		//listbox 
		
		//alert
//		driver.switchTo().alert().accept();
//		//conformation alert
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().getText();
//		//promptalert
//		driver.switchTo().alert().sendKeys(str);
		
		//browser commands
		//get(url);
		//getTitle()
		
		//combolist
		
		
		//forms
		//xpath=//div[@id='logo']
		
		
		//Frames
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}
