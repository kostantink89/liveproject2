package uk.com.automationtesting;

import PageObjects.*;
import base.BasePage;
import base.ExtentManager;
import base.Hooks;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

@Listeners(resources.Listeners.class)

public class ShopLoginTest extends Hooks {

	public ShopLoginTest() throws IOException {
		super();
	}

	@Test
	public void addRemoveItem() throws IOException {

		ExtentManager.log("Starting AddRemoveItemBasket...");

		HomePage home = new HomePage();
		home.getTestStoreLink().click();

		ShopHomepage shopHome = new ShopHomepage();
		shopHome.getLoginBtn().click();

		FileInputStream workbookLocation = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\credentials.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Row row1 = sheet.getRow(1);
		Cell cellR1C0 = row1.getCell(0);
		Cell cellR1C1 = row1.getCell(1);

		String emailRow1 = cellR1C0.toString();
		String passwordRow1 = cellR1C1.toString();

		ShoppingLoginPage shop = new ShoppingLoginPage();
		shop.getEmail().sendKeys(emailRow1);
		shop.getPassword().sendKeys(passwordRow1);
		shop.getSubmitBtn().click();

		ShopYourAccount yourAcc = new ShopYourAccount();

		try {
			yourAcc.getSignOut().click();
			ExtentManager.pass("user HAS signed in");
		} catch (Exception e) {
			ExtentManager.fail("user could not sign in");
			Assert.fail();
		}

		yourAcc.getSignOut().click();

		Row row2 = sheet.getRow(1);
		Cell cellR2C0 = row2.getCell(0);
		Cell cellR2C1 = row2.getCell(1);

		String emailRow2 = cellR2C0.toString();
		String passwordRow2 = cellR2C1.toString();

		shop.getEmail().sendKeys(emailRow2);
		shop.getPassword().sendKeys(passwordRow2);
		shop.getSubmitBtn().click();
		
		
		

	}
}
