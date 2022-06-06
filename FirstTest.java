package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSet {



    @Test
    public void firstTest1() {
        testdriver.get("https://www.delivery-club.ru/");

        String title = testdriver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
    }

    @Test
    public void firstTest2() {
        testdriver.get("https://raftds.ru/");

        String title = testdriver.getTitle();
        Assert.assertFalse(title.equals("RAAAAAAAAAAAAAAAAAAAAAFT"));
    }


}
