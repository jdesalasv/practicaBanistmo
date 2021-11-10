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

    public static final Target ACTUALIDAD_ECONOMICA = Target.the("Boton de Actualidad Economica")
            .located(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a"));

    public static final Target VER_MAS_PUBLICACIONES = Target.the("Boton ver mas Publicaciones")
            .located(By.xpath("//*[@id=\"verMas\"]"));

    public static final Target PAGINA_PDF = Target.the( "Link a la Pagina donde descargar el PDF")
            .located(By.xpath("//*[@id=\"capital_inteligente\"]/div[1]/div[45]/div[2]/h2/a"));

    public static final Target IMAGEN_PDF = Target.the("Imagen para acceder al pdf")
            .located(By.xpath("//*[@id=\"main-content\"]/div[2]/div[1]/div/div[1]/p[10]/a/img"));


}
