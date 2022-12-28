package CSPRDemo.pages;

import CSPRDemo.supporters.Elements;
import CSPRDemo.supporters.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CS_LoginPage extends pageController{
    URL link = new URL();
    Elements elements = new Elements();
    public CS_LoginPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void openLoginPortal(String env) {
        wait = new WebDriverWait(driver,duration);
        driver.get(link.getLoginPortal_INT());
        wait.until(ExpectedConditions.presenceOfElementLocated(elements.getTbEmal()));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elements.getIcoLoading()));
    }
    public void inputCredentials(String email, String pwd) {
        wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.presenceOfElementLocated(elements.getTbEmal()));
        driver.findElement(elements.getTbEmal()).sendKeys(email);
        driver.findElement(elements.getTbPassword()).sendKeys(pwd);
        driver.findElement(elements.getBtnNext()).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elements.getIcoLoading()));
    }
//    public String getVerificationCode(String email){
//
//        return null;
//    }
}
