package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMessages extends BaseMenu{
    @Test
    public void NotificationMessage() {
        baseMenu();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/a"));
        element.click();
        String warning = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        assertEquals(warning, "Action unsuccesful, please try again");
        driver.close();
    }
}
