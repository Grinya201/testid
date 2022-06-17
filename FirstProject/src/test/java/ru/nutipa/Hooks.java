package ru.nutipa;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;



public class Hooks {

    public static ChromeDriver chromeDriver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Canine/Desktop/AS/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }

    //@After
    public void setQuit() {

        chromeDriver.quit();
    }

}

