package app.execution.tests.inventory;

import app.execution.configs.configINV;
import org.testng.annotations.Test;

public class CheckInventoryTest implements configINV {

public String inventoryRef = "10941-1-1";
public String nameOfPiece = "Cabinet";
public String nameOfPiece2 = "Artificial";


    @Test
        public void checkingAndScanningInProcess() throws InterruptedException {
        appInv.getBasicMethods().click_DownloadInventory_button();
        appInv.getBasicMethods().type_value_inDiscoveryField(inventoryRef);
        appInv.getBasicMethods().select_FoundedTransaction_inTheDownloadJobGrid();
        appInv.getBasicMethods().click_Download_button_onTheDownloadJobScreen();
        appInv.getBasicMethods().click_CubeSheet_button_onTheInventoriesScreen();
        Thread.sleep(2000);
        appInv.getBasicMethods().clickOnTheAddPieceButton();
        appInv.getBasicMethods().selectLocationForTheNewPiece();
        appInv.getBasicMethods().swipeScreenDown();
        appInv.getBasicMethods().addItemIntoNewPiece(nameOfPiece);
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickOnTheAddPieceButton();
        appInv.getBasicMethods().selectLocationForTheNewPiece();
        appInv.getBasicMethods().swipeScreenDown();
        appInv.getBasicMethods().addItemIntoNewPiece2(nameOfPiece2);
        appInv.getBasicMethods().swipeScreenToTheRight();
        appInv.getBasicMethods().click_NavigateMenu_button();
        appInv.getBasicMethods().click_BackToJobList_button_onNavigateMenu();
        appInv.getBasicMethods().clickOnTheCheckButtonOnTheDiscovery();
        appInv.getBasicMethods().closeTheScanLoosePiecesPopup();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        Thread.sleep(2000);
        appInv.getBasicMethods().click_CubeSheet_button_onTheInventoriesScreen();
        appInv.getBasicMethods().goToTheTruckIconToCreateLU();
        appInv.getBasicMethods().clickToAddSkidButton();
        appInv.getBasicMethods().clickOnTheSelectSkidDropDown();
        appInv.getBasicMethods().swipeSkidScreenUp();
        appInv.getBasicMethods().selectContainer();
        appInv.getBasicMethods().clickToTheSkidOKButton();
        appInv.getBasicMethods().clickToAddSkidButton();
        appInv.getBasicMethods().clickOnTheSelectSkidDropDown();
        appInv.getBasicMethods().selectLiftvan();
        appInv.getBasicMethods().clickToTheSkidOKButton();
        appInv.getBasicMethods().clickOnTheDeviceReturnButton();
        appInv.getBasicMethods().clickOnTheCheckButtonOnTheDiscovery();
        appInv.getBasicMethods().typeNewBarcodeNumber("1");
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().clickOnTheCheckButton();
        appInv.getBasicMethods().selectLUFromDropDown();
        appInv.getBasicMethods().clickOnTheSelectedSkidInTheDropDownContainer();
        appInv.getBasicMethods().clickOnTheOKLabelButtonSkid();
        appInv.getBasicMethods().typeNewBarcodeNumber("2");
        appInv.getBasicMethods().hideKeyboard();
        appInv.getBasicMethods().clickOnTheCheckButton();
        appInv.getBasicMethods().selectLUFromDropDown();
        appInv.getBasicMethods().clickOnTheSelectedSkidInTheDropDownLiftvan();
        appInv.getBasicMethods().clickOnTheOKLabelButtonSkid();
        appInv.getBasicMethods().closePopupIfPresent();
        appInv.getBasicMethods().clickOnTheReportInventoryButton();
        appInv.getBasicMethods().swipeScreenDown();
        appInv.getBasicMethods().clickOnTheClientShipperButton();
        appInv.getBasicMethods().createSingnature2();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().clickOnTheForemanDriverButton();
        appInv.getBasicMethods().createSingnature2();
        appInv.getBasicMethods().clickToTheReturnUpButton();
        appInv.getBasicMethods().swipeScreenUp();
        appInv.getBasicMethods().clickOnTheUploadButton();
        appInv.getBasicMethods().clickOnTheOKButtonOnThePopUp();
        appInv.getBasicMethods().screenshot();
        appInv.getBasicMethods().clickToTheReturnUpButton();


    }
}
