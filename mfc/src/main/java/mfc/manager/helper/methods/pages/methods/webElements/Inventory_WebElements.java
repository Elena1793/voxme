package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;

/**
 * Created by Lena on 20.02.2020.
 */
public interface Inventory_WebElements {
    By initializeInventory_button= By.xpath("//button[@id='initializeInventory']");
    By roomsColuomnInTableRoomCodition1=By.xpath("//*[@id=\"roomsGrid\"]//tr//td[3]");
    By roomsColuomnInTableRoomCodition=By.xpath("//*[@id=\"roomsGrid\"]//tr[@data-uid]/td[3]");
    By createRoomCondition_button=By.xpath("//button[@id='createRoomConditions']");
    By note_roomDetails =By.xpath("//textarea[@id='roomNoteDetails']");
    By note_conditionBefore =By.xpath("//textarea[@id='conditionBeforeDescription']");
    By uploadButton_roomBefore=By.xpath("//*[@id='roomBeforeUpload']");
    By elementBefore_listbox_button=By.xpath("//*[@aria-owns=\"elementBefore_listbox\"]");
    By elementBefore_listbox_dropdown=By.xpath("//ul[@id='elementBefore_listbox']/li");
    By addElementBefore_buton = By.xpath("//button[@id='addElementBefore']");
    By uploadButton_roomElementBefore=By.xpath("//*[@id='roomElementBeforeUpload']");
    By note_conditionAfter=By.xpath("//textarea[@id='conditionAfterDescription']");
    By uploadButton_roomAfter=By.xpath("//*[@id='roomElementAfterUpload']");
    By roomElementBefore_fristElementFromDropdown = By.xpath("//*[@id=\"elementBefore_listbox\"]/li[1]");
    By uploadButton_roomAfter1 = By.xpath("//input[@id='roomAfterUpload']");
    By returnToJobFrid = By.xpath("//*[@class='menu-client-file']//..//*[@class='client-file-menu-footer content-right']/a[@href='/Job/Grid']");


}
