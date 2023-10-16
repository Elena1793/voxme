package inv.manager;


import inv.manager.helper.methods.base.methods.BasicMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApplicationManagerInv  {
    public boolean isPhone =false;
    public AndroidDriver driver;
    AppCapabilities appCapabilities;
    String deviceModel;
    String appBuildApk;
    BasicMethods basicMethods;
    public ApplicationManagerInv(String deviceModel, String appBuildApk) {
        this.deviceModel=deviceModel;
        this.appBuildApk=appBuildApk;
        this.appCapabilities =new AppCapabilities(deviceModel);
    }
    public void init() throws MalformedURLException {
        start(appCapabilities.getPlatformName(), appCapabilities.getDeviceName(),
                appCapabilities.getPlatformVersion(), appCapabilities.getAppPackage(),
                appCapabilities.getAppActivity(),  appCapabilities.getNoReset(),appBuildApk);

        basicMethods=new BasicMethods(driver, isPhone);
    }

    public void start(String platformName, String deviceName,
                      String platformVersion, String appPackage,
                      String appActivity, String noReset,String app) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, noReset);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        if(driver.manage().window().getSize().getWidth()>900){
            System.out.println("phone") ;
            System.out.println(driver.manage().window().getSize().getWidth()) ;
            isPhone =true;
        }else {
            System.out.println("tablet") ;
        }

    }
    public void stop() {
        driver.quit();
    }
    public BasicMethods getBasicMethods(){
        return basicMethods;
    }

}

//String app="C:\\Tools\\VoxmeInventory-v18.0_Build_730.apk";


   /* public void start() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "HGAJQ60E");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.voxme.inventory.tablet");
        capabilities.setCapability("appActivity", "com.voxme.inventory.ui.StartupActivity");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("app", "C:\\Tools\\VoxmeInventory-v18.0_Build_730.apk");
        // capabilities.setCapability("sauceLabsImageInjectionEnabled", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getSize().getHeight());
        System.out.println(driver.manage().window().getSize().getWidth());
        if(driver.manage().window().getSize().getWidth()<600){
            System.out.println("phone") ;
            System.out.println(driver.manage().window().getSize().getWidth()>600) ;
            isPhone =true;
        }else {
            System.out.println("tablet") ;
        }


    }*/

