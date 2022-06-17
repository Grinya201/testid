package ru.nutipa;

import com.sun.beans.decoder.StringElementHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import static ru.nutipa.Hooks.chromeDriver;
import static ru.nutipa.MainPage.*;

public class Steps  {

    @Given("Users open page {string}")
    public void users_open_page(String url) {
        chromeDriver.get(url);
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
    }

    @When("Users clicks on a button {string}")
    public void users_clicks_on_a_button(String string) {
        MainPage.Entrance.click();


        }


    @And("Users clicks on {string}")
    public void users_clicks_on(String string){
          MainPage.TransData.click();
            }


    @Then("A popup opens with information about the transmitted data")
    public void a_popup_opens_with_information_about_the_transmitted_data() {
    }

}


