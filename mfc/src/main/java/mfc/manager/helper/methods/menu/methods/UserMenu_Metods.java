package mfc.manager.helper.methods.menu.methods;
import mfc.manager.helper.methods.pages.methods.webElements.MainMenu_WebElements;
import mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.EventRecodingLogger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;


public class UserMenu_Metods extends BasisMetods implements UserMenu_WebElements {



    By locator;
    public UserMenu_Metods (WebDriver wd){
        super(wd);
    }

    public UserMenu_Metods(WebDriver wd, By language) {
        super(wd);
        this.locator=language;
    }
    public void changeLanguage_byApp(){
        OpenUserMenu();
        click(Change_language);
        waitForElementByVisibility(By.xpath("//*[@class=\"language-popup\"]"));
        wd.switchTo().parentFrame().findElement(locator);
        ClickElementOnListByPoint(By.xpath("//*[@class=\"language-popup\"]"),locator);
        waitForElementByClickable_Locator(locator);
        click(locator);




    }



    public void changeLanguage(By locator){
        OpenUserMenu();
        click(Change_language);
        waitForElementByVisibility(By.id("languageWindow"));  //By.xpath("//*[@class=\"language-popup\"]")
        wd.switchTo().parentFrame().findElement(locator);
        ClickElementOnListByPoint(By.id("languageWindow"),locator);//By.xpath("//*[@class=\"language-popup\"]")
        waitForElementByClickable_Locator(locator);
        click(locator);




    }

   /* public void ChangeLanguageOnTheCVMenu(By locator){
        OpenUserMenu();
        click(Change_language);
        waitForElementByVisibility(By.xpath("/*//*[@class=\"language-popup\"]"));
        wd.switchTo().parentFrame().findElement(locator);
        ClickElementOnListByPoint(By.xpath("/*//*[@class=\"language-popup\"]"),locator);
        waitForElementByClickable_Locator(locator);
        click(locator);




    }*/

    public void Close(By language){
        OpenUserMenu();
        click(Change_language);
        waitUntilIsLoadedCustomTime(wd.findElement(language), 10);
        click(language);
        //click(Change_language);//data-user-action="change"
        //*[@class='language-popup'][@id='languagePopupClose']
       /*wd.switchTo().frame(wd.findElement(By.xpath("/*//*[@class='language-popup']")));
        waitForElementByClickable_Locator(wd.findElement(By.xpath("[@id='languagePopupClose']")));
        click(By.xpath("[@id='languagePopupClose']"));*/
        // wd.switchTo().parentFrame().findElement(locatorLanguage).click();
        //[@id='languageWindow'];

    }



    private void OpenUserMenu() {
        click(UserMenu_WebElements.UserMenu_button);
    }





    public boolean Check_changeLanguage(By language, By locatorListForCheck) {
        String checkString = concatListToString(locatorListForCheck);
        return CheckLanguage(checkString, language);

    }

    public String Check_LanguageOnMainMenu() {
        return concatListToString (MainMenu_WebElements.MainMenu_List);



    }


}
