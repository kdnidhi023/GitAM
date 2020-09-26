package StepDefination;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinations {

    @Given("^statement to print$")
    public void statement_to_print() throws Throwable {
        throw new PendingException();
    }

    @When("^you have a statement$")
    public void you_have_a_statement() throws Throwable {
        throw new PendingException();
    }

    @Then("^Print it$")
    public void print_it() throws Throwable {
        throw new PendingException();
    }
}
