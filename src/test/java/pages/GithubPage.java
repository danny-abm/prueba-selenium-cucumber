package pages;



public class GithubPage extends BasesPage {

    private String locatorInputUser="/html/body/div[1]/header/div/div[2]/div[2]/div[1]/div/div/form/label/input[1]";
    private String buttonUser = "/html/body/div[4]/main/div/div[2]/nav[1]/a[10]";
    private String locatorTexto="/html/body/div[4]/main/div/div[3]/div/div/h3";
    private String locatorTexto2="/html/body/div[4]/main/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div[1]/a[1]";

    public GithubPage() {
        super(driver);
        
    }

    public void navegarGithub(){
        navigationTo("https://github.com/");
    }

    public void escribirUser(String criterio){
        write(locatorInputUser, criterio);

    }

    public void darEnterG(){
        keyEnter(locatorInputUser);
    }

    public void botonUser(){
        click(buttonUser);

    }

    public String obtenerTextoG(){
        return getTextElement(locatorTexto);
    } 

    public String obtenerTexto2(){
        return getTextElement(locatorTexto2);
    } 
    
    
}
