package mfc.manager.helper.methods.menu.methods;

import mfc.manager.helper.methods.base.methods.BasisMetods;
import mfc.manager.helper.methods.pages.methods.webElements.JobMenu_WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import mfc.properties.globalData.*;


public class JobMenu_Metods extends BasisMetods implements JobMenu_WebElements {


    public JobMenu_Metods(WebDriver wd){
        super(wd);
    }

    public void Job_SummaryScreen_Open(){
        //OpenPage(Job_Summary_button, TitlePage.Job_Summary);
        OpenPage(Job_Summary_button, "JobSummary");
    }
    public void Job_TasksScreen_Open() {

        OpenPage(Job_Tasks_button, "Task/CFGrid");
    }
    public void Job_DocumentsScreen_Open() {
        OpenPage(Job_Documents_button, "Document/CFGrid");
    }
    public void Job_CommunicationHistoryScreen_Open(){
        OpenPage(Job_CommunicationHistory_button,"Communication/CFGrid");
    }
    public void Job_SurveysScreen_Open(){

        OpenPage(Job_Surveys_button,"Survey/ClientFileGrid");
    }
    public void Job_QuotationsScreen_Open(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        OpenPage(Job_Quotations_button,"Quotation/ClientFileGrid");
    }
    public void Job_ShipmentsScreen_Open(){

        OpenPage(Job_Shipments_button,"Shipment/ClientFileGrid");
    }
    public void Job_OperationsScreen_Open(){

        OpenPage(Job_Operations_button,"Transaction/ClientFileGrid");
    }
    public void Job_InventoryScreen_Open(){

        OpenPage(Job_Inventory_button,"PackingInventory/Inventory");
    }
    public void Job_ExpensesScreen_Open(){

        OpenPage(Job_Expenses_button,"Expense/ClientFileGrid");
    }
    public void Job_InvoicesScreen_Open(){

        OpenPage(Job_Invoices_button,"Invoice/ClientFileGrid");
    }
    public void Job_WarehouseScreen_Open(){

        OpenPage(Job_Warehouse_button,"Warehouse/CFGrid");
    }
    public void Job_SatisfactionSurveyScreen_Open(){
        OpenPage(Job_SatisfactionSurvey_button,"SatisfactionSurvey/SatisfactionSurvey");
    }
    public void ReturnToJob_Grid(){
        waitForElementByNOTvisibility(By.id("page-preloader"));

        click(Job_Home_button);
        isPageOpened(ScreensURL.Job_Grid);
    }


}


