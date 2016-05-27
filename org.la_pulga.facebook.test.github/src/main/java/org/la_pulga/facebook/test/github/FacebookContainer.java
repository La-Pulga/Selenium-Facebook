package org.la_pulga.facebook.test.github;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookContainer {
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "pass")
	public WebElement password; 
	
	@FindBy(id = "loginbutton")
	public WebElement login;
	
	@FindBy(css = "._586i")
	public WebElement searchbar;
	
	@FindBy(xpath = "//span[@class = \"fragmentEnt\"]")
	public WebElement friendSelector;
	
	@FindBy(id = "fbCoverImageContainer")
	public WebElement cover;
	
	@FindBy(css = "#pagelet_timeline_profile_actions")
	public WebElement message;
	
	@FindBy(xpath = "//div[contains (@role, \"textbox\")]")
	public WebElement textArea;

}
