package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckBoxPage;

public class CheckBoxSteps {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Given("^Como usuario navego el sitio web de test$")
    public void navegarATest(){
        checkBoxPage.navegarTest(); 
    }
    @When("^como usuario doy click en checkBox$")
    public void clickearTest(){
        checkBoxPage.clickTest();
    }

    @And("^como usuario doy click a un checkBox$")
    public void darcheck(){
       checkBoxPage.clickCheck();
    }

    
}
