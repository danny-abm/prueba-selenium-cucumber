package pages;



public class LoginPage extends BasesPage{
    private String locatorUser="/html/body/div[2]/div/div/form/div[1]/div/input";
    private String locatorPass="/html/body/div[2]/div/div/form/div[2]/div/input";
    private String locatorButton="/html/body/div[2]/div/div/form/button";
    private String DivSucces="//*[@id='flash']";
    private String classFail="//*[@id='flash']";
    

    public LoginPage() {
        super(driver);
    }
    
    public void navegarLogin(){
        navigationTo("https://the-internet.herokuapp.com/login");
    }
    public void escribirUser(String criterio){
        write(locatorUser, criterio);

    }

    public void escribirPass(String criterio){
        write(locatorPass, criterio);

    }

    public void botonBusqueda(){
        click(locatorButton);

    }

    public boolean succes(){
        return validateExistElement(DivSucces);
    } 

    public boolean fail(){
        return validateExistElement( classFail);
    } 

}
