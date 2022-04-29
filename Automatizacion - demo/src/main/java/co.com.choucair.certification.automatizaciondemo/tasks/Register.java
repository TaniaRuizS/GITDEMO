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
        actor.attemptsTo(Click.on(RegisterData.INPUT_FIRSTNAME));
                actor.attemptsTo(Enter.theValue(demoRegisterBD.getFirstname()).into(RegisterData.INPUT_FIRSTNAME));
                actor.attemptsTo(Enter.theValue(demoRegisterBD.getLastname()).into(RegisterData.INPUT_LASTNAME));
                actor.attemptsTo(Enter.theValue(demoRegisterBD.getAddress()).into(RegisterData.INPUT_ADDRESS));
                actor.attemptsTo(Enter.theValue(demoRegisterBD.getEmail()).into(RegisterData.INPUT_EMAIL));
                actor.attemptsTo(Enter.theValue(demoRegisterBD.getPhone()).into(RegisterData.INPUT_PHONE));
                if(demoRegisterBD.getGender().equals("Male")){actor.attemptsTo(Click.on(RegisterData.SELECT_GENDER_MALE));} else{actor.attemptsTo(Click.on(RegisterData.SELECT_GENDER_FEMALE));}
                if(demoRegisterBD.getHobbies().contains("Cricket")) {actor.attemptsTo(Click.on(RegisterData.SELECT_HOBBIES_CRICKET));} if (demoRegisterBD.getHobbies().contains("Movies")){actor.attemptsTo(Click.on(RegisterData.SELECT_HOBBIES_MOVIES));} if(demoRegisterBD.getHobbies().contains("Hockey")){actor.attemptsTo(Click.on(RegisterData.SELECT_HOBBIES_HOCKEY));}
                actor.attemptsTo(Click.on(RegisterData.SELECT_CLICK_LANGUAGE));
                actor.attemptsTo(Click.on(RegisterData.SELECT_LANGUAGE1));
                actor.attemptsTo(Click.on(RegisterData.SELECT_LANGUAGE2));
                actor.attemptsTo(Click.on(RegisterData.SELECT_CLICK_OUT));
                actor.attemptsTo(Click.on(RegisterData.SELECT_CLICK_SKILLS));
                actor.attemptsTo(Click.on(RegisterData.INPUT_SKILLS));
                actor.attemptsTo(Click.on(RegisterData.SELECT_CLICK_COUNTRY));
                actor.attemptsTo(Click.on(RegisterData.SELECT_COUNTRY));
                actor.attemptsTo(Click.on(RegisterData.INPUT_COUNTRY));
                actor.attemptsTo(SelectFromOptions.byVisibleText(demoRegisterBD.getYear()).from(RegisterData.SELECT_YEAR));
                actor.attemptsTo(SelectFromOptions.byVisibleText(demoRegisterBD.getMonth()).from(RegisterData.SELECT_MONTH));
                actor.attemptsTo(SelectFromOptions.byVisibleText(demoRegisterBD.getDay()).from(RegisterData.SELECT_DAY));
                actor.attemptsTo(Enter.theValue(demoRegisterBD.getPassword1()).into(RegisterData.INPUT_PASSWORD));
                actor.attemptsTo(Enter.theValue(demoRegisterBD.getPassword2()).into(RegisterData.INPUT_CONFIRMPASSWORD));
                actor.attemptsTo(Click.on(RegisterData.ENTER_BUTTONSUBMIT)
        );
    }
}