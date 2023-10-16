package mfc.properties.entitiesProperties;

import org.openqa.selenium.By;

import static mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements.*;

public class QuotationStatus {
    By language;

    public static String QuotationApproved;
    public static String Created;
    public static String Completed;

    public QuotationStatus(By language) {
        this.language = language;
        if(language.equals(English_language)) {
            QuotationApproved="Quotation Approved";
            Created="Created";
            Completed="Completed";


        }
        if(language.equals(Franch_language)) {
            QuotationApproved="QuotationApproved";
            Created="Créé";
            Completed="Terminé";

        }
        if(language.equals(German_language)) {
            QuotationApproved="QuotationApproved";
            Created="Erstellt";
            Completed="Fertiggestellt";

        }
        if(language.equals(Spanish_language)) {
            QuotationApproved="Cotización aprobada";
            Created="Creado";
            Completed="Completado";

        }
        if(language.equals(Russian_language)) {
            QuotationApproved="Квота утверждена";
            Created="Опись создана";
            Completed="Завершено";
        }
        if(language.equals(Portugal_language)) {
            QuotationApproved="Cotação aprovada";
            Created="Criado";
            Completed="Concluído";
        }
        if(language.equals(Greek_language)) {
            QuotationApproved="Προσφορά Εγκρίθηκε";
            Created="Δημιουργήθηκε";
            Completed="Ολοκληρώθηκε";
        }
        if(language.equals(English_UK_language)) {
            QuotationApproved="Quotation Approved";
            Created="Created";
            Completed="Completed";
        }
        if(language.equals(Italian_Language)) {
            QuotationApproved="Quotation Approved";
            Created="Created";
            Completed="Completed";

        }
        if(language.equals(Dutch_Language)) {
            QuotationApproved="Quotation Approved";
            Created="Created";
            Completed="Completed";

        }
        if(language.equals(Polish_Language)) {
            QuotationApproved="Quotation Approved";
            Created="Created";
            Completed="Completed";

        }
        if(language.equals(Romanian_Language)) {
            QuotationApproved="Quotation Approved";
            Created="Created";
            Completed="Completed";

        }
    }
}
