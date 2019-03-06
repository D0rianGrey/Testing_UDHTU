package UDHTU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By emailField = By.xpath("//input[@id='user_login']");
    By passwordField = By.xpath("//input[@id='user_pass']");
    By rememberMeCheckBox = By.xpath("//input[@name='rememberme']");
    By LogInButton = By.xpath("//input[@name='wp-submit']");
    By errorLogin = By.xpath("//div[@id='login_error']");
    By errorPassword = By.xpath("//div[@id='login_error']");
    WebElement error = driver.findElement(By.xpath("//div[@id='login_error']"));



    public LoginPage typeEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public LoginPage typePassworField (String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage setCheckBox (boolean value){
        WebElement checkbox = driver.findElement((rememberMeCheckBox));
        if (!checkbox.isSelected()){
            checkbox.click();
        }
        return this;

    }

    public void clickLogInButton(){
        driver.findElement(LogInButton).click();
    }

}
