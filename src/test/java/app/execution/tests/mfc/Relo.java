package app.execution.tests.mfc;
import app.execution.configs.configMFC;
import mfc.manager.data.execution.DataProviders;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import static mfc.manager.helper.methods.pages.methods.webElements.JobMenu_WebElements.*;
import static mfc.manager.helper.methods.pages.methods.webElements.Operation_CV.*;
/**
 * Created by Lena on 22.10.2019.
 */
public class Relo implements configMFC {

    @Test(priority=1,dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_new")
    //@Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    public void createRelo(By locatorlanguage, String bookingType, String source, String jobType,
                           String mode, String serviceType, String serviceLevel,
                           String firstName, String lastName, String email, String phone,
                           String country1, String country2, String city1, String city2,
                           String street1, String street2, String zip1, String zip2) throws InterruptedException {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobGrid_Metods().OpenPage(Job_Operations_button, "Transaction/ClientFileGrid");
        appMFC.getJobGrid_Metods().click(New_Operation_button);
        appMFC.getJobGrid_Metods().click(Relo_button);
        appMFC.getJobGrid_Metods().waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        Thread.sleep(1500);
        appMFC.getDelivery_Metods().clickOnAddStaff_button();
        appMFC.getDelivery_Metods().selectStaffFromDropdownInPopup();
        appMFC.getDelivery_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getDelivery_Metods().selectStaffInStaffGrid();
        appMFC.getDelivery_Metods().clickOnStaffTime_button();
        appMFC.getDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDelivery_Metods().clickOnStaffImportToExpenseButton();

        appMFC.getDelivery_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getDelivery_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getDelivery_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getDelivery_Metods().selectVehicleInVehiclesGrid();
        appMFC.getDelivery_Metods().clickOnVehicleTime_button();
        appMFC.getDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDelivery_Metods().clickOnVehicleImportToExpenseButton();

        appMFC.getDelivery_Metods().clickOnAddEquipment_button_InEquipmentGrid();
        appMFC.getDelivery_Metods().selectEquipmentFromDropdownInPopup();
        appMFC.getDelivery_Metods().clickOnAddButtonOnAddEquipmentPopup();
        appMFC.getDelivery_Metods().selectEquipmentInEquipmentsGrid();
        appMFC.getDelivery_Metods().clickOnEquipmentTime_button();
        appMFC.getDelivery_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDelivery_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDelivery_Metods().clickOnEquipmentImportToExpenseButton();

    }



}
