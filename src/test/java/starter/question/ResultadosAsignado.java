package starter.question;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import java.util.List;
import java.util.stream.Collectors;

import static starter.page.ResultadosBusquedaPage.TITULO_RESULTADO;

public class ResultadosAsignado {

    Question<List<WebElementFacade>> numberOfTodoItems(String nombre) {
        return Question.about("the number of todo items")
                .answeredBy(
                        actor -> BrowseTheWeb.as(actor).findAll(TITULO_RESULTADO)
                                .stream()
                                .filter(element -> element.getText().equals(nombre))
                                .collect(Collectors.toList())
                );

    }
}
