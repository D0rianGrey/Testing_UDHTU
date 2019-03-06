package TestXpath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FindElement {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest(){
        driver.get("https://rozetka.com.ua/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='header-search js-app-search']//input")).sendKeys("apple");
        driver.findElement(By.xpath("//div[@class='header-search js-app-search']//button")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='grid-col-tierce']//a[contains(text(), 'MacBook')]")).click();
        driver.findElement(By.xpath("//div[@name='filter_parameters']//i[contains(text(), 'MacBook Air')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='sort-view-container pos-fix']//a[@class='dropdown-link sort-view-link sprite-side']")).click();


    }

    @After
    public void stop(){
        //driver.quit();
        //driver = null;
    }

}
