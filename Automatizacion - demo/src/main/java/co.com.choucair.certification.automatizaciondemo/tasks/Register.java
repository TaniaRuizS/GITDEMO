package co.com.choucair.certification.automatizaciondemo.tasks;

import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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
                Enter.theValue("tania123@hotmail.com").into(RegisterData.INPUT_EMAIL)
        );
    }
}
