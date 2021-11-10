package pruebaBanistmo.usersinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PdfPage {

    public static final  Target PDF = Target.the("Nombre del Pdf")
            .located(By.xpath("//embed[@type='application/pdf']"));
}
