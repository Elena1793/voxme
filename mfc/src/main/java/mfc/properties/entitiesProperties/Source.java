package mfc.properties.entitiesProperties;

import org.openqa.selenium.By;

import static mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements.*;

public class Source {
    By language;

    public static String Google;
    public static String Mail;
    public static String Call;

    public Source(By language){

        this.language=language;
        if(language.equals(English_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Franch_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(German_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Spanish_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Russian_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Portugal_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Greek_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(English_UK_language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Italian_Language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Dutch_Language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Polish_Language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
        if(language.equals(Romanian_Language)) {
            Google = "Google";
            Mail = "Mail";
            Call = "Call";

        }
    }

}
