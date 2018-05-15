package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PagePrivateClient;
import org.apache.log4j.Logger;



public class DepSave {

    static WebDriver driver;
    private final static Long TIMEOUT=10L;
    public static PagePrivateClient pagePrivateClient;
    private static final Logger log=Logger.getLogger(DepSave.class);

    public static WebDriver getDriver() {
        //	System.setProperty("webdriver.ie.driver", "C:\\ADocMilena\\Autotest\\_Lib\\IEDriverServer_Win32_3.7.0\\IEDriverServer.exe");
        //	WebDriver driver = new InternetExplorerDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\ADocMilena\\Autotest\\_Lib\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--enable-file-cookies");
        options.addArguments("--disable-application-cache");
        WebDriver driver = new ChromeDriver(options);
        pagePrivateClient = new PagePrivateClient(driver);
        return  driver;
    }

    //выбрать раздел
    public static void openCharter (String menu, WebDriver driver) {
        WebElement element =driver.findElement(By.xpath("(//a[@aria-label='"+menu+"'])[1]"));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    //выбрать меню
    public static void openMenu (String menu, WebDriver driver) throws InterruptedException {
        WebElement element =driver.findElement(By.xpath("(//a[text()='"+menu+"'])[1]"));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        element.click();
        Thread.sleep(3000);
    }

    //установить валюту
    public static void setCurrency (String val, WebDriver driver) {
        pagePrivateClient.setupVal(val,driver);
    }

    //установить радиобаттон
    public static void setupRadiobox (String name, String value, WebDriver driver) {
        //Капитализация процентов, Досрочное закрытие вклада, Вкладчик - пенсионер
        String my_name="(//label[text()='"+name+"'])[1]";
        String name_value=my_name+"/following-sibling::*/label/span[text()='"+value+"']";
        log.info("элемент "+name_value);
        WebElement element=driver.findElement(By.xpath(name_value));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    //нажать на кнопку
    public static void buttonClick(String buttonName, WebDriver driver){
        if (buttonName.equals("Рассчитать")) {
            pagePrivateClient.buttonCalcClick(driver);
        }
    }

    //получить значение поля на графике
    public static String getValueGraph (String name, WebDriver driver) {
        WebElement element=driver.findElement(By.xpath("(//div[@class='box-open-data']//p[text()='"+name+"'])[1]/span"));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        String valueGraph=element.getText();
        return valueGraph;
    }

}
