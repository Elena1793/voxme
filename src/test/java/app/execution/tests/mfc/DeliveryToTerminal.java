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
public class DeliveryToTerminal implements configMFC {

    @Test(priority=1,dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_new")
   // @Test(priority=1,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
    public void createDeliveryToTerminal(By locatorlanguage, String bookingType, String source, String jobType,
                                         String mode, String serviceType, String serviceLevel,
                                         String firstName, String lastName, String email, String phone,
                                         String country1, String country2, String city1, String city2,
                                         String street1, String street2, String zip1, String zip2) throws InterruptedException {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobGrid_Metods().OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
        appMFC.getJobGrid_Metods(). click(New_Operation_button);
        appMFC.getJobGrid_Metods().click(DeliveryToTerminal_button);
        appMFC.getJobGrid_Metods(). waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

        appMFC.getDeliveryToTerminal_Metods().clickOnAddStaff_button();
        appMFC.getDeliveryToTerminal_Metods().selectStaffFromDropdownInPopup();
        appMFC.getDeliveryToTerminal_Metods().clickOnAddButtonOnAddStaffPopup();
        appMFC.getDeliveryToTerminal_Metods().selectStaffInStaffGrid();
        appMFC.getDeliveryToTerminal_Metods().clickOnStaffTime_button();
        appMFC.getDeliveryToTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDeliveryToTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDeliveryToTerminal_Metods().clickOnStaffImportToExpenseButton();

        appMFC.getDeliveryToTerminal_Metods().clickOnAddVehicles_button_InVehiclesGrid();
        appMFC.getDeliveryToTerminal_Metods().selectVehicleFromDropdownInPopup();
        appMFC.getDeliveryToTerminal_Metods().clickOnAddButtonOnAddVehiclePopup();
        appMFC.getDeliveryToTerminal_Metods().selectVehicleInVehiclesGrid();
        appMFC.getDeliveryToTerminal_Metods().clickOnVehicleTime_button();
        appMFC.getDeliveryToTerminal_Metods().clickOnAddTimeSheetButtonInTimesSheetWindow();
        appMFC.getDeliveryToTerminal_Metods().clickCloseButtonOnTimesSheetWindow();
        appMFC.getDeliveryToTerminal_Metods().clickOnVehicleImportToExpenseButton();

        CostCreateButton();
        Set_ServiceType();
        Set_Vendor();
        Set_Type();
        Set_description();
        Set_Currency();
        Set_Total();
        Set_ExchangeRate();
        saveNewCost();
        // appMFC.Quotation_metods().ckick_generateReport();
        generateReport();

         sendEmail();
        generateTasks();
    }

    private void generateReport() throws InterruptedException {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appMFC.Quotation_metods().click(By.xpath("//div[@id='reportButton']"));
        Thread.sleep(1000);
        appMFC.getPickupFromTerminal_Metods()
                .click(By.xpath("//*[@id=\"reportButtonMenu-root\"]//ul/li[1]"));
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
        //appMFC.Quotation_metods().click_sendSubmit_SendPopup();
        // appMFC.getPickup_Metods().waitForElementByVisibility(By.xpath("//*[@class=\"k-widget k-window\"]//*[@id=\"emailEditorWindow\"]"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*appMFC.getPickup_Metods().
                click(By.xpath("/html[1]/body[1]/div[262]/div[2]/div[3]/div[1]/div[1]/div[6]/button[1]"));
        */
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
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"ServiceType_listbox\"]/li[2]"));

    }

    private void CostCreateButton() throws InterruptedException {
        Thread.sleep(2000);
        appMFC.getPickup_Metods().click(By.xpath("//*[@id=\"expenseAdd\"]"));
    }






}
