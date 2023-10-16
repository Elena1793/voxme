package app.execution.tests.mfc;
import app.execution.configs.configMFC;
import org.testng.annotations.*;


public class LoginTests implements configMFC {




    @Test(priority = 2)
    public  void loginTestValid(){
        appMFC.getLoginScreen_Metods().login("testuser4", "testuser4");





    }



}
