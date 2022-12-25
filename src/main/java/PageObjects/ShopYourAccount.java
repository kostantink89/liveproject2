package PageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopYourAccount extends BasePage {

	private WebDriver driver;

	By heading = By.xpath("//h1");
	By signOut = By.xpath("//a[contains(@class,'logout hidden-sm-down')]");
	

	public ShopYourAccount() throws IOException {
		super();
	}

	public WebElement getHeading() throws IOException {
		this.driver = getDriver();
		return driver.findElement(heading);
	}
	
	public WebElement getSignOut() throws IOException {
		this.driver = getDriver();
		return driver.findElement(signOut);
	}

	}


