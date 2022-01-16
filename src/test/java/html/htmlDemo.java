package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class htmlDemo {
    @Test
    public void cosmeticsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/tatanagladkova/IdeaProjects/selenium-lesson/src/test/java/html/practiceHTML.html");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/input"));
        driver.findElement(By.className("table"));
        driver.findElement(By.id("colors of lipstick"));
        driver.findElement(By.xpath("/html/body/div/div[5]/a"));


        driver.close();
        driver.quit();


    }
}

