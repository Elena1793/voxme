package inv.manager.data.execution;

import mfc.manager.data.execution.DataProviders;
import mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements;
import mfc.properties.entitiesProperties.*;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProvidersInv extends DataProviders {
    static String FirstName= "AutoTestInv";
    static String date;
    public DataProvidersInv(By[] language,String date) {
        super(language, date);
        this.date=date;
    }
    public static Iterator<Object[]> createClientFileMFCnewClient(int amount){

       // String date = "28-05_1";
        List<Object[]> data = new ArrayList<Object[]>();
        while(amount>0) {
            data.add(new Object[]{UserMenu_WebElements.English_language, new BookingType(UserMenu_WebElements.English_language).Private,
                    new Source(UserMenu_WebElements.English_language).Call, new JobType(UserMenu_WebElements.English_language).Export,
                    new Mode(UserMenu_WebElements.English_language).Air_AIR, new ServiceType(UserMenu_WebElements.English_language).DTD,
                    new ServiceLevel(UserMenu_WebElements.English_language).Full_Origin_Service, FirstName+amount + date, "check", "franch@mail.com", "9797876",
                    new Country(UserMenu_WebElements.English_language).Albania,
                    new Country(UserMenu_WebElements.English_language).Bulgaria, "City1", "City2", "Street1", "Street2", "54321", "12345"});
        amount--;
        }
data.iterator().equals(data.get(1));
        return data.iterator();
    }
}
