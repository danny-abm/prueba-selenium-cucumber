package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

public class ListSteps {

    ListPage listPage = new ListPage();

    @Given("^Como usuario navego al sitio web de la lista$")
    public void navegarSitio(){
        listPage.navegarLista();
    }
    @When("^como usuario busco un (.+) en la lista$")
    public void escribirBusqueda(String estado) throws InterruptedException { 
        listPage.escribirEstado(estado);
    }
    @Then("^como usuario encuentro la (.+) de la lista$")
    public void validaElementos(String ciudad){
        List<String> lista =listPage.getResults();
        boolean existeCiudad =lista.contains(ciudad);
        assertTrue(existeCiudad);

    }
}
