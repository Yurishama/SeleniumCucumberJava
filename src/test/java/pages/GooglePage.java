package pages;

public class GooglePage  extends BasePage{

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTO("https://www.google.com");
    }
}
