package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;
public interface MainMenu_WebElements {

    By Management_button = By.xpath("//a[@href=\"/Management\"]");//By.linkText("Management");
    By Jobs_button = By.xpath("//a[@href=\"/Job/Grid\"]");/// By.linkText("Jobs");
    By Daily_Agenda_button = By.xpath("//a[@href=\"/DailyAgenda\"]");//By.linkText("Daily Agenda");
    By TasksJob_button = By.xpath("//a[@href=\"/Task/Grid\"]");//By.linkText("Tasks");
    By Shipments_button = By.xpath("//a[@href=\"/Shipment/Grid\"]");//By.linkText("Shipments");
    By Quotations_button = By.xpath("//a[@href=\"/Quotation/Grid\"]");//By.linkText("Quotations");
    By Operations_button = By.xpath("//a[@href=\"/Transaction/Grid\"]");//By.linkText("Operations");
    By Warehouse_button = By.xpath("//a[@href=\"/Warehouse/Warehouse\"]");//By.linkText("Warehouse");
    By CRM_button = By.xpath("//a[@href=\"/CRM\"]");//By.linkText("CRM");
    By Financials_button = By.xpath("//a[@href=\"/Financials\"]");//By.linkText("Financials");
    By Surveys_button = By.xpath("//a[@href=\"/Survey/Grid\"]");//By.linkText("Surveys");

    By MainMenu_List = By.xpath("//*[@class='menu-main']");
    }





