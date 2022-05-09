package co.com.choucair.certification.automatizaciondemo.util;

import co.com.choucair.certification.automatizaciondemo.model.DemoRegisterBD;
import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class Utilities {

    private DemoRegisterBD demoRegisterBD;

    public Utilities(DemoRegisterBD demoRegisterBD) {this.demoRegisterBD = demoRegisterBD;}

    public  <T extends Actor> void selecthobbies(T actor) {
        if (demoRegisterBD.getHobbies().contains("Cricket")) {
            actor.attemptsTo(Click.on(RegisterData.SELECT_HOBBIES_CRICKET));
        }
        if (demoRegisterBD.getHobbies().contains("Movies")) {
            actor.attemptsTo(Click.on(RegisterData.SELECT_HOBBIES_MOVIES));
        }
        if (demoRegisterBD.getHobbies().contains("Hockey")) {
            actor.attemptsTo(Click.on(RegisterData.SELECT_HOBBIES_HOCKEY));
        }
    }

    public  <T extends Actor> void selecctgender(T actor) {
        if (demoRegisterBD.getGender().equals("Male")) {
            actor.attemptsTo(Click.on(RegisterData.SELECT_GENDER_MALE));
        } else {
            actor.attemptsTo(Click.on(RegisterData.SELECT_GENDER_FEMALE));
        }
    }

    public void selectLanguaje(Actor actor) {
        List<String> listlanguaje = Arrays.asList(demoRegisterBD.getLanguajes().split("-"));
        actor.attemptsTo(Click.on(RegisterData.SELECT_CLICK_LANGUAGE));
        for (String languaje: listlanguaje) {
            String xpath = "//a[text()= '%s']";
            Target select_languaje = Target.the("where you select on language").
                    located(By.xpath(String.format(xpath,languaje)));
            actor.attemptsTo(Click.on(select_languaje));
        }

    }

    public void selectCountry(Actor actor) {
        String country = demoRegisterBD.getCountry();
        String xpath = "//option[contains(text(),'%s')]";
        Target select_country = Target.the("Select Store").
                located(By.xpath(String.format(xpath, country)));
        actor.attemptsTo(Click.on(select_country));}
}
