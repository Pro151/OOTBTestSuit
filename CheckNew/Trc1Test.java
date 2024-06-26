// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Trc1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void trc1() {
    // Test name: trc 1
    // Step # | name | target | value
    // 1 | open | /metricstream/auth/dualLogin.jsp | 
    driver.get("https://vodacomuat.a04b.metricstream.com/metricstream/auth/dualLogin.jsp");
    // 2 | setWindowSize | 1382x744 | 
    driver.manage().window().setSize(new Dimension(1382, 744));
    // 3 | click | css=.signin-duallink-item:nth-child(2) .icn | 
    driver.findElement(By.cssSelector(".signin-duallink-item:nth-child(2) .icn")).click();
    // 4 | click | id=username | 
    driver.findElement(By.id("username")).click();
    // 5 | type | id=username | SYSTEMI
    driver.findElement(By.id("username")).sendKeys("SYSTEMI");
    // 6 | click | id=passwordHolder | 
    driver.findElement(By.id("passwordHolder")).click();
    // 7 | type | id=passwordHolder | welcome*12
    driver.findElement(By.id("passwordHolder")).sendKeys("welcome*12");
    // 8 | type | id=passwordHolder | welcome*12
    driver.findElement(By.id("passwordHolder")).sendKeys("welcome*12");
    // 9 | click | id=passwordLoginBtn | 
    driver.findElement(By.id("passwordLoginBtn")).click();
    // 10 | mouseOver | css=.infoport:nth-child(1) .infoport-actions > .infoport-action-item:nth-child(1) > .infocenter-action | 
    {
      WebElement element = driver.findElement(By.cssSelector(".infoport:nth-child(1) .infoport-actions > .infoport-action-item:nth-child(1) > .infocenter-action"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 11 | mouseOver | css=.metricstream-calendar > .msi-tooltip | 
    {
      WebElement element = driver.findElement(By.cssSelector(".metricstream-calendar > .msi-tooltip"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 12 | mouseOut | css=.metricstream-calendar > .msi-tooltip | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 13 | mouseOver | css=.metricstream-calendar > .msi-tooltip | 
    {
      WebElement element = driver.findElement(By.cssSelector(".metricstream-calendar > .msi-tooltip"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 14 | click | css=.notification-icon > .icn-tools | 
    driver.findElement(By.cssSelector(".notification-icon > .icn-tools")).click();
    // 15 | click | linkText=GRC Libraries | 
    driver.findElement(By.linkText("GRC Libraries")).click();
    // 16 | click | css=#infoport-formlink-tour .link-type | 
    driver.findElement(By.cssSelector("#infoport-formlink-tour .link-type")).click();
    // 17 | click | css=#infocenter-header > .row | 
    driver.findElement(By.cssSelector("#infocenter-header > .row")).click();
    // 18 | click | id=100020 | 
    driver.findElement(By.id("100020")).click();
    // 19 | click | id=btn-FormsLink | 
    driver.findElement(By.id("btn-FormsLink")).click();
    // 20 | click | linkText=Area of Compliance | 
    driver.findElement(By.linkText("Area of Compliance")).click();
    // 21 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 22 | click | css=.col-sm-12:nth-child(1) > .mandatory | 
    driver.findElement(By.cssSelector(".col-sm-12:nth-child(1) > .mandatory")).click();
    // 23 | type | css=.col-sm-12:nth-child(1) > .mandatory | Test
    driver.findElement(By.cssSelector(".col-sm-12:nth-child(1) > .mandatory")).sendKeys("Test");
    // 24 | click | id=s2id_autogen1 | 
    driver.findElement(By.id("s2id_autogen1")).click();
    // 25 | click | css=.select2-selected > .select2-result-label | 
    driver.findElement(By.cssSelector(".select2-selected > .select2-result-label")).click();
    // 26 | click | css=.select2-results-dept-0:nth-child(3) > .select2-result-label | 
    driver.findElement(By.cssSelector(".select2-results-dept-0:nth-child(3) > .select2-result-label")).click();
    // 27 | doubleClick | css=.select2-results-dept-0:nth-child(3) > .select2-result-label | 
    {
      WebElement element = driver.findElement(By.cssSelector(".select2-results-dept-0:nth-child(3) > .select2-result-label"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 28 | click | css=.select2-results-dept-0:nth-child(4) > .select2-result-label | 
    driver.findElement(By.cssSelector(".select2-results-dept-0:nth-child(4) > .select2-result-label")).click();
    // 29 | click | css=.select2-results-dept-0:nth-child(5) > .select2-result-label | 
    driver.findElement(By.cssSelector(".select2-results-dept-0:nth-child(5) > .select2-result-label")).click();
    // 30 | click | css=.select2-results-dept-0:nth-child(6) > .select2-result-label | 
    driver.findElement(By.cssSelector(".select2-results-dept-0:nth-child(6) > .select2-result-label")).click();
    // 31 | doubleClick | css=.select2-results-dept-0:nth-child(6) > .select2-result-label | 
    {
      WebElement element = driver.findElement(By.cssSelector(".select2-results-dept-0:nth-child(6) > .select2-result-label"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    // 32 | click | css=.select2-results-dept-0:nth-child(7) > .select2-result-label | 
    driver.findElement(By.cssSelector(".select2-results-dept-0:nth-child(7) > .select2-result-label")).click();
    // 33 | mouseDown | id=select2-drop-mask | 
    {
      WebElement element = driver.findElement(By.id("select2-drop-mask"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 34 | mouseUp | css=.focusAt_section_MSAI_328 | 
    {
      WebElement element = driver.findElement(By.cssSelector(".focusAt_section_MSAI_328"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 35 | click | css=#section_MSAI_328 .form-horizontal | 
    driver.findElement(By.cssSelector("#section_MSAI_328 .form-horizontal")).click();
    // 36 | click | id=rtfDataread_DESCRIPTION | 
    driver.findElement(By.id("rtfDataread_DESCRIPTION")).click();
    // 37 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 38 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 39 | editContent | id=tinymce | test
    {
      WebElement element = driver.findElement(By.id("tinymce"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'test'}", element);
    }
    // 40 | selectFrame | relative=parent | 
    driver.switchTo().defaultContent();
    // 41 | click | css=.saveRTF | 
    driver.findElement(By.cssSelector(".saveRTF")).click();
    // 42 | mouseOver | css=.saveRTF | 
    {
      WebElement element = driver.findElement(By.cssSelector(".saveRTF"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 43 | mouseOut | css=.saveRTF | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 44 | mouseOver | id=tinymce-10-open | 
    {
      WebElement element = driver.findElement(By.id("tinymce-10-open"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 45 | mouseOut | id=tinymce-10-open | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 46 | click | css=#datetimepicker-VALID_FROM .icn | 
    driver.findElement(By.cssSelector("#datetimepicker-VALID_FROM .icn")).click();
    // 47 | mouseOver | css=#datetimepicker-VALID_FROM .icn | 
    {
      WebElement element = driver.findElement(By.cssSelector("#datetimepicker-VALID_FROM .icn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 48 | mouseOut | css=.input-group-btn:nth-child(3) .icn | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 49 | click | css=.today | 
    driver.findElement(By.cssSelector(".today")).click();
    // 50 | click | css=#datetimepicker-VALID_UNTIL .btn | 
    driver.findElement(By.cssSelector("#datetimepicker-VALID_UNTIL .btn")).click();
    // 51 | mouseOver | css=#datetimepicker-VALID_UNTIL .btn | 
    {
      WebElement element = driver.findElement(By.cssSelector("#datetimepicker-VALID_UNTIL .btn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 52 | mouseOut | css=.input-group-btn:nth-child(3) > .btn | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 53 | click | css=tr:nth-child(6) > .day:nth-child(7) | 
    driver.findElement(By.cssSelector("tr:nth-child(6) > .day:nth-child(7)")).click();
    // 54 | click | id=fg-GROUPFIELD_8 | 
    driver.findElement(By.id("fg-GROUPFIELD_8")).click();
    // 55 | click | css=.icn-plus-t | 
    driver.findElement(By.cssSelector(".icn-plus-t")).click();
    // 56 | mouseOver | css=#s2id_RESTRICT_ACCESS_TO .select2-chosen | 
    {
      WebElement element = driver.findElement(By.cssSelector("#s2id_RESTRICT_ACCESS_TO .select2-chosen"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 57 | click | css=.icon-expand-collapse | 
    driver.findElement(By.cssSelector(".icon-expand-collapse")).click();
    // 58 | click | css=.filterText | 
    driver.findElement(By.cssSelector(".filterText")).click();
    // 59 | type | css=.filterText | vidacom south africa
    driver.findElement(By.cssSelector(".filterText")).sendKeys("vidacom south africa");
    // 60 | click | css=.icn-arrow-o-right | 
    driver.findElement(By.cssSelector(".icn-arrow-o-right")).click();
    // 61 | click | css=.filterText | 
    driver.findElement(By.cssSelector(".filterText")).click();
    // 62 | click | css=.filterText | 
    driver.findElement(By.cssSelector(".filterText")).click();
    // 63 | type | css=.filterText | vodacom south africa
    driver.findElement(By.cssSelector(".filterText")).sendKeys("vodacom south africa");
    // 64 | click | css=.icn-arrow-o-right | 
    driver.findElement(By.cssSelector(".icn-arrow-o-right")).click();
    // 65 | mouseOver | css=.icn-arrow-o-right | 
    {
      WebElement element = driver.findElement(By.cssSelector(".icn-arrow-o-right"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 66 | mouseOut | css=.icn-arrow-o-right | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 67 | click | css=.nodeSelectionIcon | 
    driver.findElement(By.cssSelector(".nodeSelectionIcon")).click();
    // 68 | click | id=addTuple | 
    driver.findElement(By.id("addTuple")).click();
    // 69 | click | css=#s2id_RESTRICT_ACCESS_TO .select2-chosen | 
    driver.findElement(By.cssSelector("#s2id_RESTRICT_ACCESS_TO .select2-chosen")).click();
    // 70 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 71 | click | id=btn-submit | 
    driver.findElement(By.id("btn-submit")).click();
    // 72 | click | id=submit | 
    driver.findElement(By.id("submit")).click();
    // 73 | mouseOver | id=submit | 
    {
      WebElement element = driver.findElement(By.id("submit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 74 | mouseOut | id=submit | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 75 | mouseOver | linkText=Name | 
    {
      WebElement element = driver.findElement(By.linkText("Name"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}
