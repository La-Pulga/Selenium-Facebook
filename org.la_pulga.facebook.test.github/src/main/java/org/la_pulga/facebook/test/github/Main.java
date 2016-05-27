package org.la_pulga.facebook.test.github;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		FacebookContainer container = PageFactory.initElements(driver, FacebookContainer.class);
		
		WebDriverWait loadFacebook = new WebDriverWait(driver, 30);
		loadFacebook.until(ExpectedConditions.visibilityOf(container.email));
		
		container.email.sendKeys("email address");
		
		container.password.sendKeys("your password");
		
		WebElement findbutton = container.login.findElement(By.tagName("input"));
		
		findbutton.sendKeys(Keys.ENTER);
		
		WebDriverWait homepage = new WebDriverWait(driver, 30);
		homepage.until(ExpectedConditions.visibilityOf(container.searchbar));
		
		container.searchbar.sendKeys("Friend's name");
		
		container.friendSelector.click();
		
		WebDriverWait phHomepage = new WebDriverWait(driver, 30);
		phHomepage.until(ExpectedConditions.visibilityOf(container.cover));
		
		WebElement messagebutton = container.message.findElement(By.id("u_jsonp_3_5"));
		
		messagebutton.click();
		
		WebDriverWait message = new WebDriverWait(driver, 30);
		message.until(ExpectedConditions.visibilityOf(container.cover));
		
		container.textArea.sendKeys("Hello Selenium World");
		
		container.textArea.sendKeys(Keys.ENTER);
		
		

	}

}
