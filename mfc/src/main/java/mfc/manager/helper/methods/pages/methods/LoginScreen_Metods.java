package mfc.manager.helper.methods.pages.methods;
import mfc.manager.ApplicationManager;
import mfc.manager.helper.methods.pages.methods.webElements.LoginScreen_Webelements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginScreen_Metods extends BasisMetods implements LoginScreen_Webelements {




    public LoginScreen_Metods(WebDriver wd) {

        super(wd);


    }

    public void login(String user, String password) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        type(username_field, user);
        type(password_field, password);
        click(loginSubmit_button);
        isPageOpened(ApplicationManager.main_Page);

    }







}
