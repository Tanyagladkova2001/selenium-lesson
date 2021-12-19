import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
    public class BMICalculator2Test {
        @Test
        public void kgSmNormalTest(){
        /*
        0.1.Открыть браузер
        0.2. Открыть сайт https://healthunify.com/bmicalculator/
        1. Вводим вес 80
        2. Вводим рост 185
        3. Нажимаем кнопку
        4. Проверяем нормальный коэффициент веса
        5. Закрыть браузер
        */
            // 0.1.Открыть браузер
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            //0.2. Открыть сайт https://healthunify.com/bmicalculator/
            driver.get("https://healthunify.com/bmicalculator/");
            // 1. Вводим вес 80
            WebElement weightTextField = driver.findElement(By.name("wg"));
            weightTextField.sendKeys("80");
            // 2. Вводим рост 185
            driver.findElement(By.name("ht")).sendKeys("185");
            //3. Нажимаем кнопку
            driver.findElement(By.name("cc")).click();
            //4. Проверяем нормальный коэффициент веса
            String actualBMIStatus= driver.findElement(By.name("desc")).getAttribute("value");
            Assert.assertEquals(actualBMIStatus,"Your category is Normal");
            driver.close();
        }
        @Test
        public void kgSmStarvationTest(){
            // 0.1.Открыть браузер
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            //0.2. Открыть сайт https://healthunify.com/bmicalculator/
            driver.get("https://healthunify.com/bmicalculator/");
            // 1. Вводим вес 80
            WebElement weightTextField = driver.findElement(By.name("wg"));
            weightTextField.sendKeys("50");
            // 2. Вводим рост 185
            driver.findElement(By.name("ht")).sendKeys("185");
            //3. Нажимаем кнопку
            driver.findElement(By.name("cc")).click();
            //4. Проверяем нормальный коэффициент веса
            String actualBMIStatus = driver.findElement(By.name("desc")).getAttribute("value");
            Assert.assertEquals(actualBMIStatus, "Your category is Starvation");

            driver.close();
        }
        @Test
        public void bodyMassIndex (){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://healthunify.com/bmicalculator/");

            driver.findElement(By.name("wg")).sendKeys("73");

            driver.findElement(By.name("ht")).sendKeys("176");

            driver.findElement(By.name("cc")).click();

            String actualBMIResult = driver.findElement(By.name("si")).getAttribute("value");
            Assert.assertEquals(actualBMIResult, "23.57");

            driver.close();
        }

        @Test
        public void kgSmObese (){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://healthunify.com/bmicalculator/");

            driver.findElement(By.name("wg")).sendKeys("150");

            driver.findElement(By.name("ht")).sendKeys("176");

            driver.findElement(By.name("cc")).click();

            String actualBMIResult = driver.findElement(By.name("us")).getAttribute("value");
            Assert.assertEquals(actualBMIResult, "49.24");

            String actualBMIStatus = driver.findElement(By.name("desc")).getAttribute("value");
            Assert.assertEquals(actualBMIStatus, "Your category is Obese");

            driver.close();
        }
    }


