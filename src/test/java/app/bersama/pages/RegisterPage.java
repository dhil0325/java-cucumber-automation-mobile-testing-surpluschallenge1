package app.bersama.pages;

import app.bersama.Keyword;
import app.bersama.enums.Direction;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegisterPage {
    private AppiumDriver driver;

    public RegisterPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.loginmodule.learning:id/textInputEditTextName")
    private WebElement nameField;

    @FindBy(id = "com.loginmodule.learning:id/textInputEditTextEmail")
    private WebElement emailField;

    @FindBy(id = "com.loginmodule.learning:id/textInputEditTextPassword")
    private WebElement passwordField;

    @FindBy(id = "com.loginmodule.learning:id/textInputEditTextConfirmPassword")
    private WebElement conpasswordField;

    @FindBy(id = "com.loginmodule.learning:id/appCompatButtonRegister")
    private WebElement registerButton;

    public void userRegister(String nama, String email,
                             String password, String conpassword) {
        Keyword.swipe(Direction.DOWN);
        Keyword.enterText(nameField, nama);
        Keyword.enterText(emailField, email);
        Keyword.enterText(passwordField, password);
        Keyword.enterText(conpasswordField, conpassword);
        registerButton.click();
    }
}
