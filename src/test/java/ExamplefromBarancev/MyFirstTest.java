package ExamplefromBarancev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest extends TestBase {

//    @Test
//    public void myFirstTest() {
//        driver.navigate().to("http://www.google.com");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.name("q")).sendKeys("webdriver");
//        driver.findElement(By.name("btnG")).click();
//        wait.until(titleIs("webdriver - Поиск в Google"));
//    }
//
//    @Test
//    public void mySecondTest() {
//        driver.navigate().to("http://www.google.com");
//        wait.until((WebDriver d) -> d.findElement(By.name("q"))).sendKeys("webdriver");
//        driver.findElement(By.name("btnK")).click();
//        wait.until(titleIs("webdriver - Google Search"));
//    }

    @Test
    public void myThirdTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@jsname='VlcLAe']//input[contains(@value, 'Google')]")).click();
        //driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("wedriver");
        //driver.findElement(By.name("//center/input[1]")).click();
        //wait.until(titleIs("webdriver - Поиск в Google"));
    }
}
