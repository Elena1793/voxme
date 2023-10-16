package mfc.manager.helper.methods.pages.methods;

import mfc.manager.helper.methods.pages.methods.webElements.Delivery_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.WarehouseOutload_WebElements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Lena on 10.11.2019.
 */
public class WarehouseOutload_Metods extends BasisMetods {

    public WarehouseOutload_Metods(WebDriver wd) {
        super(wd);
    }
    public void clickOnAddStaff_button() {
        click(WarehouseOutload_WebElements.AddStaff_button_StaffGrid);
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
        click(WarehouseOutload_WebElements.AddButtonOnAddStaffPopUp);
    }

    public void selectStaffInStaffGrid() {
        click(Delivery_WebElements.StaffElementInStaffGrid);
    }

    public void clickOnStaffTime_button() {
        click(WarehouseOutload_WebElements.StaffTimeButtonOnStaffGrid);
    }

    public void clickOnAddTimeSheetButtonInTimesSheetWindow() {
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseOutload_WebElements.AddTimeSheetButtonInTimesSheetWindow);
    }

    public void clickCloseButtonOnTimesSheetWindow() {
        click(Delivery_WebElements.CloseButtonOnTimesSheetWindow);
    }

    public void clickOnStaffImportToExpenseButton() {
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(WarehouseOutload_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
    }


    public void addRresource_Staff() {

        click(WarehouseOutload_WebElements.AddStaff_button_StaffGrid);
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseOutload_WebElements.StaffDropdownField);
        click(WarehouseOutload_WebElements.StaffElementInStaffDropdown);
        click(WarehouseOutload_WebElements.AddButtonOnAddStaffPopUp);
        click(WarehouseOutload_WebElements.StaffElementInStaffGrid);
        click(WarehouseOutload_WebElements.StaffTimeButtonOnStaffGrid);
        waitForElementByVisibility(By.xpath("//div[@id='timesheetWindow']"));
        waitForElementByVisibility(By.xpath("//*[@class='k-widget k-window k-state-focused']"));
        click(WarehouseOutload_WebElements.AddTimeSheetButtonInTimesSheetWindow);
        click(WarehouseOutload_WebElements.CloseButtonOnTimesSheetWindow);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        click(WarehouseOutload_WebElements.StaffImportToExpenseButton);
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));

    }

}
