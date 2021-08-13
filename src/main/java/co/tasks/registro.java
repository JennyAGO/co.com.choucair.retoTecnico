package co.tasks;

import co.userIntreface.uTestRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class registro implements Task {
    private String registro;

    public registro(String registro) {
        this.registro = registro;
    }

    public static registro the(String registro) {
        return Tasks.instrumented(registro.class, registro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestRegistroPage.BUTTON_UC),
                Enter.theValue(registro).into(uTestRegistroPage.TEXT_REGISTRO),
                Click.on(uTestRegistroPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(registro).into(uTestRegistroPage.TEXT_LOCATION),
                Click.on(uTestRegistroPage.BUTTON_NEXT_DEVICES),
                Enter.theValue(registro).into(uTestRegistroPage.TEXT_DEVICES),
                Click.on(uTestRegistroPage.BUTTON_NEXT_PASSWORD),
                Enter.theValue(registro).into(uTestRegistroPage.TEXT_PASSWORD),
                Click.on(uTestRegistroPage.CHECK_BOX)
        );

    }
}

