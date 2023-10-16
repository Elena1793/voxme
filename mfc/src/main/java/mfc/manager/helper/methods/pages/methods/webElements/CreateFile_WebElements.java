package mfc.manager.helper.methods.pages.methods.webElements;
import org.openqa.selenium.By;

/**
 * Created by user on 20.05.2018.
 */
public interface CreateFile_WebElements {
    By Private_button = By.xpath("//*[@id='createTabstrip']//li[@data-type='Enum.BookingType.Private']");
    By Source_dropdown_button = By.xpath("//*[@aria-owns='source_listbox']");
    By Source_dropdown_List = By.xpath("//ul[@id='source_listbox']/li");
    By JobType_dropdown = By.xpath("//*[@aria-owns='jobType_listbox']");
    By JobType_dropdown_List = By.xpath("//ul[@id='jobType_listbox']/li");
   // By FirstName_field = By.xpath("//*[@id='firstName_label']"); //@name='firstName_input'
    By FirstName_field = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/span[1]/span[1]/input[1]"); //@name='firstName_input'

    By LastName_field = By.id("lastName");///By.xpath("//*[@for='lastName']");
    By Email = By.id("email");
    By Phone = By.id("phone");
    By Create_button = By.id("createSubmitButton");




}
