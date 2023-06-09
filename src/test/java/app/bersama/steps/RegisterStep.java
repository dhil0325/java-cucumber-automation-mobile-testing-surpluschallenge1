package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.LoginPage;
import app.bersama.pages.RegisterPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Random;

public class RegisterStep {

    @Given("user navigate to register page")
    public void userNavigateToRegisterPage() {
        LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());
        loginPage.navigateToRegister();
    }

    @When("user fill out register form and tap register {string}")
    public void userFillOutRegisterFormAndTapRegister(String registerType) {

        String nama = "";
        String email = "";
        String password = "";
        String conpassword = "";

        switch (registerType) {
            case "register1" :
                nama = "Test Account";
                email = "test23@gmail.com";
                password = "getRandomPassword";
                conpassword = password;
        }

        RegisterPage registerPage = new RegisterPage(DriverManager.getInstance().getDriver());
        registerPage.userRegister(nama, email, password, conpassword);

    }

    @Then("user should be navigate to profile page")
    public void userShouldBeNavigateToProfilePage() {
    }
}
