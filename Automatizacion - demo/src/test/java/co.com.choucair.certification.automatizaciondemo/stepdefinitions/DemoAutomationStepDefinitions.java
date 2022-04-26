package co.com.choucair.certification.automatizaciondemo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DemoAutomationStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^tania wants to register in demo automation testing$")
    public void taniaWantsToRegisterInDemoAutomationTesting() {
    }

    @When("^she enters the data in the form$")
    public void sheEntersTheDataInTheForm() {
    }

    @Then("^she loads the information in the submit button$")
    public void sheLoadsTheInformationInTheSubmitButton() {
    }
}
