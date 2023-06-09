package app.bersama.steps;

import app.bersama.DriverManager;
import app.bersama.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CommonStep {


    @When("user login with {string}")
    public void userLoginWith(String credentialType) {
        String email = "";
        String password = "";
        switch (credentialType) {
            case "valid_credential1":
                email = "test23@gmail.com";
                password = "getRandomPassword";
                break;

            case "unregistered_credential1":
                email = "frozt.fadhil@gmail.com";
                password = "fadhil45";
                break;

            case "valid_credential3":
                email = "fadhil2309@gmail.com";
                password = "fadhil45";
                break;

            case "invalid_credential":
                email = "lageming54@gmail.com";
                password = "asdasdsadsa";
                break;
        }
        LoginPage loginPage = new LoginPage(
                DriverManager.getInstance().getDriver());
        loginPage.Login(email, password);
    }

    @Given("user navigate to login page")
    public void userNavigateToLoginPage() {
        System.out.println("this is login page");
    }

    @Then("user should be directed to profilepage")
    public void userShouldBeDirectedToProfilepage() {
        System.out.println("this is profile page");
    }


    @Then("user should see error message {}")
    public void userShouldSeeErrorMessage(String value) {
    new LoginPage(DriverManager.getInstance().getDriver()).toastErrorVisible(value);
    }
}

