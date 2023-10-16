package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;
public interface Operation_CV {

    By New_Operation_button = By.xpath("//ul[@id='newOperation']");
    By New_Operation_dropdown = By.xpath("//ul[@id='newOperation']/li");
    By Pickup_button = By.xpath("//li[@trans-type='Enum.TransactionType.Pickup']");
    By Delivery_button = By.xpath("//li[@trans-type='Enum.TransactionType.Delivery']");
    By PickupFromTerminal_button=By.xpath("//li[@trans-type='Enum.TransactionType.PickupFromTerminal']");
    By DeliveryToTerminal_button=By.xpath("//li[@trans-type='Enum.TransactionType.DeliveryToTerminal']");
    By WarehouseReceiveIn_button=By.xpath("//*[@id=\"newOperation_mn_active\"]//div/ul/li[@trans-type='Enum.TransactionType.WarehouseReceiveIn']");
    By WarehouseOutload_button=By.xpath("//*[@id=\"newOperation_mn_active\"]//div/ul/li[@trans-type='Enum.TransactionType.WarehouseOutload']");
    By BoxDelivery_button=By.xpath("//*[@id=\"newOperation_mn_active\"]//div/ul/li[@trans-type='Enum.TransactionType.BoxDelivery']");
    By Relo_button=By.xpath("//li[@trans-type='Enum.TransactionType.Relo']");

    By HomeButtonOnJobMenu= By.xpath("//a[@class='job-menu__item small-font']");

}
//*[@id="newOperation_mn_active"]//div/ul/li[@trans-type='Enum.TransactionType.BoxDelivery']