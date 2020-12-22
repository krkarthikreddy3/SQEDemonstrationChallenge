package com.sample.test.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class PizzaOrderPage {

    WebDriver driver;
    @FindBy(id = "pizza1Pizza")
    WebElement pizza1;
    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings1']")
    WebElement pizza1Toppings1;
    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings2']")
    WebElement pizza1Toppings2;
    @FindBy(id = "pizza1Qty")
    WebElement pizza1Quantity;
    @FindBy(id = "pizza1Cost")
    WebElement pizza1Cost;
    @FindBy(id = "ccpayment")
    WebElement radioCreditCard;
    @FindBy(id = "cashpayment")
    WebElement radioCash;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "name")
    WebElement name;
    @FindBy(id = "phone")
    WebElement phone;
    @FindBy(id = "placeOrder")
    WebElement placeOrderButton;
    @FindBy(id = "reset")
    WebElement resetButton;
    @FindBy(id = "dialog")
    WebElement dialog;
    @FindBy(xpath = "//div[@id='dialog']/p")
    WebElement dialogText;


    public PizzaOrderPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void enterQuantity(String quantity){
        pizza1Quantity.clear();
        pizza1Quantity.sendKeys(quantity);

    }
    public void selectDropDown(WebElement we, String dropDownText){
         Select dropDown = new Select(we);
         dropDown.selectByVisibleText(dropDownText);

    }

    public void addNoToppingsPizza(String pizzaName , String quantity, double price){

        selectDropDown(pizza1, pizzaName);
        enterQuantity(quantity);
        pizza1Cost.click();
        Reporter.log("price:"+pizza1Cost.getAttribute("value"));
        assertThat(pizza1Cost.getAttribute("value"),equalToIgnoringWhiteSpace(Double.toString(price)));

    }

    public void addTwoToppingsPizza(String pizzaName , String quantity,String topping1, String topping2, double price){
        selectDropDown(pizza1, pizzaName);
        selectDropDown(pizza1Toppings1, topping1);
        selectDropDown(pizza1Toppings2, topping2);
        enterQuantity(quantity);
        pizza1Cost.click();
        Reporter.log("price:"+pizza1Cost.getAttribute("value"));
        assertThat(pizza1Cost.getAttribute("value"),equalToIgnoringWhiteSpace(Double.toString(price)));

    }
   public void fillPickUpInformation(String pickUpName, String pickUpEmail,String pickUpPhone){
        name.sendKeys(pickUpName);
        email.sendKeys(pickUpEmail);
        phone.sendKeys(pickUpPhone);

   }

   public void selectCreditCard(){
       radioCreditCard.click();
   }
    public void selectCashOnPickUp(){
        radioCash.click();
    }

    public void PlaceOrder(){
        placeOrderButton.click();
    }

    public String getDialogText(){

        return dialogText.getText();
    }
}