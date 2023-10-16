package mfc.manager.helper.methods.base.methods;

import mfc.manager.helper.methods.pages.methods.webElements.UserMenu_WebElements;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.Assert;


public class BasisMetods {
    protected WebDriver wd;
    static CharsetEncoder asciiEncoderHE = Charset.forName("CP862").newEncoder();
    static CharsetEncoder asciiEncoderEN = Charset.forName("US-ASCII").newEncoder();//US-ASCII
    static CharsetEncoder asciiEncoderRu = Charset.forName("CP855").newEncoder();
    static CharsetEncoder asciiEncoderPortug = Charset.forName("CP860").newEncoder();
    static CharsetEncoder asciiEncoderFR = Charset.forName("CP863").newEncoder(); ///CP863
    static CharsetEncoder asciiEncoderGermany = Charset.forName("CP865").newEncoder(); ///CP865
    static CharsetEncoder asciiEncoderSpanish = Charset.forName("CP850").newEncoder();
    static CharsetEncoder asciiEncoderGreek = Charset.forName("CP737").newEncoder();
    static CharsetEncoder asciiEncoderEN_UK = Charset.forName("US-ASCII").newEncoder();
    //static CharsetEncoder asciiEncoderItalian = Charset.forName("CP280").newEncoder();
    static CharsetEncoder asciiEncoder_Null=null;
    static CharsetEncoder asciiEncoderItalian =Charset.forName("US-ASCII").newEncoder();
    static CharsetEncoder asciiEncoderDutch =Charset.forName("US-ASCII").newEncoder();
    static CharsetEncoder asciiEncoderPolish =Charset.forName("US-ASCII").newEncoder();
    static CharsetEncoder asciiEncoderRomanian =Charset.forName("US-ASCII").newEncoder();

    public BasisMetods(WebDriver wd) {
        this.wd = wd;
    }

    public boolean isDisplayed(By locator){
        return wd.findElement(locator).isDisplayed();
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            System.out.print(locator + " - locator not found on this url");
            return false;
        }
    }
    public WebElement isElementEnabled_myWait(By locator, int waitDuration, int pollimgTime){


        Wait myWait = new FluentWait<WebDriver>(wd)
                .withTimeout(Duration.of(waitDuration, ChronoUnit.SECONDS))
                .pollingEvery(Duration.of(pollimgTime, ChronoUnit.SECONDS))
                .ignoring(NoSuchElementException.class);
        WebElement testElement = (WebElement) myWait.until(new Function<WebDriver,WebElement>() {
            public WebElement apply(WebDriver wd) {
                return wd.findElement(locator);
            }});
        return testElement;
    }

    public FluentWait myWait (int waitDuration,int pollimgTime){
        return   new FluentWait<WebDriver>(wd)
                .withTimeout(Duration.of(waitDuration, ChronoUnit.SECONDS))
                .pollingEvery(Duration.of(pollimgTime, ChronoUnit.SECONDS))
                .ignoring(NoSuchElementException.class);
    }

    public void untilToClick (By locator,int waitDuration,int pollimgTime){
        myWait(waitDuration,pollimgTime).until(new Function<WebDriver,Boolean>() {
            public Boolean apply(WebDriver wd) {
                wd.findElement(locator).click();
                return true;
            }});
    }
    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    public void openPageByUrl(String url){
        wd.get(url);
    }

    public void  isPageOpened(String page) {
        //System.out.print("Expected and actual page: "+ page+"\n");
        ///  waitForElementByNOTvisibility(By.xpath("//span[@class='spinner']"));
        ///  waitForElementByNOTvisibility(By.id("page-preloader"));

        try {

            Assert.assertTrue(page.contains(wd.getCurrentUrl()) || page.contains(wd.getTitle())|| urlContainPartOfString(page));

        } catch (AssertionError e) {
            System.out.print("Expected page: " + page + "\n" +
                    "Actual page: " + wd.getCurrentUrl() + "\n" +
                    "Actual Title:" + wd.getTitle() + "\n" +
                    "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" +

                    "The opened page does not match the required\n" +
                    "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new AssertionError();
        }
    }
    static Pattern pat;
    private boolean urlContainPartOfString(String page) {
        pat= Pattern.compile(page); // скомпилировали регулярное выражение в представление String page
        Matcher matcher=pat.matcher(wd.getCurrentUrl());//создали поисковик в тексте nt по шаблону pat
        return matcher.find();
    }

   /* public void isPageOpened(String page) {
        //System.out.print("Expected and actual page: "+ page+"\n");
        try {
            Assert.assertTrue(page.contains(wd.getCurrentUrl()));

        } catch (AssertionError e) {
            System.out.print("Expected page: " + page + "\n" +
                    "Actual page: " + wd.getCurrentUrl() + "\n" +
                    "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" +
                    "The opened page does not match the required\n" +
                    "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new AssertionError();
        }
    }*/
    //сравнивает текущий адрес открытой страницы с требуемым, т.е. получаемый в параметрах метода (та ли страница открылась)
    // и Assert.assertTrue дает True- зеленый свет для продолжения теста если адреса совпадают, в противном случае Fail


    public void waitForElementByNOTvisibility(By locator) {
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions
                        .invisibilityOfElementLocated(locator));
    }
    /*Для событий как, например, исчезновение элемента из DOM или смены свойств элемента используются Явные ожидания.
    Явные ожидания выполняются единожды, ожидая возникновения определенных условий в течение указанного периода времени.
    Для организации явных ожиданий Selenium предоставляет класс WebDriverWait и интерфейс ExpectedCondition.
    По умолчанию WebDriverWait вызывает ExpectedCondition каждые 500 миллисекунд до тех пор, пока условие не будет удовлетворено.
    В данном случае ExpectedConditions, испольхует слкдующее условия ожидания invisibilityOfElementLocated
    То есть дожидается исчезновения элемента с помощью ожидания invisibilityOfElementLocated.
    invisibilityOfElementLocated(By locator) — вернёт управление, как только элемент либо станет невидимым, либо полностью исчезнет из DOM.*/




    public void waitForElementByVisibility(By locator) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(locator));
    }

    public void waitForElementByClickable_WebElement(WebElement element) {
        //waitForElementByNOTvisibility(By.id("page-preloader"));
        (new WebDriverWait(wd, 300))
                .ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable((element))); // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }

    public void waitForElementByClickable_Locator(By locator) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.elementToBeClickable((locator))); // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }

    public void waitForElementByLeavingDOM (By locator){

        WebDriverWait webDriverWait = new WebDriverWait(wd, 300);
        //Boolean until = (new WebDriverWait(wd, 300))
             //   .until(ExpectedConditions.stalenessOf(wd.findElement(locator)));//ожидание пока элемент исчезнет из DOM
    }

    /* public void waitForElementByPresentInDOM (By locator){
         (new WebDriverWait(wd, 300))
                 .until(ExpectedConditions.presenceOfElementLocated(wd.findElement(locator))); //ожидание пока элемент появится в DOM
     }*/
    public void waitForElementByPresentInDOM (By locator){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.presenceOfElementLocated(locator)); //ожидание пока элемент появится в DOM
    }

    public void waitUntilIsLoadedCustomTime(WebElement element, int time) {
        try {
            new WebDriverWait(wd, time).until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void waitUntilIsLoadedCustomTime_locator(By element, int time) {

        try {
            new WebDriverWait(wd, time).until(ExpectedConditions.visibilityOf(wd.findElement(element)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String loadPage() {

        return wd.getCurrentUrl();
    }

    public void OpenPage(By locator, String page)  {
        /*waitForElementByVisibility(By.xpath("/*//*[@*='k-loading-mask']"));
        waitForElementByLeavingDOM(By.xpath("/*//*[@*='k-loading-mask']"));*/
        waitForElementByNOTvisibility(By.id("page-preloader"));

        // waitForElementByLeavingDOM(By.xpath("//*[@class='k-loading-mask']"));
        //*[@*='k-loading-mask']
        click_new(locator);
        //waitForElementByLeavingDOM(By.xpath("//*[@*='k-loading-mask']"));

        isPageOpened(page);
    }

    public void allElemetsInvisibility(By locator){
        //List<WebElement> list=wd.findElements(locator);
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.invisibilityOfAllElements(wd.findElements(locator)));

    }

    public void OpenPageByUrl(String page){
        wd.get(page);
    }

    public void OpenPage(By locator)  {

        waitForElementByNOTvisibility(By.id("page-preloader"));

        click(locator);
        // waitForElementByVisibility(By.xpath("//*[@*='k-loading-mask']"));
        //  waitForElementByLeavingDOM(By.xpath("//*[@*='k-loading-mask']"));

    }
    /*public void click(By locator)  {
    try{
        waitForElementByNOTvisibility(By.id("page-preloader"));
        wd.findElement(locator).click();
    }catch (Exception e){
        try {
            Thread.sleep(300);
            throw new Exception("unable to click " + e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    }*/

    public void click_17_03_2022(By locator) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        try {
            (new WebDriverWait(wd, 300))
                    .ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
            wd.findElement(locator).click();
        } catch (Throwable e) {
            moveToElementAndClick(locator);

        }
    }
    public void click(By locator) {
        //  waitForElementByNOTvisibility(By.id("page-preloader"));
        try {
            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            wd.findElement(locator).click();

        } catch (Throwable e) {
            try {
                Thread.sleep(1000);
                (new WebDriverWait(wd, 30))
                        .ignoring(StaleElementReferenceException.class)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
                wd.findElement(locator).click();

            } catch (Exception e1) {
                System.out.println(locator+" not found "+e1.getMessage());

            }
                System.out.println(e.getMessage());
        }

    }
    public void click_(By locaror) {
        WebElement element=wd.findElement(locaror);
        WebDriverWait wait = new WebDriverWait(wd, 300);
        ExpectedCondition<Boolean> elementIsClickable = arg0 -> {
            try {
                element.click();
                return true;
            } catch (Exception e) {
                return false;
            }
        };
        wait.until(elementIsClickable);
    }

    public void click_new(By locaror) {
        WebElement element=wd.findElement(locaror);
        WebDriverWait wait = new WebDriverWait(wd, 300);
        ExpectedCondition<Boolean> elementIsClickable = arg0 -> {
            try {
                Actions actions=new Actions(wd);
                actions.moveToElement(element).perform();
                element.click();
                return true;
            } catch (Exception e) {
                return false;
            }
        };
        wait.until(elementIsClickable);
    }
    public void click1309(By locator) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        //  allElemetsInvisibility(By.xpath("//*[@class='k-loading-image']"));
        try {
           /* (new WebDriverWait(wd, 3000))
                    .ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));*/
            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            wd.findElement(locator).click();

        } catch (Throwable e) {

            System.out.println(locator+" not found");

        }

    }




    public void click0308(By locator) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        try {
            (new WebDriverWait(wd, 300,300))
                    .ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(locator));
            (new WebDriverWait(wd, 300,300))
                    .ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
            (new WebDriverWait(wd, 300,300))
                    .ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
            wd.findElement(locator).click();
        } catch (Throwable e) {
            System.out.println(locator+" not found");

        }

    }
    public void click2505_1(By locator) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        try {
            waitForElementByVisibility(locator);
            (new WebDriverWait(wd, 300))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            wd.findElement(locator).click();

        } catch (Throwable e) {
            try {

                Thread.sleep(100);
                wd.findElement(locator).click();

            } catch (InterruptedException e1) {
                e1.printStackTrace();

            }

        }

    }

    /*public void click(By locator) {
        while (true) {
            try {
                waitForElementByNOTvisibility(By.id("page-preloader"));
                (new WebDriverWait(wd, 100))
                        .until(ExpectedConditions.elementToBeClickable(locator));
                wd.findElement(locator).click();
                break;
            } catch (Throwable e) {
                try {
                    Thread.sleep(300);
                    wd.findElement(locator).click();
                    break;
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                    break;
                }

            }
        }
    }*/

    public void clear(By locator){
        wd.findElement(locator).clear();
    }



    public void type1(By locator, String text)  {

        click(locator);

        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            System.out.println(existingText);
            if (!text.equals(existingText)) {
                Actions actionList = new Actions(wd);
                actionList.doubleClick(wd.findElement(locator)).sendKeys(text).build().perform();

            }
        }
    }

    public void type(By locator, String text)  {
        waitForElementByVisibility(locator);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(locator);
        String existingText = getExistText(locator);
        // System.out.println("existing"+existingText);
        // System.out.println("entering"+text);
        if (text != null&&!(text.equalsIgnoreCase(existingText)) ){
            // System.out.println(existingText);
            Actions actionList = new Actions(wd);
            actionList.doubleClick(wd.findElement(locator)).sendKeys(text).build().perform();

        }

    }

    public void dubleClick(By locator)  {

        Actions actionList = new Actions(wd);
        actionList.doubleClick(wd.findElement(locator)).build().perform();

    }
    public void moveToElementAndClick(By locator){
        // try {
           /* new WebDriverWait(wd, 60).until(ExpectedConditions.presenceOfElementLocated(locator));
            String javaScript = "var evObj=document.createEvent('MouseEvents');" +
                    "evObj.initMouseEvent(\"mouseover\",true,false,window,0,0,0,0,0,false,false,false,false,0,null);" +
                    "argument[0].dispatchEvent(evObj);";
            ((JavascriptExecutor) wd).executeScript(javaScript, wd.findElement(locator));*/
        //  }catch (Exception e){
        // new WebDriverWait(wd, 60).until(ExpectedConditions.visibilityOfElementLocated(locator));
        //WebElement element=wd.findElement(locator);
        //Dimension size=element.getSize();
        Actions actionMove=new Actions(wd);
        actionMove.moveToElement(wd.findElement(locator)).click().build().perform();
        //actionMove.clickAndHold(wd.findElement(locator)).build().perform();
        // actionMove.moveToElement(wd.findElement(locator),(wd.findElement(locator)).getSize().getWidth()-1,
        //     (wd.findElement(locator)).getSize().getHeight()-1 ).click().build().perform();
        //    }

    }




    public void enter(By locator){
        wd.findElement(locator).sendKeys(Keys.ENTER);
    }


    public WebElement  findElement (By locator){
        return wd.findElement(locator);
    }

    public void attachFileByPath(By locator, File path){
        findElement(locator).sendKeys(path.getAbsolutePath());
    }

    public String getTitle() {
        return wd.getTitle();
    }

    public void goBackBrowserButton() {
        wd.navigate().back();
    }

    public void goForwardBrowserButton() {
        wd.navigate().forward();
    }

    public void updatePage() {
        wd.navigate().refresh();
    }

    public String getExistText (By locator){
        //return wd.findElement(locator).getAttribute("value");
        String text = wd.findElement(locator).getText();
        if (text.equalsIgnoreCase("")){text = getAtributExistText(locator);}
        return text;

    }
    public String getAtributExistText (By locator){
        return wd.findElement(locator).getAttribute("innerHTML");//поиск скрытого атрибута
    }

    public String getAtributExistTextByTitle (By locator){
        return wd.findElement(locator).getAttribute("title");//поиск скрытого атрибута
    }
    public String getAtributExistTextByAnyAtribut (By locator,String atribut){
        return wd.findElement(locator).getAttribute(atribut);//поиск скрытого атрибута
    }
   /* public CharsetEncoder actual_asciiEncoder(By locatorLanguage, String stringForCheckLanguage) {
        if(locatorLanguage.equals(English_language)){
            if(expected_asciiEncoder(locatorLanguage).canEncode(stringForCheckLanguage)){
                return expected_asciiEncoder(locatorLanguage);
            }return asciiEncoderHE;
        }
        if (locatorLanguage.equals(English_UK_language)){
            if(expected_asciiEncoder(locatorLanguage).canEncode(stringForCheckLanguage)){
                return expected_asciiEncoder(locatorLanguage);
            }return asciiEncoderHE;
        }
        if(!asciiEncoderEN.canEncode(stringForCheckLanguage) && expected_asciiEncoder(locatorLanguage).canEncode(stringForCheckLanguage)){
            return expected_asciiEncoder(locatorLanguage);
        }


          else  return asciiEncoderHE;
    }*/

    public boolean CheckLanguage(String stringForCheck, By locatorLanguage) {
        if(locatorLanguage.equals(UserMenu_WebElements.English_language))
            return (expected_asciiEncoder(locatorLanguage).canEncode(stringForCheck));
        if (locatorLanguage.equals(UserMenu_WebElements.English_UK_language))
            return  (expected_asciiEncoder(locatorLanguage).canEncode(stringForCheck));
        if (locatorLanguage.equals(UserMenu_WebElements.Italian_Language)||locatorLanguage.equals(UserMenu_WebElements.Dutch_Language)||
                locatorLanguage.equals(UserMenu_WebElements.Polish_Language)|| locatorLanguage.equals(UserMenu_WebElements.Romanian_Language))
            return  (expected_asciiEncoder(locatorLanguage).canEncode(stringForCheck));
        return ((!asciiEncoderEN.canEncode(stringForCheck) && expected_asciiEncoder(locatorLanguage).canEncode(stringForCheck)));

    }

    public CharsetEncoder expected_asciiEncoder(By locatorLanguage){
        if (locatorLanguage.equals(UserMenu_WebElements.English_language)) return  asciiEncoderEN;
        if (locatorLanguage.equals(UserMenu_WebElements.Russian_language)) return asciiEncoderRu;
        if (locatorLanguage.equals(UserMenu_WebElements.Spanish_language)) return  asciiEncoderSpanish;
        if (locatorLanguage.equals(UserMenu_WebElements.Portugal_language)) return  asciiEncoderPortug;
        if (locatorLanguage.equals(UserMenu_WebElements.Franch_language)) return  asciiEncoderFR;
        if (locatorLanguage.equals(UserMenu_WebElements.German_language)) return  asciiEncoderGermany;
        if (locatorLanguage.equals(UserMenu_WebElements.Greek_language)) return  asciiEncoderGreek;
        if (locatorLanguage.equals(UserMenu_WebElements.English_UK_language)) return  asciiEncoderEN_UK;
        if (locatorLanguage.equals(UserMenu_WebElements.Italian_Language)) return asciiEncoderItalian;
        if (locatorLanguage.equals(UserMenu_WebElements.Dutch_Language)) return asciiEncoderDutch;
        if (locatorLanguage.equals(UserMenu_WebElements.Polish_Language)) return asciiEncoderPolish;
        if (locatorLanguage.equals(UserMenu_WebElements.Romanian_Language)) return asciiEncoderRomanian;
        else return asciiEncoderHE;
    }

    public List getList_byLocator (By locator){
        List<WebElement> webElementList = wd.findElements(locator);
        return webElementList;
    }

    public void ClickElementOnListByPoint(By locatorList, By elementOnList){
        //int size = getList_byLocator(locatorList).size();
        List<WebElement> langList = getList_byLocator(locatorList);

        for (int i=0;i<langList.size();i++) {

            if(langList.get(i).getLocation().equals(wd.findElement(elementOnList).getLocation())){
                langList.get(i).click();
            }
        }
    }

    public String getTagName(By locator){

        return wd.findElement(locator).getTagName();

    }

    public void dropdownSelectElement_withoutCheckingClickableElement(String element, By dropdownName) {

        List <WebElement> dropdown = getList_byLocator(dropdownName);
        for (int i = 0; i < dropdown.size(); i++) {
            System.out.println(dropdown.get(i).getText());
            if (dropdown.get(i).getText().equalsIgnoreCase(element)) {
                dropdown.get(i).click();
                break;
            }
        }
    }

    public String concatListToString (By locatorList){
        int size = getList_byLocator(locatorList).size();
        List<WebElement> langList = getList_byLocator(locatorList);;

        String string = langList.get(0).getText();
        for (int i=1;i<size;i++) {
            string = string.concat(langList.get(i).getText());
        }
        System.out.println(string);
        return string;
    }

    public void sleep (){

    }


    public void dropdownSelectElement(String element, By dropdownName) {
        waitForElementByNOTvisibility(By.id("page-preloader"));
        List<WebElement> dropdown = getList_byLocator(dropdownName);
        for (int i = 0; i < dropdown.size(); i++) {
            waitForElementByClickable_WebElement(dropdown.get(i));
            System.out.println(dropdown.get(i).getText());
            if (dropdown.get(i).getText().equalsIgnoreCase(element)) {
                dropdown.get(i).click();
                break;
            }
        }
    }

    public void dropdownSelectElement1(String element, By dropdownName)
    {
        //пример использования: например выбрать из дропдауна элемент 'Privado', который получаю в метод как String element
        // полный локатор By.xpath("//ul[@id='bookingType_listbox']/li[contains(text(),'Privado')]")
        //локатор этого дропдауна By.xpath("//ul[@id='bookingType_listbox']/li") который передаю в метод как By dropdownName
        // разбиваю на элементы масива с помощью .toString().split(":") переменную By.xpath("//ul[@id='bookingType_listbox']/li")
        // чтобы вытащить только локатор //ul[@id='bookingType_listbox']/li
        //затем составляю стринг из "//ul[@id='bookingType_listbox']/li"+"[contains(text(),'"+element+"')]"
        // и получаю By.xpath("//ul[@id='bookingType_listbox']/li[contains(text(),'Privado')]")
        waitForElementByNOTvisibility(By.id("page-preloader"));
        System.out.println(dropdownName);
        System.out.println(element);
        String [] s =dropdownName.toString().split(":");
        String fullLocatorOfDrobfownElement = s[1]+"[contains(text(),'"+element+"')]";
        // waitForElementByClickable_Locator(By.xpath(fullLocatorOfDrobfownElement));
        System.out.println(fullLocatorOfDrobfownElement);
        click(By.xpath(fullLocatorOfDrobfownElement));


    }
    public void dropdownSelectElement_17_03_2022(String element, By dropdownName)
    {
        //пример использования: например выбрать из дропдауна элемент 'Privado', который получаю в метод как String element
        // полный локатор By.xpath("//ul[@id='bookingType_listbox']/li[contains(text(),'Privado')]")
        //локатор этого дропдауна By.xpath("//ul[@id='bookingType_listbox']/li") который передаю в метод как By dropdownName
        // разбиваю на элементы масива с помощью .toString().split(":") переменную By.xpath("//ul[@id='bookingType_listbox']/li")
        // чтобы вытащить только локатор //ul[@id='bookingType_listbox']/li
        //затем составляю стринг из "//ul[@id='bookingType_listbox']/li"+"[contains(text(),'"+element+"')]"
        // и получаю By.xpath("//ul[@id='bookingType_listbox']/li[contains(text(),'Privado')]")
        waitForElementByNOTvisibility(By.id("page-preloader"));
        System.out.println(dropdownName);
        System.out.println(element);
        String [] s =dropdownName.toString().split(":");
        String fullLocatorOfDrobfownElement = s[1]+"[contains(text(),'"+element+"')]";
        // waitForElementByClickable_Locator(By.xpath(fullLocatorOfDrobfownElement));
        System.out.println(fullLocatorOfDrobfownElement);
        click_17_03_2022(By.xpath(fullLocatorOfDrobfownElement));


    }

    public boolean checkDataInField(String enteredData, By locator) {

        return false;
    }

    public void checkLoadingElementBySpinner(By locator){
        (new WebDriverWait(wd, 300))
                .until(ExpectedConditions.stalenessOf(wd.findElement(locator)));
    }

}
