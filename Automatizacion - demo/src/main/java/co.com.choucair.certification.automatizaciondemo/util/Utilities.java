package co.com.choucair.certification.automatizaciondemo.util;

import co.com.choucair.certification.automatizaciondemo.model.DemoRegisterBD;
import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

public class Utilities extends PageObject {

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

    public void uploadFile() {
        try {
            Robot robot = new Robot();
            Actions builder = new Actions(getDriver());
            Action myAction = builder.click(getDriver().findElement(By.id("imagesrc"))).release().build();
            myAction.perform();
            robot.setAutoDelay(2000);
            StringSelection selection = new StringSelection(demoRegisterBD.getFile());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
            robot.setAutoDelay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.setAutoDelay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


}
