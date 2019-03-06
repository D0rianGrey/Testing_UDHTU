package ExampleEugene;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void start(){
        if (tlDriver.get() != null ){
            driver = tlDriver.get();
            wait = new WebDriverWait(driver,10);
            return;
        }
        /*ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        options.addArguments("start-maximized");*/
        driver = new ChromeDriver(); //(option)
        tlDriver.set(driver);
        wait = new WebDriverWait(driver,10);
        Runtime.getRuntime().addShutdownHook(
                new Thread(()-> { driver.quit(); driver =null;}));

    }

    @Test
    public void myFirstTest(){
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Test
    public void mySecondTest() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("automation");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Test
    public void myThirdTest() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("asiaworld.cn.ua");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @After
    public void stop(){
        //driver.quit();
        //driver = null;
    }
}
