package co.com.choucair.certification.automatizaciondemo.tasks;


import co.com.choucair.certification.automatizaciondemo.model.DemoRegisterBD;
import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    public DemoRegisterBD demoRegisterBD = new DemoRegisterBD();

    public Register(DemoRegisterBD demoRegisterBD) { this.demoRegisterBD = demoRegisterBD; }

    public static Register the(DemoRegisterBD demoRegisterBD) {return Tasks.instrumented(Register.class,demoRegisterBD); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue(demoRegisterBD.getFirstname()).into(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue(demoRegisterBD.getLastname()).into(RegisterData.INPUT_LASTNAME),
                Enter.theValue(demoRegisterBD.getAddress()).into(RegisterData.INPUT_ADDRESS),
                Enter.theValue(demoRegisterBD.getEmail()).into(RegisterData.INPUT_EMAIL),
                Enter.theValue(demoRegisterBD.getPhone()).into(RegisterData.INPUT_PHONE),
                Click.on(RegisterData.SELECT_GENDER),
                Click.on(RegisterData.SELECT_HOBBIES),
                Click.on(RegisterData.SELECT_CLICK_LANGUAGE),
                Click.on(RegisterData.SELECT_LANGUAGE1),
                Click.on(RegisterData.SELECT_LANGUAGE2),
                Click.on(RegisterData.SELECT_CLICK_OUT),
                Click.on(RegisterData.SELECT_CLICK_SKILLS),
                Click.on(RegisterData.INPUT_SKILLS),
                Click.on(RegisterData.SELECT_CLICK_COUNTRY),
                Click.on(RegisterData.SELECT_COUNTRY),
                Click.on(RegisterData.INPUT_COUNTRY),
                SelectFromOptions.byVisibleText(demoRegisterBD.getYear()).from(RegisterData.SELECT_YEAR),
                SelectFromOptions.byVisibleText(demoRegisterBD.getMonth()).from(RegisterData.SELECT_MONTH),
                SelectFromOptions.byVisibleText(demoRegisterBD.getDay()).from(RegisterData.SELECT_DAY),
                Enter.theValue(demoRegisterBD.getPassword1()).into(RegisterData.INPUT_PASSWORD),
                Enter.theValue(demoRegisterBD.getPassword2()).into(RegisterData.INPUT_CONFIRMPASSWORD),
                Click.on(RegisterData.ENTER_BUTTONSUBMIT)
        );
    }
}