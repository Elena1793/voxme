package app.execution.configs;
import mfc.manager.ApplicationManager;
import mfc.manager.data.execution.DataProviders;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import mfc.properties.globalData.MainPageType;
import mfc.properties.globalData.Version;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;


import java.lang.reflect.Method;

import static mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements.*;

public interface configMFC {

    String TestDate="2-10-2023";
    By[] allLang={English_language,Franch_language,German_language,
            Greek_language, Portugal_language,Spanish_language,
            Russian_language,Dutch_Language,Italian_Language,
            Polish_Language,Romanian_Language};

    By [] lang={Franch_language,German_language,
            Greek_language, Portugal_language,Spanish_language,
            Russian_language};

    By[] locatorlanguage = {English_language};
    ApplicationManager appMFC = new ApplicationManager(BrowserType.CHROME
                                                      ,Version.development
                                                      ,MainPageType.Management
                                                      ,English_language
                                                      ,new DataProviders(locatorlanguage,TestDate));
    Logger logger = LoggerFactory.getLogger(configMFC.class);
    @BeforeSuite
    default void setUp() throws Exception {

        appMFC.init();
        appMFC.getLoginScreen_Metods().login("testuser4", "Testuser41");

    }
    @BeforeMethod
    public default void logTestStart(Method m) {
        logger.info("Start test ++++++++" +"m.getName() :" +m.getName());
        logger.info(Thread.currentThread().getName());
    }

    @AfterMethod
    public default void logTestStop(Method m) {
        logger.info("Stop test ++++++++" +"m.getName() :" +m.getName());
    }

    @AfterSuite
    public default void tearDown() {
        appMFC.stop();
    }
}
