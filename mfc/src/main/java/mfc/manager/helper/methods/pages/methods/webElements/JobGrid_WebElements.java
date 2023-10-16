package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;

/**
 * Created by user on 23.05.2019.
 */
public interface JobGrid_WebElements {
    By CreateNewContactButton = By.id("submitNewContact");

    By JobRef_field = By.xpath("//tr[1]/td[1]/a[1]");
    By CreateCientFile_button=By.xpath("//button[@class='button button-orange jobs__create k-button']");
}