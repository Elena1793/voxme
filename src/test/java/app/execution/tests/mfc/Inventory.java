package app.execution.tests.mfc;
import app.execution.configs.configMFC;
import mfc.manager.data.execution.DataProviders;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import java.io.File;

import static mfc.manager.helper.methods.pages.methods.webElements.Inventory_WebElements.*;

public class Inventory implements configMFC {


 //  @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient")

   @Test(priority=1,dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_new")
    public void createPackingInventory(By locatorlanguage, String bookingType, String source, String jobType, String mode, String serviceType,
                                       String serviceLevel, String firstName, String lastName, String email, String phone,
                                       String country1, String country2, String city1, String city2, String street1, String street2,
                                       String zip1, String zip2) throws InterruptedException {
       String item ="_Item";
       File attachFile = new File("src/test/resources/item.png");

       appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
       appMFC.getUserMenu_Metods(). waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
       appMFC.getMainMenu_Metods().Job_GridScreen_Open();
        String client = firstName + " " + lastName;
       appMFC.getJobGrid_Metods().openJobByClientName(client);
       appMFC.getJobMenu_Metods().Job_InventoryScreen_Open();
       appMFC.getInventory_Methods().clickOninitializeInventoryButton();
       appMFC.getInventory_Methods().addPiece();
       appMFC.getInventory_Methods().selectAddedPieces();
       appMFC.getInventory_Methods().inputItem(item);
       appMFC.getInventory_Methods().createCommentForItem(item,"Item comment");
       appMFC.getInventory_Methods().attachPhotoForItem(item);
       appMFC.getInventory_Methods().selectRoomInTable_RoomConditionSection();
       appMFC.getInventory_Methods().clickOnCreateRommCondition();
       appMFC.getInventory_Methods().enterRoomNoteDetails("Room Details_1");
       appMFC.getInventory_Methods().enterConditionBeforeDescription("before_1");
       appMFC.getInventory_Methods().attachFileByPath(uploadButton_roomBefore,attachFile);
       Thread.sleep(1500);
       appMFC.getInventory_Methods().addRoomElementBeforeCondition();
       appMFC.getInventory_Methods().attachPhotoElementBefore(attachFile);
       Thread.sleep(1500);
       appMFC.getInventory_Methods().enterConditionAfterDescription("conditionAfterDescription");
       appMFC.getInventory_Methods().attachFileByPath(uploadButton_roomAfter1,attachFile);
       appMFC.getInventory_Methods().attachPhotoElementAfter(attachFile);
       Thread.sleep(1000);
       appMFC.getInventory_Methods().moveToElementAndClick(returnToJobFrid);


   }


}
