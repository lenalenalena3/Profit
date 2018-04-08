package stepDefinition;

import cucumber.api.java.ru.*;
import static junit.framework.TestCase.assertEquals;
import org.openqa.selenium.WebDriver;
import static stepDefinition.DepSave.*;


public class Step {
    static WebDriver webdr;

    @Дано("^открыт браузер и осуществлен переход по ссылке$")
    public void openBrowser() throws Throwable {
        webdr = getDriver();
        webdr.get("http://www.sberbank.ru/");
    }

    @Когда("^пользователь открывает раздел \"([^\"]*)\"$")
    public void openCharter(String par) throws Throwable {
        Thread.sleep(1000);
        selectMenuCharter(par, webdr);
    }

    @И("^пользователь открывает меню \"([^\"]*)\"$")
    public void openMenu(String menu) throws Throwable {
        selectMenu(menu,webdr);
    }

    @И("^пользователь устанавливает валюту \"([^\"]*)\"$")
    public void setCurrency(String val) throws Throwable {
        setupVal(val, webdr);
    }

    @И("^пользователь устанавливает срок вклада \"([^\"]*)\"$")
    public void setDays(String days) throws Throwable {
        pagePrivateClient.setupInputSrok(days,webdr);
    }

    @И("^пользователь устанавливает сумму вклада \"([^\"]*)\"$")
    public void setSum(String sum) throws Throwable {
        pagePrivateClient.setupInputSum(sum,webdr);
    }

    @И("^пользователь устанавливает параметр \"([^\"]*)\" значением \"([^\"]*)\"$")
    public void setValueRadiobox(String argument, String value) throws Throwable {
        setupRadiobox(argument,value, webdr);
    }

    @И("^нажимает кнопку Рассчитать$")
    public void clickButtonCalc() throws Throwable {
        pagePrivateClient.buttonCalcClick(webdr);
    }

    @Тогда("^параметр \"([^\"]*)\" равен \"([^\"]*)\"$")
    public void assertFactPlan(String name, String plan) throws Throwable {
        String fact=getValueGraph(name,webdr);
        assertEquals(plan,fact);
    }

    @И("^пользователь закрывает браузер$")
    public void closeBrowser() throws Throwable {
       webdr.quit();
    }
}
