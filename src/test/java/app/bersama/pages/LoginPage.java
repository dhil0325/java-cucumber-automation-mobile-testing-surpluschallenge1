package app.bersama.pages;

import app.bersama.DriverManager;
import app.bersama.Keyword;
import app.bersama.enums.Direction;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author regiewby on 16/12/22
 * @project java-cucumber-mobile
 */
public class LoginPage {

    private AppiumDriver driver;

    public LoginPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.loginmodule.learning:id/textInputEditTextEmail")
    private WebElement emailField;

    @FindBy(id = "com.loginmodule.learning:id/textInputEditTextPassword")
    private WebElement passwordField;

    @FindBy(id = "com.loginmodule.learning:id/appCompatButtonLogin")
    private WebElement loginButton;


    @FindBy(id = "com.loginmodule.learning:id/textViewLinkRegister")
    private WebElement navLinkRegister;

    @FindBy(id = "com.loginmodule.learning:id/snackbar_text")
    private WebElement errorSnackBar;

    public void Login(String email, String password) {

        Keyword.enterText(emailField, email);
        passwordField.click();
        Keyword.enterText(passwordField, password);
        driver.navigate().back();
        loginButton.click();
    }

    public void navigateToRegister(){
        navLinkRegister.click();
    }

    public void toastErrorVisible(String expectedMessage){
        WebDriverWait wait = new WebDriverWait(driver, 3);
//        wait.until(ExpectedConditions.presenceOfElementLocated('.//*[contains(@text,'Wrong Email or Password')])');
        Keyword.waitUntilElementIsVisible(errorSnackBar);
        String actual =errorSnackBar.getText();
        Assert.assertEquals(actual, expectedMessage);



  }
}
