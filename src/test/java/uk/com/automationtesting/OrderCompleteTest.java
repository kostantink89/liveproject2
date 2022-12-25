package uk.com.automationtesting;

import PageObjects.*;
import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {


    public OrderCompleteTest() throws IOException {
    }

    @Test
    public void endToEndTest() throws InterruptedException, IOException {
    	
    	ExtentManager.log("Starting OrderCompleteTest...");
    	
        HomePage home = new HomePage();
        home.getTestStoreLink().click();
        ExtentManager.pass("Have succesfully reached store homepage");
        

        ShopHomepage shopHome = new ShopHomepage();
        shopHome.getProdOne().click();
        ExtentManager.pass("Have succesfully clicked on product");

        ShopProductPage shopProd = new ShopProductPage();
        ExtentManager.pass("Have reached product page");
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        ExtentManager.pass("Have succesfully changed product size");
        shopProd.getQuantityIncrease().click();
        ExtentManager.pass("Have increased product quantity");
        shopProd.getAddToCartBtn().click();
        ExtentManager.pass("Have added product to the cart");

        Thread.sleep(3000);

        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getCheckOutBtn().click();

        ShoppingCart cart = new ShoppingCart();
        ExtentManager.pass("Have succesfully reached cart page");
        cart.getHavePromo().click();
        cart.getPromoTextbox().sendKeys("20OFF");
        ExtentManager.pass("Have selected the promo button");
        cart.getPromoAddBtn().click();
        Thread.sleep(3000);
        cart.getProceedCheckoutBtn().click();
        ExtentManager.pass("Have succesfully selected the check out button");

        OrderFormPersInfo pInfo = new OrderFormPersInfo();
        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys("John");
        pInfo.getLastnameField().sendKeys("Smith");
        pInfo.getEmailField().sendKeys("johnsmith2@test.com");
        pInfo.getTermsConditionsCheckbox().click();
        Thread.sleep(3000);
        pInfo.getContinueBtn().click();
        ExtentManager.pass("Have succesfully entered customer details");

        OrderFormDelivery orderDelivery = new OrderFormDelivery();
        orderDelivery.getAddressField().sendKeys("123 Main Street");
        orderDelivery.getCityField().sendKeys("Houston");
        Select state = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDelivery.getPostcodeField().sendKeys("77021");
        Thread.sleep(3000);
        orderDelivery.getContinueBtn().click();
        ExtentManager.pass("Have entered delivery info");

        OrderFormShippingMethod shipMethod = new OrderFormShippingMethod();
        shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in,please leave my delivery at porch.");
        shipMethod.getContinueBtn().click();
        ExtentManager.pass("Have succesfully selected the shipping method");

        OrderFormPayment orderPay = new OrderFormPayment();
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        orderPay.getOrderBtn().click();
        Thread.sleep(3000);
        ExtentManager.pass("Have succesfully placed order");

    }
}
