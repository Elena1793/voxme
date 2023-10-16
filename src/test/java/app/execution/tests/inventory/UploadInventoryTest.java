package app.execution.tests.inventory;

import app.execution.configs.configINV;
import org.testng.annotations.Test;

public class UploadInventoryTest implements configINV {
 String nameOfPiece = "Cabinet";
 String inventory = "10949-8-4";
    @Test
    public void uploadInventoryFromMFC() throws InterruptedException {
        appInv.getBasicMethods().click_DownloadInventory_button();
        appInv.getBasicMethods().type_value_inDiscoveryField(inventory);
        appInv.getBasicMethods().select_FoundedTransaction_inTheDownloadJobGrid();
        appInv.getBasicMethods().click_Download_button_onTheDownloadJobScreen();
        appInv.getBasicMethods().click_CubeSheet_button_onTheInventoriesScreen();
        Thread.sleep(4000);
        appInv.getBasicMethods().clickOnTheAddPieceButton();
        appInv.getBasicMethods().selectLocationForTheNewPiece();
        appInv.getBasicMethods().selectPackageForNewPiece();
        appInv.getBasicMethods().selectPBOForNewPiece();
        appInv.getBasicMethods().swipeScreenDown();
        appInv.getBasicMethods().addItemIntoNewPiece(nameOfPiece);
        appInv.getBasicMethods().click_Item_OnPackageScreen_toOpenItemDetailsScreen();
        appInv.getBasicMethods().changeTypeOfNewItem();
        appInv.getBasicMethods().addConditionToTheNewItem();
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().addCommentToTheNewItem();
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().attachPhotoFromGallery();
        appInv.getBasicMethods().attachPhotoFromCamera();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().swipeScreenToTheLeft();
        appInv.getBasicMethods().select_Room_withItem_inRoomsGrid_onRoomsScreen();
        appInv.getBasicMethods().click_InspectionInfo_button();
        appInv.getBasicMethods().fillDescriptionField();
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().fillConditionField();
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().attachPhotoFromGallery();
        appInv.getBasicMethods().attachPhotoFromCamera_RoomCondition();
        appInv.getBasicMethods().clickOnPropertyConditionsFieldAfterPacking();
        appInv.getBasicMethods().attachPhotoFromGallery();
        appInv.getBasicMethods().attachPhotoFromCamera_RoomCondition();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().swipeScreenToTheLeft();
        appInv.getBasicMethods().clickToAddSkidButton();
        appInv.getBasicMethods().attachPhotoFromGallery();
        appInv.getBasicMethods().attachPhotoFromCamera_SkidDetails();
        appInv.getBasicMethods().clickToTheSkidContentButton();
        appInv.getBasicMethods().clickToTheLoadSkidButton();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickToTheSkidOKButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().swipeScreenDownMenu();
        appInv.getBasicMethods().clickOnTheSummaries();
        appInv.getBasicMethods().click_Packers_button_onNavigateMenu();
        appInv.getBasicMethods().click_SelectPacker_Button();
        appInv.getBasicMethods().select_Packer_FromPackerGrid();
        appInv.getBasicMethods().click_IsForeman_checkBox();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().click_CartonsSummary_onNavigateMenu();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().click_Appliances_onNavigateMenu();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().swipeScreenDownMenu();
        appInv.getBasicMethods().click_AdditionalServices_button_onNavigateMenu();
        appInv.getBasicMethods().click_AdditionalMaterials_button_onNavigateMenu();
        appInv.getBasicMethods().type_materialsQuantity_onAdditionalMaterialsScreen("Small carton");
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().click_Services_button_onNavigateMenu();
        appInv.getBasicMethods().click_GroupName_Service("Group3");
        appInv.getBasicMethods().attachPhotoFromCamera_Service();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().click_AdditionalInfo__button_onNavigateMenu();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().swipeScreenDownMenu();
        appInv.getBasicMethods().click_Documents_button_onNavigateMenu();
        appInv.getBasicMethods().clickOnTheAddDocumentButton();
        appInv.getBasicMethods().fillDocumentNameField();
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().attachPhotoToTheDocumentSectionFromGallery();
        Thread.sleep(2000);
        appInv.getBasicMethods().clickOnTheAddDocumentButton();
        appInv.getBasicMethods().fillDocumentNameField();
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().attachPhotoFromCamers_DocumentSection();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().clickToTheSignAndSendButton();
        appInv.getBasicMethods().clickOnTheClientShipperButton();
        appInv.getBasicMethods().drawSign();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickOnTheForemanDriverButton();
        appInv.getBasicMethods().drawSign();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().swipeScreenUp();
        appInv.getBasicMethods().clickOnSummaryButton();
        appInv.getBasicMethods().swipeScreenDown();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickOnTheUploadButton();
        appInv.getBasicMethods().clickOnTheOKButtonOnThePopUp();
        appInv.getBasicMethods().screenshot();
        appInv.getBasicMethods().clickToTheReturnUpButton();




    }
}
