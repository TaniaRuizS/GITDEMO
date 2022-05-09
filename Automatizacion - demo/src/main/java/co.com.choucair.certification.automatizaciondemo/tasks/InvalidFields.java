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
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class InvalidFields implements Task {
    private DemoRegisterBD demoRegisterBD;
    private Utilities utilities;

    public InvalidFields(DemoRegisterBD demoRegisterBD) {
        this.demoRegisterBD = demoRegisterBD;
        utilities = new Utilities(demoRegisterBD);}


    public static InvalidFields the(DemoRegisterBD demoRegisterBD) {
        return Tasks.instrumented(InvalidFields.class, demoRegisterBD);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue(demoRegisterBD.getFirstname()).into(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue(demoRegisterBD.getLastname()).into(RegisterData.INPUT_LASTNAME),
                Enter.theValue(demoRegisterBD.getAddress()).into(RegisterData.INPUT_ADDRESS),
                Enter.theValue(demoRegisterBD.getEmail()).into(RegisterData.INPUT_EMAIL),
                Enter.theValue(demoRegisterBD.getPhone()).into(RegisterData.INPUT_PHONE));

        utilities.selecctgender(actor);
        utilities.selecthobbies(actor);
        utilities.selectLanguaje(actor);

        actor.attemptsTo(
                Click.on(RegisterData.SELECT_CLICK_OUT),
                SelectFromOptions.byVisibleText(demoRegisterBD.getSkills()).from(RegisterData.SELECT_CLICK_SKILLS));

        utilities.selectCountry(actor);

        actor.attemptsTo(
                Click.on(RegisterData.SELECT_CLICK_COUNTRY),
                Enter.theValue(demoRegisterBD.getSelectcountry()).into(RegisterData.INPUT_COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                SelectFromOptions.byVisibleText(demoRegisterBD.getYear()).from(RegisterData.SELECT_YEAR),
                SelectFromOptions.byVisibleText(demoRegisterBD.getMonth()).from(RegisterData.SELECT_MONTH),
                SelectFromOptions.byVisibleText(demoRegisterBD.getDay()).from(RegisterData.SELECT_DAY),
                Enter.theValue(demoRegisterBD.getPassword1()).into(RegisterData.INPUT_PASSWORD),
                Enter.theValue(demoRegisterBD.getPassword2()).into(RegisterData.INPUT_CONFIRMPASSWORD),
                Click.on(RegisterData.ENTER_BUTTONSUBMIT));
    }
}
