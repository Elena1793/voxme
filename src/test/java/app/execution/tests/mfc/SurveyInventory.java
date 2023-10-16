package app.execution.tests.mfc;
import app.execution.configs.configMFC;
import mfc.manager.data.execution.DataProviders;
import mfc.properties.entitiesProperties.Item;
import mfc.properties.globalData.ScreensURL;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.io.File;
import java.net.URISyntaxException;
import java.time.*;

import static mfc.manager.helper.methods.pages.methods.webElements.MainMenu_WebElements.Management_button;

/**
 * Created by Lena on 11.11.2019.
 */
public class SurveyInventory implements configMFC {
    LocalTime date = LocalTime.now();
   // int date=2323;
    public DataProviders.Materials existMaterialsPackType;
    DataProviders.Materials existMaterialsPackType1;
    DataProviders.Materials existMaterialsCrate;
    DataProviders.Materials existMaterialsCrate1;
    DataProviders.Materials existAssociatedMaterials;
    DataProviders.Item existItem = new DataProviders.Item("Item", Item.Category.Other,5,6,
            Item.Room.Hallway1,Item.Application.Both, Item.UseFor.Both);
    DataProviders.Item existItemWithAssociatedMaterials = new DataProviders.Item("Item-AM",Item.Category.Other,7,8,
            Item.Room.Hallway1,Item.Application.Both,Item.UseFor.Both);

    /*DataProviders.Item existItem = new DataProviders.Item("Item", Item.Category.Other,5,6,
            Item.Application.Both, Item.UseFor.Both);
    DataProviders.Item existItemWithAssociatedMaterials = new DataProviders.Item("Item-AM",Item.Category.Other,7,8,
            Item.Application.Both,Item.UseFor.Both);*/
    @Test (priority=1,dataProviderClass = DataProviders.class,dataProvider = "createMaterialsConfig")
    public void precondition(By locatorlanguage,String name, DataProviders.Materials materialsPackType,
                             DataProviders.Materials materialsPackType1,DataProviders.Materials materialsCrate,
                             DataProviders.Materials materialsCrate1, DataProviders.Materials associatedMaterials)
    {
        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
        appMFC.getUserMenu_Metods().OpenPage(Management_button, ScreensURL.Iterators);
        appMFC.getManagementMenu_Metods().MaterialsScreen_Open();

        appMFC.getMaterialsConfig_Methods().createNewMaterials_PakingType(
                materialsPackType.getMaterialType(), materialsPackType.getCoast(),materialsPackType.getWidth(),
                materialsPackType.getLength(), materialsPackType.getHeight(), materialsPackType.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_PakingType(
                materialsPackType1.getMaterialType(), materialsPackType1.getCoast(),materialsPackType1.getWidth(),
                materialsPackType1.getLength(),materialsPackType1.getHeight(),materialsPackType1.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_NotPackTypeNotCrate(
                associatedMaterials.getMaterialType(), associatedMaterials.getCoast(),associatedMaterials.getWidth(),
                associatedMaterials.getLength(),associatedMaterials.getHeight(),associatedMaterials.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_CRATE(
                materialsCrate.getMaterialType(), materialsCrate.getCoast(), materialsCrate.getWidth(),
                materialsCrate.getLength(),materialsCrate.getHeight(),materialsCrate.getVolume());

        appMFC.getMaterialsConfig_Methods().createNewMaterials_CRATE(
                materialsCrate1.getMaterialType(),materialsCrate1.getCoast(),materialsCrate1.getWidth(),
                materialsCrate1.getLength(),materialsCrate1.getHeight(),materialsCrate1.getVolume());

        appMFC.getMaterialsConfig_Methods().addAssociatedMaterials(
                materialsPackType.getMaterialType(), associatedMaterials.getMaterialType(), associatedMaterials.getQuantity());
        existMaterialsPackType=materialsPackType;
        existMaterialsPackType1=materialsPackType1;
        existMaterialsCrate=materialsCrate;
        existMaterialsCrate1=materialsCrate1;
        existAssociatedMaterials=associatedMaterials;

        appMFC.getManagementMenu_Metods().ItemsScreen_Open();
        appMFC.getItemsConfig_Methods().createItem(existItem);
        appMFC.getItemsConfig_Methods().createItemWithAsssociatedMaterials(existItemWithAssociatedMaterials,
                associatedMaterials.getMaterialType(),associatedMaterials.getQuantity());

    }


  // @Test(priority=2,dataProviderClass = DataProviders.class, dataProvider = "createFileForNewClient")
  //@Test(priority=2,dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")
  @Test(priority=2,dependsOnMethods = { "precondition" },dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_new")
  //@Test(priority=2,dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_new")
    public void CreateSurvey_ForExistClientFile(By locatorlanguage, String bookingType, String source, String jobType,
                                                String mode, String serviceType, String serviceLevel,
                                                String firstName, String lastName, String email, String phone,
                                                String country1, String country2, String city1, String city2,
                                                String street1, String street2, String zip1, String zip2) throws URISyntaxException {

        appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);

        appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
       String ClientFileNum = appMFC.getJobSummary_Metods().getClientFileNum1byClientName(client);

        appMFC.getJobGrid_Metods().openJobByClientName(client);
        appMFC.getJobMenu_Metods().Job_SurveysScreen_Open();
        if(!appMFC.getSurvey_Metods().isElementPresent(By.xpath("//table[@data-role=\"selectable\"]//tr"))){
            appMFC.getSurvey_Metods().click(By.xpath("//*[@id=\"newSurvey\"]"));
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            appMFC.getJobMenu_Metods().click(By.xpath("//*[contains(@href,\"/Survey/ClientFileGrid\")]"));
        }

       createSurveySA_fromSurveyCF();
       openJobsGrid_fromSurveySA();
       openSurveysScreenMV_viaSurveysButtonOnMVmenu();
       createSurveySA_viaCreateButton_onSurveysGrid(source, client);
       createTasks();
       createSurveyInventory();

       appMFC.getSurvey_Metods().ClickOn_ModeDropdown();
        appMFC.getSurvey_Metods().SelectModeFromDropdown(mode);
        appMFC.getSurvey_Metods().ClickOn_RoomDropdown();
        appMFC.getSurvey_Metods().SelectRoomFromDropdown(existItem.getRoom());
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       //appMFC.getSurvey_Metods().ClickOn_AddStandartItems();
        appMFC.getSurvey_Metods().click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]//button[2]"));
        appMFC.getSurvey_Metods().waitForElementByNOTvisibility(By.xpath("/[@class='k-overlay']"));
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        appMFC.getSurvey_Metods().SetQtyForItem_onAddItemModalWindow(existItemWithAssociatedMaterials.getItemType(),2);
        appMFC.getSurvey_Metods().ClickOn_SaveButton_onAddItemModalWindow();
       System.out.println("existItem.getItemType()=" + existItem.getItemType());

       appMFC.getSurvey_Metods().click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]//button[2]"));

        appMFC.getSurvey_Metods().waitForElementByNOTvisibility(By.xpath("/[@class='k-overlay']"));
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        appMFC.getSurvey_Metods().SetQtyForItem_onAddItemModalWindow(existItemWithAssociatedMaterials.getItemType(),2);
        appMFC.getSurvey_Metods().ClickOn_SaveButton_onAddItemModalWindow();
       // System.out.println("existMaterialsPackType.getMaterialType()=" + existMaterialsPackType.getMaterialType());
        appMFC.getSurvey_Metods().SetPackTypeForItem(existMaterialsPackType.getMaterialType());

        File attachFile = new File("src/test/resources/item.png");
        appMFC.getSurvey_Metods().attachPhotoForItem(attachFile);
        try {
            Thread.sleep((long) 1500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    //    appMFC.getSurvey_Metods().checkboxPBOisTRUE();
       // appMFC.getSurvey_Metods().OpenPageByUrl("https://mfcdev.voxme.com/SurveyInventory/SurveyInventory?surveyId=3031");
     /*  selectRoomInTable_RoomConditionSection(existItem.getRoom());
       enterRoomNoteDetails("Details");
       clickOnCreateRommCondition();
       enterConditionBeforeDescription("before");
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("/[@id='roomBeforeUpload']"),attachBeforeRoom);
        appMFC.getSurvey_Metods().click(By.xpath("/[@aria-owns=\"elementBefore_listbox\"]"));
        appMFC.getSurvey_Metods().dropdownSelectElement("Walls",By.xpath("//ul[@id='elementBefore_listbox']/li"));
        appMFC.getSurvey_Metods().click(By.xpath("//button[@id='addElementBefore']"));
        appMFC.getSurvey_Metods().click(By.xpath("//div[@id='roomElementBeforeGrid']//td[contains(text(),'Walls')]"));
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("/[@id='roomElementBeforeUpload']"),roomElementBefore);
        appMFC.getSurvey_Metods().click(By.xpath("//textarea[@id='conditionAfterDescription']"));
        appMFC.getSurvey_Metods().type(By.xpath("//textarea[@id='conditionAfterDescription']"),"conditionAfterDescription");
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("//input[@id='roomAfterUpload']"),attachAfterRoom);

        appMFC.getSurvey_Metods().click(By.xpath("//div[@id='roomElementAfterGrid']//td[contains(text(),'Walls')]"));
        appMFC.getSurvey_Metods().attachFileByPath(By.xpath("/[@id='roomElementAfterUpload']"),roomElementAfter);

*/      BackToSurveyFromSurveyInventory(); //BackToSurveyFromSurveyInventory
        setClientFileNUMBER(ClientFileNum);

        openJobsGrid_fromSurveySA();

       //openJobsGrid_fromSurveyInventory();

   }

    private void openJobsGrid_fromSurveyInventory() {
        appMFC.getJobSummary_Metods().moveToElementAndClick(By.xpath("//*[@class='menu-client-file']//..//*[@class='client-file-menu-footer content-right']/a[@href='/Job/Grid']"));
    }

    private void setClientFileNUMBER(String clientFileNum) {
        appMFC.Quotation_metods().ClickOn_ClientFile_Field();
        appMFC.Quotation_metods().Select_ClientFile(clientFileNum);
    }

    private void BackToSurveyFromSurveyInventory() {
        appMFC.getSurvey_Metods().click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]"));
    }

    private void createSurveyInventory() {
        appMFC.getSurvey_Metods().click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/a[1]")); //sutveyIncenroty
    }

    private void createTasks() {
        appMFC.getJobSummary_Metods().click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]"));
        appMFC.getJobSummary_Metods().click_createNewTask();
        appMFC.getJobSummary_Metods().typeTask_title("TaskTitle");
        appMFC.getJobSummary_Metods().typeTask_description("TaskDescription");
        appMFC.getJobSummary_Metods().typeTask_nextStep("TaskNextStep");
        appMFC.getJobSummary_Metods().click(By.xpath("//*[@aria-owns='createOwnedBy_listbox']"));
        appMFC.getJobSummary_Metods().click(By.xpath("//ul[@id='createOwnedBy_listbox']/li[contains(text(), 'Serge Corbet')]"));
        appMFC.getJobSummary_Metods().clickOn_SaveTaskButton();
    }

    private void createSurveySA_viaCreateButton_onSurveysGrid(String source, String client) {
        appMFC.getJobSummary_Metods().click(By.xpath("//body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/button[1]")); //create survey

        appMFC.Quotation_metods().Select_source(source);
        appMFC.Quotation_metods().ClickOn_Client_Field();
        appMFC.Quotation_metods().Select_Client(client);
    }

    private void openSurveysScreenMV_viaSurveysButtonOnMVmenu() {
        appMFC.getJobSummary_Metods().click(By.xpath("//a[@href='/Survey/Grid']"));
    }

    private void openJobsGrid_fromSurveySA() {
        appMFC.getJobGrid_Metods().click(By.xpath("//a[@href='/Job/Grid']"));/*(By.xpath("//a[contains(text(),'Home')]"));*/
    }

    private void createSurveySA_fromSurveyCF() {
        appMFC.getSurvey_Metods().click(By.xpath("//tr//td[2]/a"));
        appMFC.Quotation_metods().ClickOn_JobRef_Field();
        appMFC.getSurvey_Metods().ClickOn_DeselectAll_JobRef_new();
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        appMFC.getSurvey_Metods().ClickOn_confirmToStandalone_button_new();
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }

    private void enterConditionBeforeDescription(String before) {
        appMFC.getSurvey_Metods().click(By.xpath("//textarea[@id='conditionBeforeDescription']"));
        appMFC.getSurvey_Metods().type(By.xpath("//textarea[@id='conditionBeforeDescription']"),"before");
    }

    private void clickOnCreateRommCondition() {
        appMFC.getSurvey_Metods().click(By.xpath("//button[@id='createRoomConditions']"));
        appMFC.getSurvey_Metods().waitForElementByLeavingDOM(By.id("spinner-roomDetails"));
    }

    private void enterRoomNoteDetails(String details) {
        appMFC.getSurvey_Metods().click(By.xpath("//textarea[@id='roomNoteDetails']"));
        appMFC.getSurvey_Metods().type(By.xpath("//textarea[@id='roomNoteDetails']"),"Details");
    }

    private void selectRoomInTable_RoomConditionSection(String room) {
        appMFC.getSurvey_Metods().click(By.xpath("//table[contains(@class,'js-rooms-content k-selectable')]//tr//td[contains(text(),'"+existItem.getRoom()+"')]"));
    }


}



