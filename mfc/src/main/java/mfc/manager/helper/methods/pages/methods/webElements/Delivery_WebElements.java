package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;

/**
 * Created by Lena on 10.11.2019.
 */
public interface Delivery_WebElements {
    By AddStaff_button_StaffGrid =By.xpath("//button[@id='staffAdd']");
    By StaffDropdownField = By.xpath("//*[@id=\"addResourceWindow\"]//*[@class=\"k-multiselect-wrap k-floatwrap\"]");
    By StaffElementInStaffDropdown= By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']");


    By AddButtonOnAddStaffPopUp = By.xpath("//button[@id='addResource']");
    By StaffElementInStaffGrid=By.xpath("//*[@id=\"staffGrid\"]//*[@class=\"k-selectable\"]");
    By StaffTimeButtonOnStaffGrid = By.xpath("//button[@id='staffTime']");
    By AddTimeSheetButtonInTimesSheetWindow =By.xpath("//button[@id='timeSheetsAdd']");
    By CloseButtonOnTimesSheetWindow=By.xpath("//div[@class=\"k-widget k-window\"]//*[@id=\"timesheetWindow\"]//*[@class=\"popup__cancel_icon\"]");
    By StaffImportToExpenseButton= By.xpath("//button[@id='staffImportToExpense']");

    By AddVehicles_button_VehiclesGrid=By.xpath("//button[@id='vehiclesAdd']");
    By VehiclesDropdownField =By.xpath("//*[@id=\"addResourceWindow\"]//*[@class=\"k-multiselect-wrap k-floatwrap\"]");
    By VehicleElementInStaffDropdown=By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']");
    By AddButtonOnAddVehiclePopUp=By.xpath("//button[@id='addResource']");
    By VehicleElementInVehicleGrid=By.xpath("//*[@id=\"vehiclesGrid\"]//*[@class=\"k-selectable\"]");
    By VehicleTimeButtonOnVehiclesGrid=By.xpath("//button[@id='vehiclesTime']");
    By VehicleImportToExpenseButton=By.xpath("//button[@id='vehiclesImportToExpense']");

    By AddEquipment_button_InEquipmentGrid= By.xpath("//*[@id=\"equipmentAdd\"]");
    By EquipmentDropdownField= By.xpath("//*[@id=\"addResourceWindow\"]//*[@class=\"k-multiselect-wrap k-floatwrap\"]");
    By EquipmentElementInStaffDropdown=By.xpath("//ul[@id='resources_listbox']/li[@data-offset-index='0']");
    By AddButtonOnAddEquipmentPopUp=By.xpath("//button[@id='addResource']");
    By EquipmentElementInEquipmentsGrid=By.xpath("//*[@id=\"equipmentGrid\"]//*[@class=\"k-selectable\"]");
    By EquipmentTimeButtonOnEquipmentsGrid=By.xpath("//button[@id='equipmentTime']");
    By EquipmentImportToExpenseButton=By.xpath("//button[@id='equipmentImportToExpense']");
}
