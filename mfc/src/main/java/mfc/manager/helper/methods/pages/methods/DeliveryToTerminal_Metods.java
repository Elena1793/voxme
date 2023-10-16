package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.DeliveryToTerminal_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.Delivery_WebElements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryToTerminal_Metods extends BasisMetods {
    public DeliveryToTerminal_Metods(WebDriver wd) {
        super(wd);
    }
    public void clickOnAddStaff_button() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(DeliveryToTerminal_WebElements.AddStaff_button_StaffGrid);
    }

    public void selectStaffFromDropdownInPopup() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(Delivery_WebElements.StaffDropdownField);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Delivery_WebElements.StaffElementInStaffDropdown);
    }

    public void clickOnAddButtonOnAddStaffPopup() {
        click(DeliveryToTerminal_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(Delivery_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(DeliveryToTerminal_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(DeliveryToTerminal_WebElements.AddTimeSheetButtonInTimesSheetWindow);


    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(Delivery_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(DeliveryToTerminal_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }




    public void clickOnAddVehicles_button_InVehiclesGrid(){
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(DeliveryToTerminal_WebElements.AddVehicles_button_VehiclesGrid);
    }
    public void selectVehicleFromDropdownInPopup(){
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Delivery_WebElements.VehiclesDropdownField);
        click(Delivery_WebElements.VehicleElementInStaffDropdown);


    }

    public void clickOnAddButtonOnAddVehiclePopup(){
        click(DeliveryToTerminal_WebElements.AddButtonOnAddVehiclePopUp);
    }

    public void selectVehicleInVehiclesGrid() {

        click(Delivery_WebElements.VehicleElementInVehicleGrid);
    }

    public void clickOnVehicleTime_button() {
        click(DeliveryToTerminal_WebElements.VehicleTimeButtonOnVehiclesGrid);
    }

    public void clickOnVehicleImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(DeliveryToTerminal_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }




    public void addRresource_Vehicles() {

        click(DeliveryToTerminal_WebElements.AddVehicles_button_VehiclesGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(DeliveryToTerminal_WebElements.VehiclesDropdownField);
        click(DeliveryToTerminal_WebElements.VehicleElementInStaffDropdown);
        click(DeliveryToTerminal_WebElements.AddButtonOnAddVehiclePopUp);
        click(DeliveryToTerminal_WebElements.VehicleElementInVehicleGrid); //div[@id='vehiclesGrid']//*[@class='k-selectable']
        click(DeliveryToTerminal_WebElements.VehicleTimeButtonOnVehiclesGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(DeliveryToTerminal_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(DeliveryToTerminal_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(DeliveryToTerminal_WebElements.VehicleImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }


    public void addRresource_Staff() {

        click(DeliveryToTerminal_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(DeliveryToTerminal_WebElements.StaffDropdownField);
        click(DeliveryToTerminal_WebElements.StaffElementInStaffDropdown);
        click(DeliveryToTerminal_WebElements.AddButtonOnAddStaffPopUp);
        click(DeliveryToTerminal_WebElements.StaffElementInStaffGrid);
        click(DeliveryToTerminal_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(DeliveryToTerminal_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(DeliveryToTerminal_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(DeliveryToTerminal_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }
}
