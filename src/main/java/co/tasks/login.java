package co.tasks;

import co.userIntreface.uTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class login implements Task {

    private String strUser;
    private String strPassword;

    public login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static login onThePage(String strUser, String strPassword){
       return Tasks.instrumented(login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(Click.on(uTestLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(uTestLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(uTestLoginPage.INPUT_PASSWORD),
                Click.on(uTestLoginPage.ENTER_BUTTON)

        );
    }
}
