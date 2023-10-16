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
public class Pickup implements configMFC {

   // @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_new")
   // @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")

    public void createPickup(By locatorlanguage, String bookingType, String source, String jobType,
                             String mode, String serviceType, String serviceLevel,
                             String firstName, String lastName, String email, String phone,
                             String country1, String country2, String city1, String city2,
                             String street1, String street2, String zip1, String zip2) throws InterruptedException {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobGrid_Metods().OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        appMFC.getJobGrid_Metods(). click(New_Operation_button);
        appMFC.getJobGrid_Metods().click(Pickup_button);
        //appMFC.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
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


        CostCreateButton();
        Set_ServiceType();
        Set_Vendor();
        Set_Type();
        Set_description();
        Set_Currency();
        Set_Total();
        Set_ExchangeRate();
        saveNewCost();
        appMFC.Quotation_metods().ckick_generateReport();

        sendEmail();
        generateTasks();
    }
    private void sendEmail() {
        appMFC.Quotation_metods().markCheckboxinDocumentSection();
        appMFC.Quotation_metods().click_ShareButton();
        appMFC.Quotation_metods().click_Share_Email();

        appMFC.Quotation_metods().click_contactTo_SendEmail();
        appMFC.Quotation_metods().select_contactTo_SendEmail("Shipper");
        appMFC.Quotation_metods().click_sendTemplate_SendEmail();
        appMFC.Quotation_metods().select_sendTemplate_SendEmail();
        appMFC.Quotation_metods().click_OK_SendEmail();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        appMFC.getDelivery_Metods().click(By.cssSelector("div#emailEditorWindow.popup.k-window-content div.popup__header"));
        appMFC.getDelivery_Metods().click(By.cssSelector("div#emailEditorWindow.popup.k-window-content div.popup__footer #sendSubmit"));

        appMFC.Quotation_metods().click_emailSuccessSendClose();
    }

    private void generateTasks() {
        appMFC.getJobSummary_Metods().click(By.xpath("//*[@id=\"right-section\"]//*[@id=\"js-tasks-panel\"]//*[@id=\"generateTasks\"]"));
        /*appMFC.getJobSummary_Metods().click_createNewTask();
        appMFC.getJobSummary_Metods().typeTask_title("TaskTitle");
        appMFC.getJobSummary_Metods().typeTask_description("TaskDescription");
        appMFC.getJobSummary_Metods().typeTask_nextStep("TaskNextStep");
        appMFC.getJobSummary_Metods().click(By.xpath("/*//*[@aria-owns='createOwnedBy_listbox']"));
        appMFC.getJobSummary_Metods().click(By.xpath("//ul[@id='createOwnedBy_listbox']/li[contains(text(), 'Serge Corbet')]"));
        appMFC.getJobSummary_Metods().clickOn_SaveTaskButton();*/
    }


    //        sendEmail();
//        generateTasks();
//
//    }
//
//
//    private void sendEmail() {
//        appMFC.Quotation_metods().markCheckboxinDocumentSection();
//        appMFC.Quotation_metods().click_ShareButton();
//        appMFC.Quotation_metods().click_Share_Email();
//
//        appMFC.Quotation_metods().click_contactTo_SendEmail();
//        appMFC.Quotation_metods().select_contactTo_SendEmail("Shipper");
//        appMFC.Quotation_metods().click_sendTemplate_SendEmail();
//        appMFC.Quotation_metods().select_sendTemplate_SendEmail();
//        appMFC.Quotation_metods().click_OK_SendEmail();
//        //appMFC.Quotation_metods().click_sendSubmit_SendPopup();
//       // appMFC.getPickup_Metods().waitForElementByVisibility(By.xpath("//*[@class=\"k-widget k-window\"]//*[@id=\"emailEditorWindow\"]"));
//        appMFC.getPickup_Metods().
//                click(By.xpath("//*[@class=\"k-widget k-window\"]//*[@id=\"emailEditorWindow\"]//*[@class=\"popup__footer\"]//*[@id=\"sendSubmit\"]"));
//
//        appMFC.Quotation_metods().click_emailSuccessSendClose();
//    }
//
//    private void generateTasks() {
//        appMFC.getJobSummary_Metods().click(By.xpath("//*[@id=\"right-section\"]//*[@id=\"js-tasks-panel\"]//*[@id=\"generateTasks\"]"));
//        /*appMFC.getJobSummary_Metods().click_createNewTask();
//        appMFC.getJobSummary_Metods().typeTask_title("TaskTitle");
//        appMFC.getJobSummary_Metods().typeTask_description("TaskDescription");
//        appMFC.getJobSummary_Metods().typeTask_nextStep("TaskNextStep");
//        appMFC.getJobSummary_Metods().click(By.xpath("/*//*[@aria-owns='createOwnedBy_listbox']"));
//        appMFC.getJobSummary_Metods().click(By.xpath("//ul[@id='createOwnedBy_listbox']/li[contains(text(), 'Serge Corbet')]"));
//        appMFC.getJobSummary_Metods().clickOn_SaveTaskButton();*/
//    }
    private void saveNewCost() {
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"costs\"]"));
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"expenseTick\"]"));
    }

    private void Set_ExchangeRate() {
        appMFC.getPickup_Metods().click(By.xpath("//*[@data-container-for=\"ExchangeRate\"]//input"));
        appMFC.getPickup_Metods().type(By.xpath("//*[@data-container-for=\"ExchangeRate\"]//input[@id=\"ExchangeRate\"]"),"100");
    }

    private void Set_Total() {
        appMFC.getPickup_Metods().click(By.xpath("//*[@data-container-for=\"Total\"]//input"));
        appMFC.getPickup_Metods().type(By.xpath("//*[@data-container-for=\"Total\"]//input[@id=\"Total\"]"),"100");
    }

    private void Set_Currency() throws InterruptedException {
        appMFC.getPickup_Metods().click(By.xpath("//*[@aria-owns=\"Currency_listbox\"]//*[@class=\"k-select\"]"));
        Thread.sleep(500);
        appMFC.getPickup_Metods().click(By.xpath("//ul[@id=\"Currency_listbox\"]/li[3]"));
    }

    private void Set_description() {
        appMFC.getPickup_Metods().type(By.xpath("//*[@data-container-for=\"Description\"]//input"),"description");
    }

    private void Set_Type() throws InterruptedException {
        appMFC.getPickup_Metods().click(By.xpath("//*[@aria-owns=\"Type_listbox\"]//*[@class=\"k-select\"]"));
        Thread.sleep(500);
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"Type_listbox\"]//li[1]"));
    }

    private void Set_Vendor() throws InterruptedException {
        Thread.sleep(1000);
        appMFC.getPickup_Metods().click(By.xpath("//*[@data-container-for=\"VendorId\"]//*[@class=\"k-select\"]"));
        Thread.sleep(1000);
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"VendorId_listbox\"]/li[3]"));
    }

    private void Set_ServiceType() throws InterruptedException {
        Thread.sleep(500);
        appMFC.getPickup_Metods().click(By.xpath("//*[@data-container-for=\"ServiceType\"]"));
        // appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"ServiceType_listbox\"]/li[contains(text(),'vendorTypeAgent')]"));
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"ServiceType_listbox\"]/li[2]"));

    }

    private void CostCreateButton() throws InterruptedException {
        Thread.sleep(2000);
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"expenseAdd\"]"));
    }




    /* private void saveNewCost() {
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@id=\"costs\"]"));
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@id=\"expenseTick\"]"));
    }

    private void Set_ExchangeRate() {
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@data-container-for=\"ExchangeRate\"]//input"));
        appMFC.getPickup_Metods().type(By.xpath("/*//*[@data-container-for=\"ExchangeRate\"]//input[@id=\"ExchangeRate\"]"),"100");
    }

    private void Set_Total() {
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@data-container-for=\"Total\"]//input"));
        appMFC.getPickup_Metods().type(By.xpath("/*//*[@data-container-for=\"Total\"]//input[@id=\"Total\"]"),"100");
    }

    private void Set_Currency() throws InterruptedException {
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@aria-owns=\"Currency_listbox\"]/*//*[@class=\"k-select\"]"));
        Thread.sleep(500);
        appMFC.getPickup_Metods().click(By.xpath("//ul[@id=\"Currency_listbox\"]/li[3]"));
    }

    private void Set_description() {
        appMFC.getPickup_Metods().type(By.xpath("/*//*[@data-container-for=\"Description\"]//input"),"description");
    }

    private void Set_Type() throws InterruptedException {
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@aria-owns=\"Type_listbox\"]/*//*[@class=\"k-select\"]"));
        Thread.sleep(500);
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@id=\"Type_listbox\"]//li[1]"));
    }

    private void Set_Vendor() throws InterruptedException {
        Thread.sleep(1000);
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@data-container-for=\"VendorId\"]/*//*[@class=\"k-select\"]"));
        Thread.sleep(1000);
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@id=\"VendorId_listbox\"]/li[3]"));
    }

    private void Set_ServiceType() throws InterruptedException {
        Thread.sleep(500);
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@data-container-for=\"ServiceType\"]"));
        // appMFC.getPickup_Metods().click(By.xpath("/*//*[@id=\"ServiceType_listbox\"]/li[contains(text(),'vendorTypeAgent')]"));
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@id=\"ServiceType_listbox\"]/li[2]"));
    }

    private void CostCreateButton() throws InterruptedException {
        Thread.sleep(2000);
        appMFC.getPickup_Metods().click(By.xpath("/*//*[@id=\"expenseAdd\"]"));
    }

*/

}
