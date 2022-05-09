package co.com.choucair.certification.automatizaciondemo.tasks;

import co.com.choucair.certification.automatizaciondemo.model.DemoRegisterBD;
import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import co.com.choucair.certification.automatizaciondemo.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RequiredFields implements Task {
    private DemoRegisterBD demoRegisterBD;
    private Utilities utilities;

    public RequiredFields(DemoRegisterBD demoRegisterBD){
        this.demoRegisterBD = demoRegisterBD;
        utilities = new Utilities(demoRegisterBD);
    }


    public static Performable the(DemoRegisterBD demoRegisterBD) {
        return Tasks.instrumented(RequiredFields.class, demoRegisterBD);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue(demoRegisterBD.getFirstname()).into(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue(demoRegisterBD.getLastname()).into(RegisterData.INPUT_LASTNAME),
                Enter.theValue(demoRegisterBD.getEmail()).into(RegisterData.INPUT_EMAIL),
                Enter.theValue(demoRegisterBD.getPhone()).into(RegisterData.INPUT_PHONE));
        utilities.selecctgender(actor);
        utilities.selectCountry(actor);
        actor.attemptsTo(Click.on(RegisterData.ENTER_BUTTONSUBMIT));
    }
}
