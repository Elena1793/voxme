package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.CreateFile_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.JobGrid_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.JobSummary_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.MainMenu_WebElements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateFile_Metods extends BasisMetods implements CreateFile_WebElements, JobSummary_WebElements, MainMenu_WebElements {


    public CreateFile_Metods(WebDriver wd) {
        super(wd);
    }

    public void CreateFile_NewClient(String source, String jobType, String mode, String serviceType, String serviceLevel,
                                     String firstName, String lastName,String email, String phone) {

        waitForElementByNOTvisibility(By.id("page-preloader"));
        //waitForElementByNOTvisibility(By.xpath("//*[@class=\"k-overlay\"]"));
        OpenPage(MainMenu_WebElements.Jobs_button);
       // waitForElementByVisibility(By.xpath("//div[@id='jobsGridAndFilters']//*[@class='js-filter']"));
        //[@class='k-loading-mask']
        //waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(JobGrid_WebElements.CreateCientFile_button); //button button-orange jobs__create k-button
        //click(By.xpath("//button[contains(text(),'Create File')]"));
       // click(CreateNewContactButton);
        click(Private_button);
        click(Source_dropdown_button);
        dropdownSelectElement(source, Source_dropdown_List);
        click(JobType_dropdown);
        dropdownSelectElement(jobType, JobType_dropdown_List);

        type(FirstName_field,firstName);
        click(By.cssSelector("#firstName_label"));
        type(LastName_field, lastName);
        type(Email, email);
        type(Phone, phone);
        click(Create_button);
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click(Mode_dropdown_button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dropdownSelectElement(mode,Mode_dropdown_List);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      //  click(ServiceType_dropdown_button);
        click(By.xpath("//*[@aria-owns=\"serviceType_listbox\"]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dropdownSelectElement(serviceType, ServiceType_dropdown_List);

        //click(ServiceLevel_dropdown_button);
        click(By.xpath("//*[@aria-owns=\"serviceLevel_listbox\"]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dropdownSelectElement(serviceLevel, ServiceLevel_dropdown_List);

//        waitForElementByNOTvisibility(Popup_wrapper);

    }

}
