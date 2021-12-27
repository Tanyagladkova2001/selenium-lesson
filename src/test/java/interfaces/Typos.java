package interfaces;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Typos extends BaseMenu {
    @Test
    public void Types() {
        baseMenu();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");
            String type = driver.findElement(By.tagName("p")).getText();
            assertEquals(type, "Sometimes you'll see a typo, other times you won't.",
                    "incorrect writing won,t");
            driver.close();
        }

    }


