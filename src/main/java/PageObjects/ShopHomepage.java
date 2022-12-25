package PageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopHomepage extends BasePage {

	private WebDriver driver;

	By prodOne = By.linkText("Hummingbird Printed T-Shirt");

	By prodTwo = By.linkText("Hummingbird Printed Sweater");
	By productThree = By.linkText("The Best Is Yet To Come'...");
	By productFour = By.linkText("The Adventure Begins Framed...");
	By productFive = By.linkText("Today Is A Good Day Framed...");
	By productSix = By.linkText("Mug The Best Is Yet To Come");
	By productSeven = By.linkText("Mug The Adventure Begins");
	By productEight = By.linkText("Mug Today Is A Good Day");
	By loginButton = By.xpath("//span[text()='Sign in']");

	public ShopHomepage() throws IOException {
		super();

	}

	public WebElement getProdOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(prodOne);
	}

	public WebElement getProdTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(prodTwo);
	}

	public WebElement getProdThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productThree);
	}

	public WebElement getProdFour() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productFour);
	}

	public WebElement getProdFive() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productFive);
	}

	public WebElement getProdSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productSix);
	}

	public WebElement getProdSeven() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productSeven);
	}

	public WebElement getProdEight() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productEight);
	}
	
	public WebElement getLoginBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginButton);
	}

}
