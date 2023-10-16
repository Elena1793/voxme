package mfc.properties.entitiesProperties;

import org.openqa.selenium.By;

import static mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements.*;

public class JobStatus {
    By language;

    public  String SurveySet;
    public  String Created;
    public String Completed;

    public JobStatus(By language) {
        this.language = language;
        if(language.equals(English_language)) {
            SurveySet="Survey Set";
            Created="Created";
            Completed="Completed";


        }
        if(language.equals(Franch_language)) {
            SurveySet="SurveySet";
            Created="Créé";
            Completed="Terminé";

        }
        if(language.equals(German_language)) {
            SurveySet="SurveySet";
            Created="Erstellt";
            Completed="Fertiggestellt";

        }
        if(language.equals(Spanish_language)) {
            SurveySet="Visita fijada";
            Created="Creado";
            Completed="Completado";

        }
        if(language.equals(Russian_language)) {
            SurveySet="Опись начата";
            Created="Опись создана";
            Completed="Завершено";
        }
        if(language.equals(Portugal_language)) {
            SurveySet="Vistoria Agendada";
            Created="Criado";
            Completed="Concluído";
        }
        if(language.equals(Greek_language)) {
            SurveySet="Survey Ορίστηκε";
            Created="Δημιουργήθηκε";
            Completed="Ολοκληρώθηκε";
        }
        if(language.equals(English_UK_language)) {
            SurveySet="Survey Set";
            Created="Created";
            Completed="Completed";
        }
        if(language.equals(Italian_Language)) {
            SurveySet="Survey Set";
            Created="Created";
            Completed="Completed";

        }
        if(language.equals(Dutch_Language)) {
            SurveySet="Survey Set";
            Created="Created";
            Completed="Completed";

        }
        if(language.equals(Polish_Language)) {
            SurveySet="Survey Set";
            Created="Created";
            Completed="Completed";

        }
        if(language.equals(Romanian_Language)) {
            SurveySet="Survey Set";
            Created="Created";
            Completed="Completed";

        }
    }

}
