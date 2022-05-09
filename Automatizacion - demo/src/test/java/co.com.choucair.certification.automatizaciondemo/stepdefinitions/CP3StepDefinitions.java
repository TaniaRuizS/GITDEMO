package co.com.choucair.certification.automatizaciondemo.stepdefinitions;

import co.com.choucair.certification.automatizaciondemo.model.DemoRegisterBD;
import co.com.choucair.certification.automatizaciondemo.questions.AnswerInvalid;
import co.com.choucair.certification.automatizaciondemo.tasks.InvalidFields;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CP3StepDefinitions {
    @When("^She enters invalid data in the form$")
    public void sheEntersInvalidDataInTheForm(List<DemoRegisterBD> demoRegisterBD) {
        OnStage.theActorInTheSpotlight().attemptsTo(InvalidFields.the(demoRegisterBD.get(0)));

    }


    @Then("^She enters the invalid data in all the fields$")
    public void sheEntersTheInvalidDataInAllTheFields(List<DemoRegisterBD> demoRegisterBD) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerInvalid.fields(demoRegisterBD.get(0))));
    }


}
