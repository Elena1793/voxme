package app.execution.tests.mfc;
import app.execution.configs.configMFC;
import org.testng.annotations.*;

/**
 * Created by user on 21.05.2018.
 */
public class ReportsGlobalScreen_Test implements configMFC {
 //   @BeforeTest
    public void Precondition(){
        appMFC.getLoginScreen_Metods().login("testuser4","testuser4");

    }

  //  @Test(priority = 1)
    public void ReportsGlobalScreenMenu(){
         appMFC.getLoginScreen_Metods().login("testuser4","testuser4");
         appMFC.getMainMenu_Metods().ManagementScreen_Open();
         appMFC.getReportsGlobal_Metods().EnvelopesScreen_Open();
         appMFC.getReportsGlobal_Metods().IteratorsScreen_Open();
         appMFC.getReportsGlobal_Metods().TablesScreen_Open();
         appMFC.getReportsGlobal_Metods().VariablesScreen_Open();
    }

}
