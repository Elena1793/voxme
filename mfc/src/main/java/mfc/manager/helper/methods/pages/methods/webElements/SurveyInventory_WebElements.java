package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;
public interface SurveyInventory_WebElements {

    By ModeDropdown_button = By.xpath("//span[@aria-owns='modeHead_listbox']");
    By ModeDropdown_list = By.xpath("//ul[@id='modeHead_listbox']/li");
    By RoomDropdown_button = By.xpath("//span[@aria-owns='roomHead_listbox']");
    By RoomDropdown_List = By.xpath("//ul[@id='roomHead_listbox']/li");
    By AddStandartItem_button =By.xpath("//div[@id='ItemsSection]//button[@id='addStandardItem']");
    By AddItemsGrid_ItemsColumn=By.xpath("//div[@id='addItemsGrid']//tbody//tr//td[3]");
    By SaveButton_onAddItemModalWindow = By.xpath("//button[@id='saveAddGrid']");
    By PackTypeForItemDropdown_button=By.xpath("//*[@aria-owns='surveyItemPackingType_listbox']");
    By PackTypeForItemDropdown_List=By.xpath("//div[@id='surveyItemPackingType-list']//ul/li");
    By AttachPhotoForItem = By.xpath("//input[@id='surveyItemUpload']");
    By CancelButton_onAddItemModalWindow=By.xpath("//button[@id='cancelAddGrid']");
    By CheckboxPBO= By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/*");
   // By CheckboxPBO_value=By.xpath("//input[@type='checkbox' and @id='pbo']");
   By CheckboxPBO_value=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/*");
    By CheckboxBOXRequired=By.xpath("//label[@for='boxRequired']");
    By CheckboxBOXRequired_value=By.xpath("//input[@type='checkbox' and @id='boxRequired']");
    By CheckboxCrateRequired = By.xpath("//label[@for='crateRequired']");
    By CheckboxCrateRequired_value=By.xpath("//input[@type='checkbox' and @id='crateRequired']");
    By CheckboxDismantle =By.xpath("//label[@for='dismantle']");
    By CheckboxDismantle_value=By.xpath("//input[@type='checkbox' and @id='dismantle']");
    By CheckboxNotGoing =By.xpath("//label[@for='notGoing']");
    By CheckboxNotGoing_value=By.xpath("//input[@type='checkbox' and @id='notGoing']");
}
