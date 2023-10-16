package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.JobMenu_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.MainMenu_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.Operation_CV;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import mfc.properties.globalData.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Lena on 22.10.2019.
 */
public class OperationsCV_metods extends BasisMetods {

    By HomeButtonOnJobMenu;

    public OperationsCV_metods(WebDriver wd) {
        super(wd);
    }

    public void create_Pickup(String row){
        waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(Operation_CV.Pickup_button);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
    public void clickOnRowInGrid(String row){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(By.xpath("//tr["+row+"]/td[1]/a[1]"));
    }
    public void create_Delivery(String row ) {

       // waitForElementByLeavingDOM(By.xpath("/[@class='k-loading-mask']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(Operation_CV.Delivery_button);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
    public void create_PickupFromTerminal(String row){
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(Operation_CV.PickupFromTerminal_button);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

    public void create_DeliveryToTerminal(String row){
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.DeliveryToTerminal']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
    public void create_WarehouseReceiveIn(String row) {
        //    app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("/[@class='k-loading-mask']"));
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseReceiveIn']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

    public void create_WarehouseOutload(String row) {


        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.WarehouseOutload']"));
       waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

    public void create_BoxDelivery(String row) {
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.BoxDelivery']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

    public void create_OnSite(String row) {
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.OnSite']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }
    public void create_Relo(String row) {
        //   app.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("/[@class='k-loading-mask']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));;
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        //app.getUserMenu_Metods().changeLanguage(locatorlanguage);
        clickOnRowInGrid(row);
        OpenPage(JobMenu_WebElements.Job_Operations_button,"Transaction/ClientFileGrid");
        click(Operation_CV.New_Operation_button);
        click(By.xpath("//li[@trans-type='Enum.TransactionType.Relo']"));
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));


    }

}
