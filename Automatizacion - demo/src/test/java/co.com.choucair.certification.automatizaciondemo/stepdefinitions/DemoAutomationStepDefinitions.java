package co.com.choucair.certification.automatizaciondemo.stepdefinitions;

import co.com.choucair.certification.automatizaciondemo.questions.Answer;
import co.com.choucair.certification.automatizaciondemo.tasks.OpenUp;
//import co.com.choucair.certification.automatizaciondemo.tasks.Register;
import co.com.choucair.certification.automatizaciondemo.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DemoAutomationStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^tania wants to register in demo automation testing$")
    public void taniaWantsToRegisterInDemoAutomationTesting() {
        OnStage.theActorCalled("Tania Ruiz Sanchez").wasAbleTo(OpenUp.thePage());
    }

    @When("^she enters (.*) in the form$")
    public void sheEntersTheDataInTheForm(String data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(data));
    }

    @Then("^she loads the information in (.*)$")
    public void sheLoadsTheInformationInTheSubmitButton(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
