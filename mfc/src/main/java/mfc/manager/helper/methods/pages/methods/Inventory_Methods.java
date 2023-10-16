package mfc.manager.helper.methods.pages.methods;
import mfc.manager.helper.methods.pages.methods.webElements.Inventory_WebElements;
import mfc.manager.helper.methods.base.methods.BasisMetods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class Inventory_Methods extends BasisMetods {

    public Inventory_Methods(WebDriver wd) {
        super(wd);
    }

    public void loadedIn(String loadUnit) {
        click(By.xpath("/*//*[@id='pieceDetails']/form[@id='pieceDetailsSection']/*//*[@aria-owns='loadedIn_listbox']"));
        dropdownSelectElement_withoutCheckingClickableElement(loadUnit,By.xpath("//ul[@id=\"loadedIn_listbox\"]/li"));
    }

    public void inputItem(String item) throws InterruptedException {
      ///  waitForElementByNOTvisibility(By.id("page-preloader"));
        ///allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

        String [] str=item.split("");
        String firstLetter=str[0].toLowerCase();
        String twoFirstLetters=firstLetter.concat(str[1].toLowerCase());

        click_new(By.xpath("//div[@id='items']//div[@class='row-flex']//input[@name='itemName_input']"));
        type(By.xpath("//div[@id='items']//div[@class='row-flex']//input[@name='itemName_input']"),twoFirstLetters);
        //dropdownSelectElement_withoutCheckingClickableElement(item,By.xpath("/html[1]/body[1]/div[23]/div[1]/div[2]/ul[1]"));
        click(By.xpath("//*[@id=\"itemName_listbox\"]/li[contains(text(),'"+item+"') ]"));
       // dropdownSelectElement_withoutCheckingClickableElement(item,By.xpath("/html[1]/body[1]/div[31]/div[1]/div[2]/ul[1]"));

       // Thread.sleep(1000);
      //  click(By.xpath("/html[1]/body[1]/div[31]/div[1]/div[2]/ul[1]/li[1]"));

        enter(By.xpath("//div[@id='items']//div[@class='row-flex']//input[@name='itemName_input']"));
    }

    public void createCommentForItem(String item,String comment) throws InterruptedException {

       // click(By.xpath("//div[@id='itemsGrid']//td[contains(text(),'"+item+"')]"));
        click(By.xpath("//*[@id=\"itemsGrid\"]//tr[@data-uid]"));

        click(By.xpath("//textarea[@id='comment']"));

        type(By.xpath("//textarea[@id='comment']"),comment);
        Thread.sleep(200);

    }

    public void addPiece(){
        waitForElementByNOTvisibility(By.id("page-preloader"));
     //   waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep((long) 2000.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click_new(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"));
      //  allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));

    }

    public String getNumbeOfPieces(){
        //  app.getJobMenu_Metods().waitForElementByNOTvisibility(By.id("page-preloader"));
        //  app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
            Thread.sleep((long) 700.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String num = getAtributExistTextByAnyAtribut(By.xpath("//input[@id='numOfPieces']"),"value");
        System.out.println(num);
        return num;
    }

    public void selectPieceByIdInPiecesGrid (String num){
        try {
            Thread.sleep((long) 200.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> dropdown = getList_byLocator(By.xpath("//div[@id='piecesGrid']//tbody/tr//td[3]"));
        for (int i = 0; i < dropdown.size(); i++) {
            System.out.println(dropdown.get(i).getText());
            if (dropdown.get(i).getText().equalsIgnoreCase(num)) {
                click(By.xpath("//div[@id='piecesGrid']//tbody//tr["+num+"]"));
                break;
            }

        }
    }
    public void deleteLastPiece(){
        try {
            Thread.sleep((long) 150.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // app.getJobMenu_Metods().allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        click(By.xpath("//button[@id='deleteLast']"));
        waitForElementByVisibility(By.xpath("//div[@class='k-overlay']"));
        click(By.xpath("//div[@id='confirmWindow']//button[@id='confirmYes']"));
        waitForElementByNOTvisibility(By.xpath("//div[@class='k-overlay']"));
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
    }

    public void deleteAllPieces(){
        String numOfPiece=getNumbeOfPieces();
        for(int i= Integer.parseInt(numOfPiece);i>0;i--){
            deleteLastPiece();
        }
    }

    public void attachPhotoForItem(String item){
        //click(By.xpath("//div[@id='itemsGrid']//td[contains(text(),'"+item+"')]"));
        click(By.xpath("//*[@id=\"itemsGrid\"]//tr[@data-uid]"));
        File attachFile = new File("src/test/resources/item.png");
        attachFileByPath(By.xpath("//input[@id='inventoryItemUpload']"),attachFile);
        try {
            Thread.sleep((long) 2500.00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOninitializeInventoryButton() {

            try {
                Thread.sleep((long) 1000.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(isDisplayed(Inventory_WebElements.initializeInventory_button)){
                click_new(Inventory_WebElements.initializeInventory_button);
            }
            try {
                Thread.sleep((long) 1500.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    public void selectAddedPieces() {

            try {
                Thread.sleep((long) 1500.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String numOfPiece=getNumbeOfPieces();
          //  waitForElementByNOTvisibility(By.xpath("//[@class=\"k-overlay\"]"));
        //waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-image']"));
            selectPieceByIdInPiecesGrid(numOfPiece);
        }

    public void selectRoomInTable_RoomConditionSection() {
        List<WebElement> list=getList_byLocator(Inventory_WebElements.roomsColuomnInTableRoomCodition);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (!list.get(i).getText().equalsIgnoreCase("0")) {
                list.get(i).click();
                break;
            }
        }

    }

    public void clickOnCreateRommCondition() {
            if(isElementPresent(Inventory_WebElements.createRoomCondition_button)){
                click(Inventory_WebElements.createRoomCondition_button);
            }
    }

    public void enterRoomNoteDetails(String noteRoomDetails) {
        allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
            click(Inventory_WebElements.note_roomDetails);
            type(Inventory_WebElements.note_roomDetails,noteRoomDetails);
        }

    public void enterConditionBeforeDescription(String conditionBeforeDescription) {
            click(Inventory_WebElements.note_conditionBefore);
            type(Inventory_WebElements.note_conditionBefore,conditionBeforeDescription);
        }
String addedRoomElementBefore=null;
    public void addRoomElementBeforeCondition() {
            click(Inventory_WebElements.elementBefore_listbox_button);
           // dropdownSelectElement(elementBeforeCondition, Inventory_WebElements.elementBefore_listbox_dropdown);
            click(Inventory_WebElements.roomElementBefore_fristElementFromDropdown);
            addedRoomElementBefore=getExistText(Inventory_WebElements.roomElementBefore_fristElementFromDropdown);

            click(Inventory_WebElements.addElementBefore_buton);
        }

    public void attachPhotoElementBefore( File attachFile) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(By.xpath("//div[@id='roomElementBeforeGrid']//td[contains(text(),'"+addedRoomElementBefore+"')]"));
        //click(By.xpath("//div[@id='roomElementBeforeGrid']//td[contains(text(),'"+elementBefore+"')]"));
            attachFileByPath(Inventory_WebElements.uploadButton_roomElementBefore,attachFile);
        }

    public void enterConditionAfterDescription(String conditionAfterDescription) {
            click(Inventory_WebElements.note_conditionAfter);
            type(Inventory_WebElements.note_conditionAfter,conditionAfterDescription);
        }

    public void attachPhotoElementAfter( File attachFile) {
            //click(By.xpath("//div[@id='roomElementAfterGrid']//td[contains(text(),'"+elementAfter+"')]"));
        click(By.xpath("//div[@id='roomElementAfterGrid']//td[contains(text(),'"+addedRoomElementBefore+"')]"));
            attachFileByPath(Inventory_WebElements.uploadButton_roomAfter,attachFile);
            try {
                Thread.sleep((long) 1500.00);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
