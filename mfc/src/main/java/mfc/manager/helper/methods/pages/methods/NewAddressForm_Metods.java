package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.JobSummary_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.NewAddressForm_Webelements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Created by user on 04.11.2018.
 */
public class NewAddressForm_Metods extends BasisMetods {
    private String sectionFrom = "From";
    private String sectionTo = "To";

    public NewAddressForm_Metods(WebDriver wd){
        super(wd);
    }

    public void createNewAddtess(String section, String country, String city, String street1, String zip){

        if (section.equalsIgnoreCase(sectionFrom)){
           click(By.xpath("//*[@class='address__header address__from']//a[@class='address__button-create']"));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            click(By.xpath("//body/div[62]/div[2]/div[2]/div[3]/span[1]/span[1]/span[1]"));//popup__content
         //   click(JobSummary_WebElements.AddressCreateNew_button_FromSection);
            //click(By.xpath("//div[@class=\"new-place__details\"]/div[@class=\"input-group\"]//span[@class=\"k-input\"]"));
          //  type(By.xpath("//div[@id='65f80eae-47c5-482b-b439-544b377a42ee']//..//input"),"Israel");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            click(By.xpath("//li[contains(text(),'"+country+"')]"));
           // newOriginAddress_setCountry(country);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            type(By.xpath("//body/div[62]/div[2]/div[2]/div[6]/span[1]/input[1]"),"City1");
            type(By.xpath("//body/div[62]/div[2]/div[2]/div[7]/span[1]/input[1]"),"ZIP12345");
            type(By.xpath("//body/div[62]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]"),"Street");
            click(By.xpath("//body/div[62]/div[2]/div[3]/button[1]"));
           // newOriginAddress_setCity(city);
            //newOriginAddress_setZip(zip);
           // newOriginAddress_setStreet1(street1);
           // newOriginAddress_CreateButton();
        }
        if (section.equalsIgnoreCase(sectionTo)){
            click(JobSummary_WebElements.AddressCreateNew_button_ToSection);
            newDestinationAddress_setCountry(country);
            newDestinationAddress_setCity(city);
            newDestinationAddress_setZip(zip);
            newDestinationAddress_setStreet1(street1);
            newDestinationAddress_CreateButton();

        }

    }

    public void clickAddNewAddressButton_FromSection() {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(JobSummary_WebElements.AddressCreateNew_button_FromSection);
    }
    public void clickAddNewAddressButton_ToSection() {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(JobSummary_WebElements.AddressCreateNew_button_ToSection);
    }

    public void newOriginAddress_setCountry (String country){

        click(NewAddressForm_Webelements.CountrylistboxButton_From);
        type(NewAddressForm_Webelements.KeyboardDriven_Countrylistbox_From,country);
        click(By.xpath("//*[@class='k-item k-state-focused'][contains( text(), "+country+")]"));

    }

    public void newOriginAddress_setCity (String city){
        type(NewAddressForm_Webelements.city_From,city);

    }

    public void newOriginAddress_setStreet1 (String street1){
        type(NewAddressForm_Webelements.street1_From,street1);

    }

    public void newOriginAddress_setZip (String zip){
        type(NewAddressForm_Webelements.zip_From,zip);

    }

    public void newOriginAddress_CreateButton (){
        click(By.cssSelector("#from-newPlaceStreet2"));
       // click(NewAddressForm_Webelements.footerAddressForm_From);
        click(NewAddressForm_Webelements.createButton_From);
    }

    public void newDestinationAddress_setCountry (String country){
        click(NewAddressForm_Webelements.CountrylistboxButton_To);
        type(NewAddressForm_Webelements.KeyboardDriven_Countrylistbox_To,country);
        click(By.xpath("//*[@class='k-item k-state-focused'][contains( text(),'"+country+"')]"));

    }
    public void newDestinationAddress_setCity (String city){
        type(NewAddressForm_Webelements.city_To,city);

    }

    public void newDestinationAddress_setStreet1 (String street1){
        type(NewAddressForm_Webelements.street1_To,street1);

    }

    public void newDestinationAddress_setZip (String zip){
        type(NewAddressForm_Webelements.zip_To,zip);

    }

    public void newDestinationAddress_CreateButton (){
        click(By.cssSelector("#to-newPlaceStreet2"));
       // click(NewAddressForm_Webelements.footerAddressForm_To);
        click(NewAddressForm_Webelements.createButton_To);

    }


}
