package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static java.util.List.of;
import static org.testng.Assert.*;

public class CheckBoxes extends BaseMenu{

    @Test
    public void checkBoxes (){
         baseMenu();
         WebDriver driver = new ChromeDriver();
         driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes = Collections.singletonList(driver.findElement(By.cssSelector("[type=checkbox]")));{
        assertFalse(checkBoxes.get(0).isSelected(), "unchecked");
        checkBoxes.get(0).click();
        assertTrue(checkBoxes.get(0).isSelected(), "checked"); // working
        assertFalse(checkBoxes.get(1).isSelected(), "unchecked 2"); //out of bounds exception "get(1)"
        checkBoxes.get(1).click();
        assertFalse(checkBoxes.get(1).isSelected(), "checked 2");


        driver.close();


}

    }
}
