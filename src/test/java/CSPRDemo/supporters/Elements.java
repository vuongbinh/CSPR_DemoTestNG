package CSPRDemo.supporters;

import org.openqa.selenium.By;

public class Elements {
    By tbEmal = By.xpath("//input[@id='username']");
    By tbPassword = By.xpath("//input[@id='password']");
    By btnNext = By.xpath("//button[@id='next']");
    By IcoLoading = By.cssSelector("div.block-ui-wrapper.block-ui-main.active");
    By btnLogout = By.xpath("//div[contains(text(),'Log out')]");
    public By getIcoLoading() {
        return IcoLoading;
    }

    public By getBtnLogout() {
        return btnLogout;
    }

    public By getTbEmal() {
        return tbEmal;
    }

    public By getTbPassword() {
        return tbPassword;
    }

    public By getBtnNext() {
        return btnNext;
    }
}
