package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.MainMenu_WebElements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import mfc.properties.globalData.ScreensURL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobGrid_Metods  extends BasisMetods {

    public JobGrid_Metods(WebDriver wd){
        super(wd);
    }

    public void clickOnRowInGrid(String row){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click(By.xpath("//tr["+row+"]/td[1]/a[1]"));
    }

    public String getClientFileNum1byClientName(String ClientName) {

        String JobRefFull=getJobRefNum1byClientName(ClientName);
        String[] JobReF = JobRefFull.split("-");
        return JobReF[0];
    }

    public String getJobRefNum1byClientName(String ClientName){
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
        click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        dropdownSelectElement("20",By.xpath("//div[@class='k-animation-container']//ul//li"));//div[@class='k-animation-container']//ul//li
        String JobRefFull=getExistText(By.xpath("//td[contains(text(),'"+ClientName+"')]//..//a"));//td[contains(text(),'test1558444103840 CHECK speed102')]//..//a
        return JobRefFull;
    }

    public void openJobByClientName(String ClientName){
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
//        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dropdownSelectElement("20",By.xpath("//div[@class='k-animation-container']//ul//li"));//div[@class='k-animation-container']//ul//li
        waitForElementByLeavingDOM(By.xpath("//div[@class='k-loading-image']"));
        click(By.xpath("//td[contains(text(),'"+ClientName+"')]//..//a"));

    }
}
