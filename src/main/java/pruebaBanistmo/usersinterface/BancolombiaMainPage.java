package pruebaBanistmo.usersinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaMainPage {

    public static final Target PAGINA_PRINCIPAL = Target.the("Ir a la Pagina Principal")
            .located(By.xpath("//*[@id=\"modal-prehome-fenix\"]/div/div/div[2]/button"));

    public static final Target EMPRESAS_BUTTON = Target.the("Boton Empresas Menu Principal")
            .located(By.xpath("//*[@id=\"header-empresas\"]"));

    public static final Target CAPITAL_INTELIGENTE_BUTTON = Target.the("Boton ir a Capital Inteligente")
            .located(By.xpath("//a[contains(text(),'Capital Inteligente')]"));
}
