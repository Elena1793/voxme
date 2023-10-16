package app.execution.tests.inventory;

import app.execution.configs.configINV;
import org.testng.annotations.Test;

public class DownloadInventoryTest implements configINV {
  String inventoryRef = "10949-8-6";
  
    @Test
    public void downloadInventoryFromMFC() throws InterruptedException {

      appInv.getBasicMethods().click_DownloadInventory_button();
      appInv.getBasicMethods().type_value_inDiscoveryField(inventoryRef);
      appInv.getBasicMethods().select_FoundedTransaction_inTheDownloadJobGrid();
      appInv.getBasicMethods().click_Download_button_onTheDownloadJobScreen();
      appInv.getBasicMethods().click_CubeSheet_button_onTheInventoriesScreen();
      appInv.getBasicMethods().select_Item_OnInventoryScreen();
      appInv.getBasicMethods().click_Item_OnPackageScreen_toOpenItemDetailsScreen();
      appInv.getBasicMethods().click_iConPhoto();
      appInv.getBasicMethods().download_AttachedPhoto();
      appInv.getBasicMethods().click_Return_button_FromViewPhoto();
      appInv.getBasicMethods().click_Return_button_FromLabelDetails();
      appInv.getBasicMethods().click_Return_button_FromPackageDetails();
      appInv.getBasicMethods().click_NavigateMenu_button();
      appInv.getBasicMethods().click_GeneralInfo_button_onNavigateMenu();
      appInv.getBasicMethods().swipe_Down_onTheGeneralInfoScreen();
      appInv.getBasicMethods().swipe_To_OriginDetailsScreen();
      appInv.getBasicMethods().swipe_Down_onTheOriginDetailsScreen();
      appInv.getBasicMethods().swipe_To_DestinationDetailsScreen();
      appInv.getBasicMethods().swipe_Down_onTheDestinationDetailsScreen();
      appInv.getBasicMethods().click_NavigateMenu_button();
      appInv.getBasicMethods().click_InventoryList_onNavigateMenu();
      appInv.getBasicMethods().swipe_To_RoomsScreen();
      appInv.getBasicMethods().select_Room_withItem_inRoomsGrid_onRoomsScreen();
      appInv.getBasicMethods().click_InspectionInfo_button();
      appInv.getBasicMethods().click_iConPhoto();
      appInv.getBasicMethods().download_AttachedPhoto();
      appInv.getBasicMethods().click_Return_button_FromViewPhoto();
      appInv.getBasicMethods().click_AfterPacking_tab_RoomCondition();
      appInv.getBasicMethods().click_iConPhoto();
      appInv.getBasicMethods().download_AttachedPhoto();
      appInv.getBasicMethods().click_Return_button_FromViewPhoto();
      appInv.getBasicMethods().click_Return_button_FromInspectionCondition();
      appInv.getBasicMethods().click_Return_button_FromRoomDetails();
      appInv.getBasicMethods().click_NavigateMenu_button();
      appInv.getBasicMethods().click_Summaries_button_onNavigateMenu();
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
      appInv.getBasicMethods().click_AdditionalServices_button_onNavigateMenu();
      appInv.getBasicMethods().click_AdditionalMaterials_button_onNavigateMenu();
      appInv.getBasicMethods().clickToTheReturnUpButton();
      appInv.getBasicMethods().click_NavigateMenu_button();
      appInv.getBasicMethods().click_Services_button_onNavigateMenu();
      appInv.getBasicMethods().clickToTheReturnUpButton();
      appInv.getBasicMethods().click_NavigateMenu_button();
      appInv.getBasicMethods().click_AdditionalInfo__button_onNavigateMenu();
      appInv.getBasicMethods().clickToTheReturnUpButton();
      appInv.getBasicMethods().click_NavigateMenu_button();
      appInv.getBasicMethods().click_Documents_button_onNavigateMenu();
      appInv.getBasicMethods().clickToTheReturnUpButton();
      appInv.getBasicMethods().click_NavigateMenu_button();
      appInv.getBasicMethods().click_BackToJobList_button_onNavigateMenu();

    }
}
