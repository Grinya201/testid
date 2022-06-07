package ru.deliveryClub;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class FirstTest extends WebDriverSet {



    @Test
    public void firstTest1() {
        testdriver.get("https://www.delivery-club.ru/");
        String title = testdriver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        testdriver.findElement(By.className("header-login-button")).click();
        testdriver.findElement(By.className("login-popup__legal-notes")).click();
    }

    @Test
    public void firstTest2() {
        testdriver.get("https://raftds.ru/");
        String title = testdriver.getTitle();
        Assert.assertFalse(title.equals("RAAAAAAAAAAAAAAAAAAAAAFT"));
        testdriver.findElement(By.cssSelector(".MuiGrid-root .MuiList-root li button")).click();
    }

}


