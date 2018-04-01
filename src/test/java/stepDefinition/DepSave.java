package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DepSave {
    static WebDriver driver;
    private final static Long TIMEOUT=10L;

    public static WebDriver getDriver() {
        //	System.setProperty("webdriver.ie.driver", "C:\\ADocMilena\\Autotest\\_Lib\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
        //	WebDriver driver = new InternetExplorerDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\ADocMilena\\Autotest\\_Lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return  driver;
    }

    //выбрать раздел
    public static void selectMenuCharter (String menu, WebDriver driver) {
        WebElement menuRazdel =driver.findElement(By.xpath("(//a[@aria-label='"+menu+"'])[1]"));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(menuRazdel));
        menuRazdel.click();
    }
    //выбрать меню
    public static void selectMenu (String menu, WebDriver driver) {
        WebElement menuDepSave =driver.findElement(By.xpath("(//a[text()='"+menu+"'])[1]"));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(menuDepSave));
        menuDepSave.click();
    }
    //установить валюту
    public static void setupVal (String val, WebDriver driver) {
        WebElement element=driver.findElement(By.xpath("(//label[text()='Валюта вклада'])[1]/following-sibling::*/select"));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        Select select = new Select(element);
        select.selectByVisibleText(val);
    }
    //установить радиобаттон
    public static void setupRadiobox (String name, String value, WebDriver driver) {
        //Капитализация процентов, Досрочное закрытие вклада, Вкладчик - пенсионер
        String my_name="(//label[text()='"+name+"'])[1]";
        String name_value=my_name+"/following-sibling::*/label/span[text()='"+value+"']/ancestor::label";
        WebElement element=driver.findElement(By.xpath(name_value));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    //установить сумму вклада
    public static void setupInputSum (String input, String sum, WebDriver driver) {
        String my_sum="(//label[text()='"+input+"'])[1]/following-sibling::*/input";
        WebElement element=driver.findElement(By.xpath(my_sum));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(sum);
        element.sendKeys(Keys.TAB);
    }
    //установить срок вклада
    public static void setupInputSrok (String input, String srok, WebDriver driver) {
        String my_srok="(//label[text()='"+input+"'])[1]/following-sibling::*/input";
        WebElement element=driver.findElement(By.xpath(my_srok));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        element.clear();
        Actions builder= new Actions(driver);
        builder.click(element).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(srok).build().perform();
    }
    //нажать кнопку Рассчитать
    public static void buttonCalcClick (WebDriver driver) {
        WebElement element=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        element.click();
    }
    //получить значение поля на графике
    public static String getValueGraph (String name, WebDriver driver) {
        WebElement element=driver.findElement(By.xpath("(//div[@class='box-open-data']//p[text()='"+name+"'])[1]/span"));
        new WebDriverWait(driver,TIMEOUT).until(ExpectedConditions.visibilityOf(element));
        String valueGraph=element.getText();
        return valueGraph;
    }

}
