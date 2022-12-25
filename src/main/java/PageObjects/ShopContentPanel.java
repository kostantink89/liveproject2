package PageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopContentPanel extends BasePage {

    private WebDriver driver;

    By continueShoppingBtn = By.cssSelector(".btn.btn-secondary");
    By checkOutBtn = By.linkText("\uE876PROCEED TO CHECKOUT");

    public ShopContentPanel() throws IOException {
        super();

    }

    public WebElement getContinueShoppingBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(continueShoppingBtn);
    }

    public WebElement getCheckOutBtn() throws IOException {
        this.driver = getDriver();
        return driver.findElement(checkOutBtn);
    }
}
