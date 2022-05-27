package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TablePage;

public class TableSteps {

    TablePage tablePage = new TablePage();

    @Given("^Navego al sitio web de la tabla estatica$")
    public void navegarSitioTabla(){
        tablePage.navegarTabla();
    }

    @Then("^Retorno el valor de la celda fila 5 columna 2$")
    public void obtenerValorTabla(){
        String valorReal= tablePage.obtnenerValorCelda( 5, 2);
        assertEquals("r: 5, c: 2", valorReal);

    }

    @Then("^Como usuario valido si la tabla se muestra en la pagina$")
    public void validarTablaMuestra(){
        boolean valorReal= tablePage.visualizarTabla();
        assertTrue("No se muestra la tabla", valorReal);

    }

    @When("^Como usuario modifico el valor de la celda$")
    public void modificarCelda() throws InterruptedException{
        tablePage.modificar(4, 1, "Test Diosito");
    }

    @Then("^Como usuario valido el nuevo valor de la celda$")
    public void validarModificacionCelda(){
        String valorReal=tablePage.obtnenerValorCelda(4, 1);
        assertEquals("Test Diosito", valorReal);

    }


    
}
