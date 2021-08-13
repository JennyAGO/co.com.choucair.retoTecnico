package co.StepDefinitions;

import co.model.uTestData;
import co.questions.answer;
import co.tasks.login;
import co.tasks.openUp;
import co.tasks.registro;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^than Jennifer wants to enter uTest as a new user$")
    public void thanJenniferWantsToEnterUTestAsANewUser(List<uTestData> uTestData) throws Exception {
        OnStage.theActorCalled( "Jennifer").wasAbleTo(openUp.thePage(), (login.onThePage(uTestData.get(0).getStrUser(), uTestData.get(0).getStrPassword())));
    }

    @When("^she looking for the log option \\(JOIN TODAY\\)$")
    public void sheLookingForTheLogOptionJOINTODAY(List<uTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(registro.the(uTestData.get(0).getStrRegistro()));
    }

    @Then("^she registers on the page to have an account on uTest$")
    public void sheRegistersOnThePageToHaveAnAccountOnUTest(List<uTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(answer.toThe(uTestData.get(0).getStrRegistro())));
    }

}
