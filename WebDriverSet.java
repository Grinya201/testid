package ru.deliveryClub;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSet {

    public ChromeDriver testdriver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Canine/Desktop/AS/chromedriver.exe");
        testdriver = new ChromeDriver();
    }

    @After
    public void setQuit() {
        testdriver.quit();
    }

}

