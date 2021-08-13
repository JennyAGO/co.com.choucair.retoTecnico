package co.userIntreface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRegistroPage  extends PageObject {

    public static final Target BUTTON_UC = Target.the("Dar click en Join Today")
            .located(By.xpath("//div[@id='JoinToday']//strong"));

    public static final Target TEXT_REGISTRO = Target.the("llenar las cajas de texto")
            .located(By.id("registrobox"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("Dar click en siguiente")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target TEXT_LOCATION = Target.the("llenar las cajas de texto de locacion")
            .located(By.xpath("registroboxlocation"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("Dar click en siguiente ")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target TEXT_DEVICES = Target.the("llenar las cajas de texto de dispositivos")
            .located(By.xpath("registroboxdevices"));

    public static final Target BUTTON_NEXT_PASSWORD = Target.the("Dar click en siguiente ")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target TEXT_PASSWORD = Target.the("llenar las cajas de texto parala clave")
            .located(By.xpath("registroboxpassword"));

    public static final Target CHECK_BOX = Target.the("chequear las opciones de privacidad y politicas de seguridad")
            .located(By.xpath("registrocheckbox"));


}
