package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;


/**
 * Created by user on 22.05.2018.
 */
public interface JobMenu_WebElements {

    By Job_Summary_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");//By.linkText("Summary");
    By Job_Tasks_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]");//By.linkText("Job Tasks");
    By Job_Documents_button =By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]"); //By.linkText("Documents");
    By Job_CommunicationHistory_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[4]");
    By Job_Surveys_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[5]");//By.xpath("//a[@key='ClientFileMenu_Survey_ClientFileGrid_GET_Menu.ClientFile.Surveys_']");//By.linkText("Surveys");
    By Job_Quotations_button =By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[6]");
    By Job_Shipments_button =By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[7]");
    By Job_Operations_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[8]");
    By Job_Inventory_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[9]");
    By Job_Expenses_button =By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[10]");
    By Job_Invoices_button =By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[11]");
    By Job_Warehouse_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[12]");
    By Job_SatisfactionSurvey_button = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[13]");
    By Job_Home_button = By.xpath("//*[@class='menu-client-file']//..//*[@class='client-file-menu-footer content-right']/a[@href='/Job/Grid']");//By.linkText("Home"); //a[@class='job-menu__item small-font']

    By Job_Menu_list = By.xpath("//*[@id='left-section']");//By.xpath("//*[@class='job-layout__menu']");


//ul[@id='newOperation']
}
