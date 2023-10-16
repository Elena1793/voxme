package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;
public interface LoginScreen_Webelements {


    By username_field = By.cssSelector("input#username");
    By password_field = By.cssSelector("input#password");
    By loginSubmit_button = By.cssSelector("button#loginSubmit");

}
