package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.MaterialsConfig_Webelemets;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import mfc.manager.helper.methods.menu.methods.ManagementMenu_Metods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Lena on 18.11.2019.
 */
public class MaterialsConfig_Methods extends BasisMetods {
    public MaterialsConfig_Methods(WebDriver wd) {
        super(wd);
    }
    public void createNewMaterials_PakingType(String materialsPackType, float cost, float width, float length ,float height, float volume){
        clickOnAddMaterials_button();
        enterMaterialsType(materialsPackType);
        enterCostMaterials(cost);
        enterWidthMaterials(width);
        enterLengthMaterials(length);
        enterHeightMaterials(height);
        enterVolumeMaterials(volume);
        trueIsPackingType_checkbox();
        waitForElementByNOTvisibility(By.id("page-preloader"));
        saveCreatedMaterials();
        waitForElementByNOTvisibility(By.id("page-preloader"));
    }
    public void createNewMaterials_CRATE(String materialsCrate, float cost, float width, float length ,float height, float volume){
        clickOnAddMaterials_button();
        enterMaterialsType(materialsCrate);
        enterCostMaterials(cost);
        enterWidthMaterials(width);
        enterLengthMaterials(length);
        enterHeightMaterials(height);
        enterVolumeMaterials(volume);
        trueIsCrate_checkbox();
        waitForElementByNOTvisibility(By.id("page-preloader"));
        saveCreatedMaterials();
        waitForElementByNOTvisibility(By.id("page-preloader"));
    }
    public void addAssociatedMaterials(String materialsPackType,String associatedMaterials_fromListOfMateria_NoPakingTypeNoCrate, int quantity){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        chooseMaterial_inMaterialsGrid(materialsPackType);
        clickOnAddAssociatedMaterials_button();
        selectMaterialIn_MaterialsDropdown_InAssociatedMaterialsGrid(associatedMaterials_fromListOfMateria_NoPakingTypeNoCrate);
        enterQuantityForAssociatedMaterial(quantity);
        saveAddedAssociatedMaterial_button();
    }
    public void createNewMaterials_NotPackTypeNotCrate(String associatedMaterials, float costAssociatedMaterials,
                                                       float widthAssociatedMaterials, float lengthAssociatedMaterials,
                                                       float heightAssociatedMaterials, float volumeAssociatedMaterials) {
        clickOnAddMaterials_button();
        enterMaterialsType(associatedMaterials);
        enterCostMaterials(costAssociatedMaterials);
        enterWidthMaterials(widthAssociatedMaterials);
        enterLengthMaterials(lengthAssociatedMaterials);
        enterHeightMaterials(heightAssociatedMaterials);
        enterVolumeMaterials(volumeAssociatedMaterials);
        waitForElementByNOTvisibility(By.id("page-preloader"));
        saveCreatedMaterials();
        waitForElementByNOTvisibility(By.id("page-preloader"));
    }

    public void clickOnAddMaterials_button(){
        new ManagementMenu_Metods(wd).MaterialsScreen_Open();
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(MaterialsConfig_Webelemets.AddMaterials_button);
    }

    public void enterMaterialsType(String materialsPackType){
        waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        waitForElementByVisibility(By.xpath("//tr[@class='k-grid-edit-row']"));
        type(MaterialsConfig_Webelemets.MaterialsTypeField,materialsPackType);

    }
    public void enterCostMaterials(float cost){
        type(MaterialsConfig_Webelemets.CostMaterialsField, String.valueOf(cost));
    }
    public void enterWidthMaterials(float width){
        type(MaterialsConfig_Webelemets.WidthMaterialsField, String.valueOf(width));
    }
    public void enterLengthMaterials(float length){
        type(MaterialsConfig_Webelemets.LengthMaterialsField, String.valueOf(length));
    }
    public void enterHeightMaterials(float height){
        type(MaterialsConfig_Webelemets.HeightMaterialsField, String.valueOf(height));
    }
    public void enterVolumeMaterials(float volume){
        type(MaterialsConfig_Webelemets.VolumeMaterialsField, String.valueOf(volume));
    }
    public void trueIsPackingType_checkbox(){
      //  click(MaterialsConfig_Webelemets.IsPackingType_checkbox);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/div[1]"));
       element.click();
    }
    public void saveCreatedMaterials(){
        click(MaterialsConfig_Webelemets.saveCreatedMaterials_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));
    }
    public void trueIsCrate_checkbox(){
       // click_17_03_2022(MaterialsConfig_Webelemets.IsCrate_checkbox);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[9]/div[1]"));
        element.click();
    }
    public void chooseMaterial_inMaterialsGrid(String materialsPackType){
        new ManagementMenu_Metods(wd).MaterialsScreen_Open();
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(By.xpath("//div[@id='materialsGrid']//div[@class='k-grid-content k-auto-scrollable']//tr//td[contains(text(),'"+materialsPackType+"')]"));
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
    }
    public void clickOnAddAssociatedMaterials_button(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(MaterialsConfig_Webelemets.AddAssociatedMaterials_button);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void selectMaterialIn_MaterialsDropdown_InAssociatedMaterialsGrid(String associatedMaterials_fromListOfMateria_NoPakingTypeNoCrate){
        //waitForElementByVisibility(By.xpath("//tr[@class='k-grid-edit-row']"));
        click(MaterialsConfig_Webelemets.MaterialsDropdown_Button_InAssociatedMaterialsGrid);
        dropdownSelectElement(associatedMaterials_fromListOfMateria_NoPakingTypeNoCrate,MaterialsConfig_Webelemets.MaterialsDropdown_List_InAssociatedMaterialsGrid);
    }
    public void enterQuantityForAssociatedMaterial(int quantity){
        type(MaterialsConfig_Webelemets.QuantityForAssociatedMaterialField, String.valueOf(quantity));
    }
    public void saveAddedAssociatedMaterial_button(){
        click(MaterialsConfig_Webelemets.saveAddedAssociatedMaterial_button);
    }


}
