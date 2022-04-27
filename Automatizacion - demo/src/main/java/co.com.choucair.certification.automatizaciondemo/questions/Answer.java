package co.com.choucair.certification.automatizaciondemo.questions;

import co.com.choucair.certification.automatizaciondemo.userinterface.RegisterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){ this.question = question; }

    public static Answer toThe(String question) { return new Answer(question); }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String selectItemList = Text.of(RegisterData.SELECT_ITEM_LIST).viewedBy(actor).asString();
        if (selectItemList.contains(question)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
