package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Expense_Methods extends BasisMetods {

    public Expense_Methods(WebDriver wd) {
        super(wd);
    }

    public void click_QuotationRef(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        click_17_03_2022(By.xpath("//*[@class='form__group form__group-auto form__group-horizontal form__group-horizontal-auto']//a"));
    }
}
