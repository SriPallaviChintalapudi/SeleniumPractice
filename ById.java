package codes;
import org.openqa.selenium.By;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class ById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.uber.com/in/en/ride/how-it-works/request-an-uber-ride-without-the-app/");
		driver.manage().window().maximize();
		String str = driver.getTitle();
		System.out.println(str);
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait for the "About" button to be clickable
	    WebElement aboutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'About')]")));
		String aboutButtonText = aboutButton.toString();
		System.out.println(aboutButtonText);
		aboutButton.click();
		
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement aboutusButton =
		 * wait1.until(ExpectedConditions.elementToBeClickable(By.id("bui653val-0")));
		 * String aboutusButtonText = aboutusButton.toString();
		 * System.out.println(aboutusButtonText); aboutusButton.click();
		 */
		
		WebElement LocationButton = driver.findElement(By.id("location-banner-button"));
		String LocationButtonTxt = LocationButton.toString();
		System.out.println(LocationButtonTxt);
		LocationButton.click();
		
		driver.close();
		
	}

}
