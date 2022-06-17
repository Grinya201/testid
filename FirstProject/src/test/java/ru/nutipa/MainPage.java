 package ru.nutipa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static ru.nutipa.Hooks.chromeDriver;

public class MainPage {

    static WebElement Entrance = chromeDriver.findElement(By.className("header-login-button"));
    static WebElement TransData = chromeDriver.findElement(By.className("login-popup__legal-notes"));


}
