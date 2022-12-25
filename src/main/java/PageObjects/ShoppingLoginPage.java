package PageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShoppingLoginPage extends BasePage {

	private WebDriver driver;

	By email = By.xpath("//div[contains(@class,'col-md-6')]/input");
	By password = By.xpath("//input[@type='password']");
	By submitBtn = By.id("submit-login");

	public ShoppingLoginPage() throws IOException {
		super();
	}

	public WebElement getEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(email);
	}

	public WebElement getPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(password);
	}

	public WebElement getSubmitBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(submitBtn);
	}

}
