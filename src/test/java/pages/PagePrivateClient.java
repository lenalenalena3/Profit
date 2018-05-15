package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class PagePrivateClient {
    private final static Long TIMEPAGECLIENT=10L;

    public PagePrivateClient(WebDriver driver){
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
    }

    @FindBy(how = How.XPATH, using = "(//label[text()='Валюта вклада'])[1]/following-sibling::*/select")
    private WebElement valuta;

    @FindBy(how = How.XPATH, using ="(//button[@type='submit'])[1]")
    private WebElement calc;

    @FindBy(how = How.XPATH, using ="(//label[text()='Срок вклада в днях'])[1]/following-sibling::*/input")
    private WebElement days;

    @FindBy(how = How.XPATH, using ="(//label[text()='Сумма вклада'])[1]/following-sibling::*/input")
    private WebElement summ;

    @FindBy(how = How.XPATH, using ="//a[@title='Закрыть предупреждение']")
    private WebElement cookie;


    //нажать кнопку Рассчитать
    public void buttonCalcClick (WebDriver driver) {
        calc.click();
    }

    //закрыть сообщение об куки
    public void messageClose(WebDriver driver) {
        cookie.click();
    }

    //установить валюту
    public void setupVal (String val, WebDriver driver) {
        new WebDriverWait(driver,TIMEPAGECLIENT).until(ExpectedConditions.visibilityOf(valuta));
        Select select = new Select(valuta);
        select.selectByVisibleText(val);
    }

    //установить срок вклада
    public void setupInputSrok (String srok, WebDriver driver) {
        new WebDriverWait(driver,TIMEPAGECLIENT).until(ExpectedConditions.visibilityOf(days));
        days.clear();
        Actions builder= new Actions(driver);
        builder.click(days).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(srok).build().perform();
    }

    //установить сумму вклада
    public void setupInputSum (String sum, WebDriver driver) {
        new WebDriverWait(driver,TIMEPAGECLIENT).until(ExpectedConditions.visibilityOf(summ));
        summ.clear();
        summ.sendKeys(sum);
        summ.sendKeys(Keys.TAB);
    }

}
