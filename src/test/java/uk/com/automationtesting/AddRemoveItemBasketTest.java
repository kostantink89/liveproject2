package uk.com.automationtesting;

import PageObjects.*;
import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks {

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}

	@Test
	public void addRemoveItem() throws IOException {

		ExtentManager.log("Starting AddRemoveItemBasket...");

		HomePage home = new HomePage();
		home.getTestStoreLink().click();

		ShopHomepage shopHome = new ShopHomepage();
		ExtentManager.pass("Reached the shop homepage");
		shopHome.getProdOne().click();

		ShopProductPage shopProd = new ShopProductPage();
		ExtentManager.pass("Reached the shop product page");
		Select option = new Select(shopProd.getSizeOption());
		option.selectByVisibleText("M");
		ExtentManager.pass("Have succesfully selected product size");
		shopProd.getQuantityIncrease().click();
		ExtentManager.pass("Have succesfully increased quantity");
		shopProd.getAddToCartBtn().click();
		ExtentManager.pass("Added product to basket");

		ShopContentPanel cPanel = new ShopContentPanel();
		cPanel.getContinueShoppingBtn().click();
		shopProd.getHomepageLink().click();
		shopHome.getProdTwo().click();
		shopProd.getAddToCartBtn().click();
		cPanel.getCheckOutBtn().click();

		ShoppingCart cart = new ShoppingCart();
		cart.getDeleteItemTwo().click();

		waitForElementInvisible(cart.getDeleteItemTwo(), Duration.ofSeconds(15));

		System.out.println(cart.getTotalAmount().getText());

		try {
			Assert.assertEquals(cart.getTotalAmount().getText(), "$45.21");
			ExtentManager.pass("Total amount matches expected amount");
		} catch (AssertionError e) {
			Assert.fail("Cart amount did not match expected amount,it found " + cart.getTotalAmount().getText()
					+ "expected $45.23");
			ExtentManager.fail("The total amount did not match the expected amount");

		}
	}
}
