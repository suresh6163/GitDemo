package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class stepDefinitions {

    @Given("^user is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        throw new PendingException();
    }

    @When("^user login into application with username and password  $")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^home page is populated $")
    public void home_page_is_populated() throws Throwable {
        throw new PendingException();
    }

    @And("^Cards are disoplayed$")
    public void cards_are_disoplayed() throws Throwable {
        throw new PendingException();
    }

}