# Selenium-Facebook
This Selenium test template was built to log in to Facebook, search a specific friend and send him a private message through the chatbox. 

# Features

- Enters personal email and password
- Searches specific friend with search bar
- Chooses wanted friend from the drop-down options directly on the search bar

# What you need to change

Email and password -> Main.java
```
container.email.sendKeys("email address");
		
container.password.sendKeys("your password");
```

Type friend's name on searchbar -> Main.java
```
container.searchbar.sendKeys("Friend's name");
```

Verify the XPATH corresponds to your friend when the drop down options appear -> FacebookContainer.java
```
@FindBy(xpath = "//span[@class = \"fragmentEnt\"]")
	public WebElement friendSelector;
```