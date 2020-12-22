package com.sample.test.demo.tests;

import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import com.sample.test.demo.pages.PizzaOrderPage;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;

public class DemoTest extends TestBase {


    PizzaOrderPage pizzaOrderPage ;
    private String name = "testName";
    private String email = "test123@gmail.com";
    private String phone = "1236547896";
    private String successText = "Thank you for your order! TOTAL:";
    private String missingInfoText = "Missing name Missing phone number";

//positive TestCase
    @Test
    public void placeSmallSixToppingPizzaTest(){
        pizzaOrderPage = new PizzaOrderPage(driver);
        double cost = PizzaTypes.SMALL_NOTOPPINGS.getCost();
        Reporter.log("cost:"+cost);
        String pizzaName = PizzaTypes.SMALL_NOTOPPINGS.getDisplayName();
        Reporter.log("pizzaName:"+pizzaName);
        pizzaOrderPage.addNoToppingsPizza(pizzaName+" $"+cost,"1",cost);
        pizzaOrderPage.fillPickUpInformation(name, email, phone);
        pizzaOrderPage.selectCreditCard();
        pizzaOrderPage.PlaceOrder();
        String text = pizzaOrderPage.getDialogText();
        Reporter.log("OrderPlaced:"+text);
        assertThat(text,equalToIgnoringWhiteSpace(successText.concat(" ").concat(Double.toString(cost)).concat(" ").concat(pizzaName)));
    }
//Negative TestCase
    @Test
    public void placeMediumToppingPizzaWithoutPickUpInfo(){
        pizzaOrderPage = new PizzaOrderPage(driver);
        double cost = PizzaTypes.MEDIUM_TWOTOPPINGS.getCost();
        Reporter.log("cost:"+cost);
        String pizzaName = PizzaTypes.MEDIUM_TWOTOPPINGS.getDisplayName();
        Reporter.log("pizzaName:"+pizzaName);
        String toppings1 = PizzaToppings.EXTRACHEESE.getDisplayName();
        Reporter.log("toppings1:"+toppings1);
        String toppings2 = PizzaToppings.MANGOS.getDisplayName();
        Reporter.log("toppings2:"+toppings2);
        pizzaOrderPage.addTwoToppingsPizza(pizzaName+" $"+cost,"1",toppings1,toppings2,cost);
        pizzaOrderPage.selectCashOnPickUp();
        pizzaOrderPage.PlaceOrder();
        String text = pizzaOrderPage.getDialogText();
        Reporter.log("MissingInfoText:"+text);
        assertThat(text,equalToIgnoringWhiteSpace(missingInfoText));

    }

}
