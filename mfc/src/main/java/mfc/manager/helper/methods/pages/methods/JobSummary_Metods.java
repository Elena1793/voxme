package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.JobSummary_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.MainMenu_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.SendEmailPopup_Webelements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import mfc.properties.globalData.ScreensURL;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import java.util.List;

public class JobSummary_Metods extends BasisMetods {
    public static String addressSection_From = "From";
    public static String addressSection_To = "To";

    public JobSummary_Metods(WebDriver wd) {
        super(wd);
    }

    public String getClientFileNum() {
        String JobRefFull = getExistText(JobSummary_WebElements.JobRef_field);
        String[] JobReF = JobRefFull.split("-");
        return JobReF[0];
    }

    public String getClientFileNum1byClientName(String ClientName) {

        String JobRefFull = getJobRefNum1byClientName(ClientName);
        String[] JobReF = JobRefFull.split("-");
        return JobReF[0];
    }

    public String getJobRefNum1byClientName(String ClientName) {
        OpenPage(MainMenu_WebElements.Jobs_button, ScreensURL.Job_Grid);
       // allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
       // click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        try {
            Thread.sleep(500);
            click(By.xpath("//span[@class='k-input'][contains(text(),'10')]"));
        } catch (Exception e) {
            e.getMessage();

        }
        try {
            Thread.sleep(500);
            dropdownSelectElement("20", By.xpath("//div[@class='k-animation-container']//ul//li"));
        } catch (Exception e) {
            e.getMessage();

        }

        //div[@class='k-animation-container']//ul//li
        String JobRefFull = getExistText(By.xpath("//td[contains(text(),'" + ClientName + "')]//..//a"));//td[contains(text(),'test1558444103840 CHECK speed102')]//..//a
        return JobRefFull;
    }

    public void openJobByClientName(String client) {

    }

    public boolean CheckDataInField(By locator, String data) {
        return data.equalsIgnoreCase(getExistText(locator));
    }


    public void click_TasksGeneration() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@class='generate-task__icon']"));
    }

    public void click_createNewTask() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@class='task__panel__control-add']"));
    }

    public void typeTask_title(String taskTitle) {
        type(By.xpath("//input[@class='form__group__input k-input input-invalid']"), taskTitle);
    }

    public void typeTask_description(String taskDescription) {
        type(By.xpath("//label[@for='taskDescription']//..//*[@class='form__group__input k-input']"), taskDescription);
    }

    public void typeTask_nextStep(String taskNextStep) {
        type(By.xpath("//label[@for='taskNextStep']//..//*[@class='form__group__input k-input']"), taskNextStep);
    }

    public void clickOn_SaveTaskButton() {
        click(By.xpath("//div[@class='col col-lg-12 justify-end']//button[@class='edi button button-submit button-small k-button']"));
        /*click(By.xpath("//div[contains(text(),'New Task')]"));
        click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[9]/div[1]/button[2]"));*/
    }

    public void clickOn_QuestionnaireButton() {
        click(By.xpath("//button[contains(@data-bind,'Questionnaire')]"));
    }

    public void clickOn_EditQuestionnaireButton() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // waitForElementByLeavingDOM(By.xpath("//div[@class='k-overlay' and contains(@style,'display: none')]"));
        click(By.xpath("//button[@id='questionnaireEdit']"));
    }


    public void select_sendTemplate_SendEmail() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> dropdown = getList_byLocator(By.xpath("//ul[@id='sendTemplate_listbox']//li"));

        dropdown.get(dropdown.size() - 1).click();
    }

    public void setStatus(String status) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath("//*[@aria-owns='jobStatus_listbox']"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click(By.xpath("//*[contains(text(),'"+status+"')]/parent::li"));


    }

    public void clickOn_openCalendar() {
        click(By.xpath("//*[@aria-controls='statusDate_dateview']"));
    }

    public void clickOn_currentDate() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//td[contains(@aria-label,'Current focused date')]"));
    }

    public void fillTextArea_FromNote () {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
click(By.xpath("//textarea[@id='note-from']"));
        dubleClick(By.xpath("//textarea[@id='note-from']"));
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

    public void fillTextArea_ToNote() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
click(By.xpath("//textarea[@id='note-to']"));
        dubleClick(By.xpath("//textarea[@id='note-to']"));
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
    public void fillTextArea_Note() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dubleClick(By.xpath("//textarea[@id='note']"));
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
                "Витторе Кривелли или Витторио Кривелли (итал. " +
                "Vittore Crivelli или итал. Vittorio Crivelli, " +
                "между 1435 и 1440 годами, Венеция, Венецианская республика — " +
                "не позже апреля 1502 года, Фермо, область Марке) — ";
        type(By.xpath("//textarea[@id='textInputWindowText']"),text);
        click(By.xpath("//button[@id='textInputWindowSubmit']"));

    }
    public void click_sendSubmit_SendPopup(){
        try {
            Thread.sleep(300);
            (new WebDriverWait(wd, 300))
                    .ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.visibilityOfElementLocated(SendEmailPopup_Webelements.send_Submit_button1));
            wd.findElement(SendEmailPopup_Webelements.send_Submit_button1).click();
            System.out.println("click = try after catch - .ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator)");
        } catch (InterruptedException e) {
            System.out.println(SendEmailPopup_Webelements.send_Submit_button1+" not found");
            System.out.println(e.getMessage());
        }

    }
}
//label[contains(@for,'statusDate')]/parent::div//*[@aria-label="Open the date view"]