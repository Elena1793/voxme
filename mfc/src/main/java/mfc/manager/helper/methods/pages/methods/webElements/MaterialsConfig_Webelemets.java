package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;
public interface MaterialsConfig_Webelemets {
    By AddMaterials_button=By.xpath("//button[@id='materialsAdd']");
    By MaterialsTypeField=By.xpath("//tr[@class='k-grid-edit-row']//input[@id='Type']");
    By CostMaterialsField=By.xpath("//*[@data-container-for='Cost']/span[@class='k-widget k-numerictextbox']");
    By WidthMaterialsField=By.xpath("//*[@data-container-for='ExtWidth']/span[@class='k-widget k-numerictextbox']");
    By LengthMaterialsField=By.xpath("//*[@data-container-for='ExtLength']/span[@class='k-widget k-numerictextbox']");
    By HeightMaterialsField=By.xpath("//*[@data-container-for='ExtHeight']/span[@class='k-widget k-numerictextbox']");
    By VolumeMaterialsField=By.xpath("//*[@data-container-for='Volume']/span[@class='k-widget k-numerictextbox']");
    By IsPackingType_checkbox=By.xpath("//tbody//..//label[@for=\"IsPackingType\"]");//
    By saveCreatedMaterials_button=By.xpath("//button[@id='materialsTick']");
    By IsCrate_checkbox=By.xpath("//tbody//..//label[@for=\"IsCrate\"]");
    By AssociatedMaterials_buttonsGroup=By.xpath("//div[@class='col-lg-6 end-xs']//span[@class='btn-group']");
    By AddAssociatedMaterials_button=By.xpath("//button[@id='associatedAdd']");
    By MaterialsDropdown_Button_InAssociatedMaterialsGrid =By.xpath("//tbody//..//span[@aria-owns=\"MaterialId_listbox\"]");////span[@class='k-widget k-dropdown k-header']//span[@class='k-select']
    By MaterialsDropdown_List_InAssociatedMaterialsGrid=By.xpath("//ul[@id='MaterialId_listbox']/li");
    By QuantityForAssociatedMaterialField=By.xpath("//*[@data-container-for='Qty']/span[@class='k-widget k-numerictextbox']");
    By saveAddedAssociatedMaterial_button=By.xpath("//button[@id='associatedTick']");
}
