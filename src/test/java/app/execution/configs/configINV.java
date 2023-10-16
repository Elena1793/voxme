package app.execution.configs;

import inv.manager.ApplicationManagerInv;
import inv.manager.DeviceModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public interface configINV {


    String appBuild="C:\\Tools\\VoxmeInventory-v18.0_Build_730.apk";
    Logger logger = LoggerFactory.getLogger(configINV.class);


     ApplicationManagerInv appInv = new ApplicationManagerInv(DeviceModel.capabilitiesTabletLenovo,appBuild);



    @BeforeSuite
    default void setUp() throws Exception {
        appInv.init();
    }
    @BeforeMethod
    public default void logTestStart(Method m) {
        logger.info("Start test " + m.getName());
    }

    @AfterMethod
    public default void logTestStop(Method m) {
        logger.info("Stop test " + m.getName());
    }

    @AfterSuite
    public default void tearDown() {
        appInv.stop();
    }
}
