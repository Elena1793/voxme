package app.execution.tests.inventory;

import app.execution.configs.configINV;
import org.testng.annotations.Test;

public class OpenAppTest implements configINV {

    @Test
    public void testAppOpened() {
        System.out.println("App opened");
        appInv.getBasicMethods().screenshot();
    }
}
