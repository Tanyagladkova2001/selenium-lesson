package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Dropdown extends BaseMenu {

    @Test
    public void DropDown() {
        baseMenu();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        assertFalse(select.getAllSelectedOptions().isEmpty());
        select.selectByVisibleText("Option 1");
        assertTrue(select.getAllSelectedOptions().get(0).isSelected());
        assertEquals(select.getFirstSelectedOption().getText(), "Option 1", "the first is checked");

        assertFalse(select.getAllSelectedOptions().isEmpty());
        select.selectByVisibleText("Option 2");
        assertTrue(select.getAllSelectedOptions().get(0).isSelected());
        assertEquals(select.getFirstSelectedOption().getText(), "Option 2", "the second is checked");


        driver.close();


    }

}