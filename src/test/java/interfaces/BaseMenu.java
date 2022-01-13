package interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseMenu {
    @Test
    public void baseMenu(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");


    }
}
