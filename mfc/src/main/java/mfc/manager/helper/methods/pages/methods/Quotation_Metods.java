package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.base.methods.BasisMetods;;
import mfc.manager.helper.methods.pages.methods.webElements.*;
import mfc.properties.entitiesProperties.*;
import mfc.properties.globalData.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;


import java.lang.reflect.Method;
import java.util.List;


/**
 * Created by user on 15.07.2018.
 */
public class Quotation_Metods extends BasisMetods {
    Logger logger1 = LoggerFactory.getLogger(Quotation_Metods.class);
    @BeforeMethod
    public void logTestStart(Method m) {
        logger1.debug("Start test ++++++++" +"m.getName() :" +m.getName());

    }
    public Quotation_Metods(WebDriver wd) {

        super(wd);
    }

    public void CreateQuotationSA_BookingType_Private(String bookingType, String source, String client, String JobRef){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        OpenPage(MainMenu_WebElements.Quotations_button, ScreensURL.Quotation_Grid);
        click(QuotationGrid_WebElements.CreateQuotation_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));
        isPageOpened("Quotation");
        //  selectBookingType(bookingType);
        click(Booking_Webelements.BookingType_dropdown_button);//By.xpath("/[@aria-owns=\"bookingType_listbox\"]")
        dropdownSelectElement(bookingType,Booking_Webelements.BookingType_dropdown_List);

        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));

        if (bookingType== BookingType.Private){
            click(Booking_Webelements.BookedSource_button);
            waitForElementByNOTvisibility(By.id("page-preloader"));
            dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));

            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header")))); //ожидание пока элемент исчезнет из DOM

            click(By.xpath("//*[@id='client']"));
            type(By.xpath("//*[@id='client']"),client);
            dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));

            waitForElementByNOTvisibility(By.id("clientErrorWrapper"));
            click(By.xpath("//*[@aria-owns='clientFile_listbox']"));
            type(By.xpath("//*[@class='k-animation-container']//*[@class='k-textbox']"),JobRef);
            dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);

        }
        if (bookingType== BookingType.Agent || bookingType==BookingType.Move_management){
            click(By.xpath("//*[@id='booker']"));
            type(By.xpath("//*[@id='booker']"),"Moscow");
            dropdownSelectElement_withoutCheckingClickableElement("Moscow", By.xpath("//ul[@id='booker_listbox']//li"));
            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));

            click(By.xpath("//*[@id='client']"));
            type(By.xpath("//*[@id='client']"),client);
            dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));
        }
        if (bookingType == BookingType.Corporate || bookingType==BookingType.Corporate_competitive || bookingType==BookingType.Commercial){
            click(By.id("account"));
            type(By.id("account"),"ES_Account1" );
            dropdownSelectElement_withoutCheckingClickableElement("ES_Account1", By.xpath("//ul[@id='account_listbox']//li"));

            click(Booking_Webelements.BookedSource_button);
            waitForElementByNOTvisibility(By.id("page-preloader"));
            dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));

        }



    }


    public void ClickOn_CreateQutationSA_button(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(QuotationGrid_WebElements.CreateQuotation_button);
        waitForElementByNOTvisibility(By.id("page-preloader"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isPageOpened("Quotation/Details");
    }

    public void ClickOn_Client_Field(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     // if( isElementPresent(By.xpath("//*[@class='main__header descr row']/div[@class='block-wrapper' and @style='display: none;']"))){
          click(By.xpath("//input[@name='client_input']"));
    //  }
    }

    public void Select_Client(String client){
        type(By.xpath("//input[@name='client_input']"),client);
        click(By.xpath("//ul[@id='client_listbox']/li[contains(text(),'"+client+"')]"));

    }

    public void ClickOn_ClientFile_Field(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementByNOTvisibility(By.id("clientErrorWrapper"));
        click(By.xpath("//*[@aria-owns='clientFile_listbox']"));
    }

    public void Select_ClientFile(String JobRef){
        type(By.xpath("//*[@class='k-animation-container']//*[@class='k-textbox']"),JobRef);
       dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);
        //click(By.xpath("//li[contains(text(),'"+JobRef+"')]"));
    }

    public void ClickOn_JobRef_Field(){
      //  waitForElementByNOTvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      click(By.xpath("//div[@class='k-widget k-multiselect form__group__input client-file__job-multiselect k-multiselect-clearable']"));
    }
    public void ClickOn_DeselectAll_JobRef(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath("//div[@id='jobs-list']//..//*[@onclick=\"deselect('jobs', false)\"]"));
    }
    public void ClickOn_confirmToStandalone_button(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementByNOTvisibility(By.xpath("/[@//class=\"k-overlay\"]"));
        click(By.xpath("//button[@id='confirmToStandalone']"));
    }

    public void ClickOn_toStandaloneWindowClose(){
        waitForElementByNOTvisibility(By.xpath("/[@//class=\"k-overlay\"]"));//By.xpath("/[@//class=\"k-overlay\"]")
        click(SurveyDetails_WebElements.ToStandaloneWindowClose);//By.xpath("//a[@id='toStandaloneWindowClose']")
    }
    public void ReturnToJob_Grid(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        click_17_03_2022(JobMenu_WebElements.Job_Home_button);
        isPageOpened(ScreensURL.Job_Grid);
    }

    public void Select_source(String source){
        waitForElementByNOTvisibility(By.id("page-preloader"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(Booking_Webelements.BookedSource_button);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));
    }
    public void click_InitializeQuotation(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@id='js-initButton']"));
    }

    public void selectQuotTypeFromInitializeQuotation() {
        By popup=By.xpath("//div[@id='js-initButton']//*[@class=\"k-link k-menu-link\"]");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // List<WebElement> dropdown = getList_byLocator(By.xpath("//li[@class='k-item k-menu-item k-state-default reportButtonMenuItem']"));
        List<WebElement> dropdown = getList_byLocator(popup);
        if(dropdown.size()<2){
            dropdown.get(0).click();
        }else {
            dropdown.get(dropdown.size() - 1).click();
        }
    }

    public void createCost() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//button[@id='expenseAdd']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//td[@data-container-for='ServiceType']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//ul[@id='ServiceType_listbox']//li[2]"));


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By vendorDropDown=By.xpath("//ul[@id='VendorId_listbox']/li");
        By vendorDropdown_button=By.xpath("//*[@class=\"k-widget k-combobox k-combobox-clearable\"]//*[@aria-controls=\"VendorId_listbox\"]");
        click(vendorDropdown_button);
         List<WebElement> dropdown = getList_byLocator(vendorDropDown);
        if(dropdown.size()<2){
            dropdown.get(0).click();
        }else {
            dropdown.get(dropdown.size() - 1).click();
        }
        //type(By.xpath("//input[@name='VendorId_input']"),"Lena_agent"); //td[@data-container-for='VendorId']
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(By.xpath("//input[@id='Description']"),"description");
       // click(By.xpath("//*[@class='flex-box__title_header']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*//td[@data-container-for=\"Total\"]"));
       // click(By.xpath("//div[@class='k-grid-content edit-mode-on']/table[@class='k-selectable']/tbody/tr[@class='k-grid-edit-row k-state-selected']/td[8]/span[1]/span[1]"));
        type(By.xpath("//input[@id='Total']"),"1000");
        click(By.xpath("//div[@id='expenseGrid']//..//th[@data-field=\"ServiceType\"]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//button[@id='expenseTick']"));
    }

    public void fillTextArea_Description() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dubleClick(By.xpath("//textarea[@id='description']"));
        String text="1234567890\n" +
                "\n" +
                ";jf;sj;dsjv;ld;ldl\n" +
                "!@#$%^&*())+{}[]\\/|?~``\"\"'';:\"\"''\n" +
                "as;flsjdgldjghkhk:\n" +
                "дфодаофыдаод\n" +
                "ךלשילמהם'םחקכלכד\n" +
                "καλως ΗΡΘΑΤΕ\n" +
                "歡迎\n" +
                "Bienvenue\n" +
                "Geschäftstätigkeit\n" +
                "Витторе Кривелли или Витторио Кривелли (итал. Vittore Crivelli или итал. Vittorio Crivelli, " +
                "между 1435 и 1440 годами, Венеция, Венецианская республика — не позже апреля 1502 года, Фермо, " +
                "область Марке) — итальянский художник, младший брат венецианского художника Карло Кривелли, работал в " +
                "Далмации и провинциальных городах Центральной Италии, формально входивших в Папскую область.\n" +
                "\n" +
                "Длительное время искусствоведы рассматривали Витторе Кривелли как малозначимого представителя " +
                "венецианской школы живописи второй половины XV века только в связи с биографией и творчеством ";
        type(By.xpath("//textarea[@id='textInputWindowText']"),text);
        click(By.xpath("//button[@id='textInputWindowSubmit']"));

    }

    public void fillTextArea_ClientFeedback() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dubleClick(By.xpath("//textarea[@id='clientFeedback']"));
        String text="1234567890\n" +
        "\n" +
                ";jf;sj;dsjv;ld;ldl\n" +
                "!@#$%^&*())+{}[]\\/|?~``\"\"'';:\"\"''\n" +
                "as;flsjdgldjghkhk:\n" +
                "дфодаофыдаод\n" +
                "ךלשילמהם'םחקכלכד\n" +
                "καλως ΗΡΘΑΤΕ\n" +
                "歡迎\n" +
                "Bienvenue\n" +
                "Geschäftstätigkeit\n" +
                "Витторе Кривелли или Витторио Кривелли (итал. Vittore Crivelli или итал. Vittorio Crivelli, " +
                "между 1435 и 1440 годами, Венеция, Венецианская республика — не позже апреля 1502 года, Фермо, " +
                "область Марке) — итальянский художник, младший брат венецианского художника Карло Кривелли, работал в " +
                "Далмации и провинциальных городах Центральной Италии, формально входивших в Папскую область.\n" +
                "\n" +
                "Длительное время искусствоведы рассматривали Витторе Кривелли как малозначимого представителя " +
                "венецианской школы живописи второй половины XV века только в связи с биографией и творчеством ";
        type(By.xpath("//textarea[@id='textInputWindowText']"),text);
        click(By.xpath("//button[@id='textInputWindowSubmit']"));
    }

    public void click_Volume_And_Weight(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click_17_03_2022(By.xpath("//div[@class=\"row-flex row-flex-full\"]//..//*[@data-bind=\"click: shipmentTotals.openTotals\"]"));

    }

    public void fill_Shipment_Totals_Popup() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(By.xpath("//span[*[@id='VolumeNet']]"),"10");
        type(By.xpath("//span[*[@id='VolumeFurniture']]"),"15");
        type(By.xpath("//span[*[@id='VolumeCartons']]"),"20");
        type(By.xpath("//span[*[@id='VolumeGross']]"),"25");
        type(By.xpath("//span[*[@id='WeightNet']]"),"100");
        type(By.xpath("//span[*[@id='WeightGross']]"),"105");
        type(By.xpath("//span[*[@id='WeightChargeable']]"),"110");
        type(By.xpath("//span[*[@id='CostOfMaterials']]"),"300");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click_17_03_2022(By.xpath("//*[@id=\"shipmentTotalsModal\"]//..//button[@class=\"button button-submit k-button\"]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click_17_03_2022(By.xpath("//*[@id=\"shipmentTotalsModal\"]//..//*[@class=\"button button-cancel k-button\"]"));
        click_Volume_And_Weight();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click_17_03_2022(By.xpath("//*[@id=\"shipmentTotalsModal\"]//..//*[@class=\"button button-cancel k-button\"]"));
    }

    public void click_ExpenseREF() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click_17_03_2022(By.xpath("//div[@id='expenseGrid']//tbody/tr[1]/td[2]"));
    }

    public void click_TasksGeneration() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*[@class='task__panel__control-generate']"));
    }

    public void ckick_generateReport() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@id='reportButton']"));

        click(By.xpath("//li[starts-with(@class,'k-item k-menu-item k-state-default reportButtonMenuItem k-last')]"));

    }

    public void markCheckboxinDocumentSection() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath("//div[@id='documentsGrid']//div[contains(@class,'checkbox')]"));
    }

    public void click_ShareButton() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//ul[@id='shareButton']"));
    }

    public void click_Share_Email() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dropdownSelectElement_withoutCheckingClickableElement("Email",By.xpath("//ul[@id='shareButton']//li"));
        //click(By.xpath("//li[@id='share-send']//span[contains(@class,'k-link')][contains(text(),'Email')]"));
    }

    public void click_contactTo_SendEmail() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*[@aria-owns='contactTo_listbox']"));
    }

    public void select_contactTo_SendEmail(String contact) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> dropdown = getList_byLocator(By.xpath("//ul[@id='contactTo_listbox']//li"));
        for (int i = 0; i < dropdown.size(); i++) {
            if (dropdown.get(i).getText().startsWith(contact)) {
                dropdown.get(i).click();
                break;
            }
        }
    }

    public void click_sendTemplate_SendEmail() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*[@aria-owns='sendTemplate_listbox']"));
    }

    public void select_sendTemplate_SendEmail() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> dropdown = getList_byLocator(By.xpath("//ul[@id='sendTemplate_listbox']//li"));
        dropdown.get(dropdown.size()-1).click();
    }

    public void click_OK_SendEmail() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//button[@id='templateSendSubmit']"));
    }

    public void click_sendSubmit_SendPopup() {

        waitForElementByNOTvisibility(By.xpath("//*[@class=\"k-animation-container\"]//..//*[@id='chooseTemplateWindow']"));
 waitForElementByVisibility(By.xpath("//*[@class=\"k-animation-container\"]//..//*[@id='emailEditorWindow']"));


    /*        WebElement element=wd.findElement(By.xpath("/html[1]/body[1]/div[71]/div[2]/div[3]/div[1]/div[1]/div[6]/button[1]"));
        WebDriverWait wait = new WebDriverWait(wd, 120);
        ExpectedCondition<Boolean> elementIsClickable = arg0 -> {
            try {
                element.click();
                return true;
            } catch (Exception e) {
                return false;
            }
        };
        wait.until(elementIsClickable);*/
   // click(By.xpath("//*[@class='form__group form__group-auto form__group-vertical'][1]"));
       moveToElementAndClick(By.xpath("//*[@class='form__group form__group-auto form__group-vertical'][1]"));
    }

    public void click_emailSuccessSendClose() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*[@id=\"emailSuccessSend\"]//..//span[@class=\"popup__cancel_icon\"]"));
    }

    public void click_CreateSurveyFromQuot() {
        click_CreateButton();
        click(By.xpath("//li[@data-bind[contains(.,'convertToSurvey')]]"));    }

    private void click_CreateButton() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//ul[@id='convertTo']"));
    }


    public void click_CreateCF_FromQuot() {
        click_CreateButton();
        click(By.xpath("//li[@data-bind[contains(.,'convertToClientFile')]]"));    }

    public void click_CreateInvoice() {
        click_CreateButton();
        click(By.xpath("//li[@data-bind[contains(.,'convertToInvoice')]]"));    }

     public void click_QuotStatus(){
        // waitForElementByNOTvisibility(By.id("k-loading-image"));
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         click(By.xpath("//*[@aria-owns='status_listbox']"));
     }

    public void setStatus(String status) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath("//*[@aria-owns='status_listbox']"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//*[@aria-owns='status_listbox']"));
        click(By.xpath("//ul[@id=\"status_listbox\"]//span[contains(text(),'"+status+"')]"));


    }

    public void setQuotationStatus(String status){
         try {
             new WebDriverWait(wd, 300)
                .until(ExpectedConditions
                     .visibilityOfElementLocated(By.xpath("//span[@aria-owns=\"status_listbox\"][@aria-expanded=\"true\"]")));
             Select selectStatus= new Select(wd.findElement(By.xpath("//select[@id='status']")));
             selectStatus.selectByValue("Enum.Status.QuotationApproved");
         }catch (Exception e){
        System.out.println("Not selested"+e.getMessage());
         }
    }
}

























   /* private void selectBookingType(String bookingType){
        click(Booking_Webelements.BookingType_dropdown_button);//By.xpath("/*//*[@aria-owns=\"bookingType_listbox\"]")
        dropdownSelectElement(bookingType,Booking_Webelements.BookingType_dropdown_List);

    }

    private void selectSource (String source){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));

        click(Booking_Webelements.BookedSource_button);
        waitForElementBy_NOTvisibility(By.id("page-preloader"));
        dropdownSelectElement_withoutCheckingClickableElement(source, By.xpath("//ul[@id='source_listbox']//li"));
    }

    private void selectBooker (){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));
        click(By.xpath("/*//*[@id='booker']"));
        type(By.xpath("/*//*[@id='booker']"),ExistedData.booker);
        dropdownSelectElement_withoutCheckingClickableElement(ExistedData.booker, By.xpath("//ul[@id='booker_listbox']//li"));
    }

    private void selectAccount(){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-booking"))));
        click(By.id("account"));
        type(By.id("account"),ExistedData.account );
        dropdownSelectElement_withoutCheckingClickableElement(ExistedData.account, By.xpath("//ul[@id='account_listbox']//li"));
    }

    private void selectClient(String client){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(By.id("spinner-js-header"))));

        click(By.xpath("/*//*[@id='client']"));
        type(By.xpath("/*//*[@id='client']"),client);
        dropdownSelectElement(client,By.xpath("//ul[@id='client_listbox']/li"));

    }

    private void selectJobRef(String JobRef){
        waitForElementBy_NOTvisibility(By.id("clientErrorWrapper"));
        click(By.xpath("/*//*[@aria-owns='clientFile_listbox']"));
        type(By.xpath("/*//*[@class='k-animation-container']/*//*[@class='k-textbox']"),JobRef);
        dropdownSelectElement_withoutCheckingClickableElement(JobRef, QuotationDetails_WebElements.ClientFile_dropdown_list);

    }

    private void fillBookingForm(String bookingType, String source){
        selectBookingType(bookingType);
        if (bookingType==BookingType.Private){
            selectSource(source);
        }
        if (bookingType== BookingType.Agent || bookingType==BookingType.Move_management){
            selectBooker();
        }
        if (bookingType == BookingType.Corporate || bookingType==BookingType.Corporate_competitive || bookingType==BookingType.Commercial){
            selectAccount();
            selectSource(source);
        }
    }
*/


