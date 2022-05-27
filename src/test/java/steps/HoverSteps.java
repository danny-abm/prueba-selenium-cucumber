package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HoverPage;

public class HoverSteps {

    HoverPage hoverPage = new HoverPage();

    @Given("^Como usuario navego el sitio web del hover$")
    public void navegarSitio(){
        hoverPage.navego();
    }
    @When("^como usuario paso el mouse sobre la imagen$")
    public void pasarMouse() throws InterruptedException { 
        hoverPage.hoverImage();
    }
    @Then("^Valido que se muestre la informacion$")
    public void validaInfor(){
       
        boolean resp = hoverPage.visualizardesc();
         assertTrue(resp);

    }
    
}
