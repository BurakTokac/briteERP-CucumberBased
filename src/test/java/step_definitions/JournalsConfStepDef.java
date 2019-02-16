package step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.configuration_accounting.BankAccounts;
import pages.configuration_accounting.Journals;

public class JournalsConfStepDef {
    Journals journals = new Journals();
    BankAccounts bankAccounts = new BankAccounts();

    @Given("user clicks on Configuration=>Accounting Link from left menu")
    public void user_clicks_on_Configuration_Accounting_Link_from_left_menu() {
    journals.accountingLink.click();
    }

    @Then("user clicks on Journals Link from left menu")
    public void user_clicks_on_Journals_Link_from_left_menu() {
       journals.journalsLink.click();
    }

    @Then("user clicks on Create button")
    public void user_clicks_on_Create_button() {
       bankAccounts.createBtn.click();
    }

    @Then("user see Journals -{string} creation page")
    public void user_see_Journals_creation_page(String string) {
    Assert.assertEquals(journals.creationNewPageText.getText(),"New");
    }

    @Then("user fills out required information {string}")
    public void user_fills_out_required_information(String string) {

    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user should see and verifies details that entered")
    public void user_should_see_and_verifies_details_that_entered() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user open a tax that has {string}")
    public void user_open_a_tax_that_has(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks on Action button")
    public void user_clicks_on_Action_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks Delete option")
    public void user_clicks_Delete_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks to Ok button")
    public void user_clicks_to_Ok_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user doesn't see deleted Journal on main page")
    public void user_doesn_t_see_deleted_Journal_on_main_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}
