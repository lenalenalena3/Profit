package stepDefinition;

import cucumber.api.java.ru.*;
import static junit.framework.TestCase.assertEquals;
import org.openqa.selenium.WebDriver;
import static stepDefinition.DepSave.*;
import org.apache.log4j.Logger;

public class Step {
    static WebDriver webdr;
    private static final Logger log=Logger.getLogger(Step.class);

    @Когда ("^начинается тест \"([^\"]*)\"$")
    public void stepName(String name){
        log.info("Тест: "+name);
        pagePrivateClient.messageClose(driver);
    }

    @Дано("^открыт браузер и осуществлен переход по ссылке$")
    public void stepOpenBrowser() throws Throwable {
        webdr = getDriver();
        webdr.get("http://www.sberbank.ru/");
        log.info("Открыт браузер");
    }

    @Когда("^пользователь открывает раздел \"([^\"]*)\"$")
    public void stepOpenCharter(String par) throws Throwable {
        Thread.sleep(200);
        openCharter(par, webdr);
        log.info("Выбран раздел "+par);
    }

    @И("^пользователь открывает меню \"([^\"]*)\"$")
    public void stepOpenMenu(String menu) throws Throwable {
        openMenu(menu,webdr);
        log.info("В выпадающем списке выбрано меню "+menu);
    }

    @И("^пользователь устанавливает валюту \"([^\"]*)\"$")
    public void stepSetCurrency(String val) throws Throwable {
        setCurrency(val, webdr);
        log.info("Установлена валюта "+val);
    }

    @И("^пользователь устанавливает срок вклада \"([^\"]*)\"$")
    public void stepSetDays(String days) throws Throwable {
        pagePrivateClient.setupInputSrok(days,webdr);
        log.info("Установлен срок "+days);
    }

    @И("^пользователь устанавливает сумму вклада \"([^\"]*)\"$")
    public void stepSetSum(String sum) throws Throwable {
        pagePrivateClient.setupInputSum(sum,webdr);
        log.info("Установлена сумма "+sum);
    }

    @И("^пользователь устанавливает параметр \"([^\"]*)\" значением \"([^\"]*)\"$")
    public void stepSetValueRadio(String argument, String value) throws Throwable {
        setupRadiobox(argument,value, webdr);
        log.info("Установлен радиобаттон "+argument+" со значением "+value);
    }

    @И("^нажимает кнопку \"([^\"]*)\"$")
    public void stepClickButtonCalc(String name) throws Throwable {
        buttonClick(name, webdr);
        log.info("Нажата кнопка "+name);
    }

    @Тогда("^параметр \"([^\"]*)\" равен \"([^\"]*)\"$")
    public void stepAssertFactPlan(String name, String plan) throws Throwable {
        String fact=getValueGraph(name,webdr);
        assertEquals(plan,fact);
        log.info("Сравнение: "+name+" = "+fact+", необходимое значение "+plan);
    }

    @И("^пользователь закрывает браузер$")
    public void stepCloseBrowser() throws Throwable {
       webdr.quit();
       log.info("Закрыт браузер");
    }
}
