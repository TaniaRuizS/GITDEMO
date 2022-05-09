package co.com.choucair.certification.automatizaciondemo.questions;

import co.com.choucair.certification.automatizaciondemo.model.DemoRegisterBD;
import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerInvalid implements Question<Boolean> {

    private DemoRegisterBD demoRegisterBD;

    public AnswerInvalid (DemoRegisterBD demoRegisterBD) {
        this.demoRegisterBD = demoRegisterBD;}


    public static AnswerInvalid fields(DemoRegisterBD demoRegisterBD) {
        return new AnswerInvalid(demoRegisterBD);}


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String selectItemList= Text.of(RegisterData.SELECT_ITEM_LIST).viewedBy(actor).asString();
        if (demoRegisterBD.getSelectcountryR().equals(selectItemList)) {
            result = true;
        }
        else {
            System.out.println(selectItemList);
            System.out.println(demoRegisterBD.getSelectcountryR());
            result = false;
        }
        return result;
    }
}
