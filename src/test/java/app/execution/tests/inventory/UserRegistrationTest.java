package app.execution.tests.inventory;

import app.execution.configs.configINV;
import org.testng.annotations.Test;

public class UserRegistrationTest implements configINV {

   public String companyId = "mfctestinv";
   public String companyName = "voxme";
   public String companyWebsite = "www.voxme.com";
   public String companyTel = "01432272274";
   public String userName = "alisa";
   public String companyEmail = "support@voxme.com";

    @Test
        public void newUserRegistration() throws InterruptedException {
           appInv.getBasicMethods().clickOnRegisterButton();
           appInv.getBasicMethods().clickOnDontHaveASettinsCode();
           appInv.getBasicMethods().typeCompanyID(companyId);
           appInv.getBasicMethods().typeCompanyName(companyName);
           appInv.getBasicMethods().typeCompanyWebsite(companyWebsite);
           appInv.getBasicMethods().typeCompanyTel(companyTel);
           appInv.getBasicMethods().typeRegistrationUserName(userName);
           appInv.getBasicMethods().typeInventoryReturnEmail(companyEmail);
           appInv.getBasicMethods().hideKeyboard();
           appInv.getBasicMethods().clickOnTheLanguageDropdown();
           appInv.getBasicMethods().selectLanguage();
           appInv.getBasicMethods().selectUnits();
           appInv.getBasicMethods().swipeScreenDown();
           appInv.getBasicMethods().clickOnTheActivateServiceButton();
           appInv.getBasicMethods().clickOnTheOKButtonOnThePopUp();
           appInv.getBasicMethods().clickOnCheckregistrationButton();
           appInv.getBasicMethods().clickOnTheOKButtonOnThePopUp();
           appInv.getBasicMethods().clickOnTheDeviceReturnButton();
           appInv.getBasicMethods().clickGrantAccessLocationOKbutton();
           appInv.getBasicMethods().ChoosePermitionLocation();

       appInv.getBasicMethods().clickOnSettingsStupPic();
       appInv.getBasicMethods().clickOnSettingsPopup();
       if(appInv.isPhone==false){
          appInv.getBasicMethods().click_Ok_button_onTheAllert();
       }
       appInv.getBasicMethods().clickOnConfigurations();
       appInv.getBasicMethods().downloadSettings();
       appInv.getBasicMethods().clickOnTheOKButtonOnThePopUp();
       if(appInv.isPhone) {
          appInv.getBasicMethods().clickToTheReturnUpButton();
       }
       appInv.getBasicMethods().clickOnTheVoxmeCloud();
       if(appInv.isPhone) {
          appInv.getBasicMethods().clickToTheReturnUpButton();
       }
       appInv.getBasicMethods().clickOnConfigurations();
       appInv.getBasicMethods().downloadConfigurations();
       appInv.getBasicMethods().closeTheWarningPopup();
       appInv.getBasicMethods().clickOnTheOKButtonOnThePopUp();
       if(appInv.isPhone){
          appInv.getBasicMethods().clickToTheReturnUpButton();
       }
       appInv.getBasicMethods().clickOnTheVoxmeCloud();
       appInv.getBasicMethods().clickToTheReturnUpButton();
       Thread.sleep(1000);
       if(appInv.isPhone){
          appInv.getBasicMethods().checkingVoxmeCloudForDev();
       }

    }

}
