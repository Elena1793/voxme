package app.execution.tests.mfc;
import app.execution.configs.configMFC;
import mfc.manager.data.execution.DataProviders;
import mfc.properties.entitiesProperties.JobStatus;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;
import static mfc.manager.helper.methods.pages.methods.webElements.MainMenu_WebElements.*;

/**
 * Created by user on 13.05.2018.
 */
public class CreateFileTests implements configMFC {




 //  @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient")
  //  @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_gblinerstest")
   @Test(dataProviderClass = DataProviders.class,dataProvider = "createFileForNewClient_new")

         public void createFile (By locatorlanguage, String bookingType,String source, String jobType, String mode, String serviceType,
                                 String serviceLevel,String firstName, String lastName, String email, String phone,
                                 String country1, String country2, String city1, String city2, String street1, String street2,
                                 String zip1, String zip2){

            appMFC.getUserMenu_Metods().changeLanguage(locatorlanguage);
                Assert.assertTrue(appMFC.getUserMenu_Metods().Check_changeLanguage(locatorlanguage, MainMenu_List));
           logger.info(" method is passed: changeLanguage "+locatorlanguage);
            appMFC.getMetodsCreateFile().CreateFile_NewClient(source, jobType, mode, serviceType, serviceLevel,
                        firstName, lastName, email, phone);
       logger.info(" method is passed: CreateFile_NewClient "+source, jobType, mode, serviceType, serviceLevel,
               firstName, lastName, email, phone);
                /*Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.Mode_field),mode,"Mode_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.JobType_field),jobType,"JobType_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ServiceType_field),serviceType,"ServiceType_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ServiceLevel_field),serviceLevel,"ServiceLevel_field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.Shipper_Field_FromSection),firstName+" "+lastName,"Shipper_Field: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ShipperEmail_DetailsSection),email,"ShipperEmail: ");
                Assert.assertEquals(appMFC.getMetodsCreateFile().getExistText(JobSummary_WebElements.ShipperMobilePhone_DetailsSection),phone,"ShipperHomePhone: ");
              */ // appMFC.getAddressDetails_Metods().waitForElementByNOTvisibility(By.xpath("//[@class=\"popup-wrapper properties-wrapper\"]"));

       appMFC.getAddressForm_Metods().createNewAddtess("from",country1, city1, street1, zip1);
       logger.info(" method is passed: createNewAddtess for From section ");
     //  appMFC.getJobSummary_Metods().fillTextArea_FromNote();
     //  appMFC.getJobSummary_Metods().fillTextArea_ToNote();
       //appMFC.getJobSummary_Metods().fillTextArea_Note();

    //   appMFC.getJobSummary_Metods().type(By.xpath("//input[@aria-owns='agentTo_listbox']"),"Lena_Agent");
    //   appMFC.getJobSummary_Metods().click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
       appMFC.Quotation_metods().ckick_generateReport();
       logger.info(" method is passed: generateReport ");
       appMFC.Quotation_metods().markCheckboxinDocumentSection();
       logger.info(" method is passed: markCheckboxinDocumentSection ");
       appMFC.Quotation_metods().click_ShareButton();
       logger.info(" method is passed: click_ShareButton ");
       appMFC.Quotation_metods().click_Share_Email();
       logger.info(" method is passed: click_Share_Email ");
       appMFC.Quotation_metods().click_contactTo_SendEmail();
       logger.info(" method is passed: click_contactTo_SendEmail ");
       appMFC.Quotation_metods().select_contactTo_SendEmail("Shipper");
       logger.info(" method is passed: select_contactTo_SendEmail(\"Shipper\")");
       appMFC.Quotation_metods().click_sendTemplate_SendEmail();
       logger.info(" method is passed: click_sendTemplate_SendEmail ");
       appMFC.getJobSummary_Metods().select_sendTemplate_SendEmail();
       logger.info(" method is passed: select_sendTemplate_SendEmail() ");
       appMFC.Quotation_metods().click_OK_SendEmail();
       logger.info(" method is passed: click_OK_SendEmail() ");
       appMFC.getJobSummary_Metods().waitForElementByLeavingDOM(By.xpath("//div[@id='contactTo-list']"));
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }


       appMFC.getJobSummary_Metods().click
               (By.xpath("/html[1]/body[1]/div[74]/div[2]/div[3]/div[1]/div[1]/div[6]/button[1]"));

       logger.info(" method is passed: click_sendButton on the Send popup ");
       appMFC.Quotation_metods().click_emailSuccessSendClose();
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       logger.info(" method is passed: click_emailSuccessSendClose() ");
       // appMFC.getJobSummary_Metods().click(By.xpath("/[@class='task__panel__control-generate']"));
                appMFC.getJobSummary_Metods().click(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]"));
       logger.info(" method is passed: click_generateTasks() ");
                appMFC.getJobSummary_Metods().click_createNewTask();
       logger.info(" method is passed: click_createNewTask() ");
                appMFC.getJobSummary_Metods().typeTask_title("TaskTitle");
                appMFC.getJobSummary_Metods().typeTask_description("TaskDescription");
                appMFC.getJobSummary_Metods().typeTask_nextStep("TaskNextStep");
                appMFC.getJobSummary_Metods().click(By.xpath("//*[@aria-owns='createOwnedBy_listbox']"));
                appMFC.getJobSummary_Metods().click(By.xpath("//ul[@id='createOwnedBy_listbox']/li[contains(text(), 'Serge Corbet')]"));
                appMFC.getJobSummary_Metods().clickOn_SaveTaskButton();



       JobStatus jobs = new JobStatus(locatorlanguage);
       String status=jobs.SurveySet;
       appMFC.getJobSummary_Metods().setStatus(status);
       logger.info(" method is passed: setJobStatus() "+status);
       appMFC.getJobSummary_Metods().clickOn_openCalendar();
       logger.info(" method is passed: clickOn_openCalendar() ");
       appMFC.getJobSummary_Metods().clickOn_currentDate();
       logger.info(" method is passed: clickOn_currentDate()");
       appMFC.getJobSummary_Metods().click(By.xpath("//div[@data-bind=\"click: openShipmentInfo\"]"));
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       logger.info(" method is passed: click: openShipmentInfo");
       String surveyDate=appMFC.getJobSummary_Metods().getAtributExistText(By.xpath("//*[@id='statusDateEnum.StatusDate.SurveyDate']"));
       System.out.println("surveyDate="+surveyDate);
       String SurveySetDate=appMFC.getJobSummary_Metods().getAtributExistText(By.xpath("//*[@id='statusDate']"));
       System.out.println("SurveySetDate"+SurveySetDate);
      // Assert.assertEquals(surveyDate,SurveySetDate);
       appMFC.getJobSummary_Metods().click(By.xpath("//span[@data-bind=\"click: closeShipmentInfo\"]"));
       logger.info(" method is passed: click: closeShipmentInfo");
       appMFC.getJobSummary_Metods().moveToElementAndClick(By.xpath("//*[@class='menu-client-file']//..//*[@class='client-file-menu-footer content-right']/a[@href='/Job/Grid']"));
        /*Point point=  ((Locatable)appMFC.wd.findElement(By.xpath("/*//*[@class=\"k-widget k-window\"]/*//*[@id=\"emailEditorWindow\"]/*//*[@class=\"popup__footer\"]/*//*[@id=\"sendSubmit\"]"))).getCoordinates().inViewPort();
System.out.println(point);
int x=point.getX();
int y=point.getY();
Actions actions=new Actions(appMFC.wd);

*/
       logger.info(" method is passed: click: /Job/Grid");

         }




    }



