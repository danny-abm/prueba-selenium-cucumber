package pages;



public class HoverPage extends BasesPage {

    public String hoverImage="/html/body/div[2]/div/div/div[3]";
    public String locatorinf="/html/body/div[2]/div/div/div[3]/div";
    public HoverPage() {
        super(driver);
    }
    
    public void navego(){

        navigationTo("https://the-internet.herokuapp.com/hovers");

    }

    public void hoverImage() throws InterruptedException{
        hoverElement(hoverImage);
        Thread.sleep(3000);
    }

    public boolean visualizardesc(){
        return validateExistElement(locatorinf);
    }

}
