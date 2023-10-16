package app.execution.tests.inventory;

import app.execution.configs.configINV;
import org.testng.annotations.Test;

public class SignAndSendTest implements configINV {

    @Test
    public void signAndSendInventoryToMFC() throws InterruptedException {
        appInv.getBasicMethods().selectClientFromTheDiscovery();
        appInv.getBasicMethods().clickOnTheReportInventoryButton();
        appInv.getBasicMethods().swipeScreenDown();
        appInv.getBasicMethods().clickOnTheClientShipperButton();
        appInv.getBasicMethods().drawSign();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickOnTheForemanDriverButton();
        appInv.getBasicMethods().drawSign();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().swipeScreenUp();
        appInv.getBasicMethods().clickOnSummaryButton();
        appInv.getBasicMethods().swipeScreenDown();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        //appInv.getBasicMethods().clickOnTheUploadButton();
        //appInv.getBasicMethods().clickOnTheOKButtonOnThePopUp();
    }
}
