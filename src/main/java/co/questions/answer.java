package co.questions;

import co.userIntreface.uTestRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class answer implements Question<Boolean> {
    private String question;

    public answer(String question){
        this.question = question;
    }
    public static answer toThe(String question){
        return new answer(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String joinToday = Text.of(uTestRegistroPage.BUTTON_UC).viewedBy(actor).asString();
        if (question.equals(joinToday)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
