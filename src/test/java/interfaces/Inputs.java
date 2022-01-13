package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Inputs extends BaseMenu{
    @Test
    public void Input (){
        baseMenu();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("10");
        input.sendKeys(Keys.ARROW_DOWN);
        assertEquals(input.getAttribute("value"), 9, "неверное значение уменьшения");
        input.sendKeys(Keys.COMMAND + "x");
        input.sendKeys("20");
        input.sendKeys(Keys.ARROW_UP);
        assertEquals(input.getAttribute("value"), 21, "неверное значение увеличения");

        driver.close();
        
    }
}
