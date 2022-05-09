package co.com.choucair.certification.automatizaciondemo.stepdefinitions;

import co.com.choucair.certification.automatizaciondemo.model.DemoRegisterBD;
import co.com.choucair.certification.automatizaciondemo.questions.AnswerRequired;
import co.com.choucair.certification.automatizaciondemo.tasks.RequiredFields;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CP2StepDefinitions {


    @When("^She enters the data in the required fields$")
    public void sheEntersTheDataInTheRequiredFields(List<DemoRegisterBD> demoRegisterBD) {
        OnStage.theActorInTheSpotlight().attemptsTo(RequiredFields.the(demoRegisterBD.get(0)));
    }


    @Then("^All required fields must be select and completed$")
    public void allRequiredFieldsMustBeSelectAndCompleted(List<DemoRegisterBD> demoRegisterBD) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRequired.fields(demoRegisterBD.get(0))));
    }
}
