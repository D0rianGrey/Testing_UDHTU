import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    UDHTU.LoginPage page;


    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://udhtu.edu.ua/wp-login.php");
    }

    @Test

    public void typeInvalidYear(){

    }


    @After
    public void tearDown(){
        driver.quit();
    }
}

