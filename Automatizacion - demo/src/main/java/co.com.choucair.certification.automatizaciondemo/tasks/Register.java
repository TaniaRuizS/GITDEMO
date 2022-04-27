package co.com.choucair.certification.automatizaciondemo.tasks;

import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    public static Register data() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue("Tania").into(RegisterData.INPUT_FIRSTNAME),
                Enter.theValue("Ruiz").into(RegisterData.INPUT_LASTNAME),
                Enter.theValue("Av Japon No 3-55").into(RegisterData.INPUT_ADDRESS),
                Enter.theValue("tania123@hotmail.com").into(RegisterData.INPUT_EMAIL),
                Enter.theValue("3103900115").into(RegisterData.INPUT_PHONE),
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
                SelectFromOptions.byVisibleText("1996").from(RegisterData.SELECT_YEAR),
                SelectFromOptions.byVisibleText("April").from(RegisterData.SELECT_MONTH),
                SelectFromOptions.byVisibleText("19").from(RegisterData.SELECT_DAY),
                Enter.theValue("Dino123*").into(RegisterData.INPUT_PASSWORD),
                Enter.theValue("Dino123*").into(RegisterData.INPUT_CONFIRMPASSWORD)
        );
    }
}
