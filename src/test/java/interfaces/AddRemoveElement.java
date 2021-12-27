package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveElement  extends BaseMenu{

    @Test
    public void AddRemoveElements() {
        baseMenu();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.className("added-manually")).click();
        int check = driver.findElements(By.className("added-manually")).size();
        assertEquals(check, 1, "wrong amount of elements");

        driver.close();


    }




}
