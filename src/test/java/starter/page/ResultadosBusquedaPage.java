package starter.page;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import java.util.List;
import java.util.stream.Collectors;

public class ResultadosBusquedaPage extends PageObject{
    public static Target LISTA_DE_RESULTADOS = Target.the("Lista de resultados busquedas").locatedBy("//input[@class='ngSelectionCheckbox']");
    public static Target COSTOS_LISTA_DE_RESULTADOS = Target.the("costo de resultado").locatedBy("//span[@data-stid='price-lockup-text']");
    public static Target PRIMER_COSTOS_LISTA_DE_RESULTADOS = Target.the("primer costo de resultado").locatedByFirstMatching("//span[@data-stid='price-lockup-text']");
    //public static final String TITULO_RESULTADO = "//input[@class='ngSelectionCheckbox']";
    public static final String TITULO_RESULTADO = "//div[@class='ngCellText ng-scope col6 colt6']";
public List<String> obtenerResultados(){
    return findAll(TITULO_RESULTADO)
            .stream()
            .map(element -> element.getText())
            .collect(Collectors.toList());
}
}
