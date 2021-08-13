package co.tasks;

import co.userIntreface.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.seleniumhq.jetty9.util.thread.Scheduler;

public class openUp implements Task {

    private  uTestPage uTestPage;
    public static openUp thePage() {
        return Tasks.instrumented(openUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));

    }
}
