package CSPRDemo.modules;

import CSPRDemo.pages.CS_LoginPage;
import CSPRDemo.supporters.Elements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CS_LoginTest extends testController{
    String env = "int";
    String email = "ec2124dcc5@yopmail.com";
    String pwd = "Test!234";
    Elements elements = new Elements();
    @Test(testName = "Verify login function with valid account")
    void CS_verifyLoginSuccess(){
        CS_LoginPage loginPage = new CS_LoginPage(driver);
        loginPage.openLoginPortal(env);
        loginPage.inputCredentials(email,pwd);
        Assert.assertTrue(driver.getCurrentUrl().contains("/home"));
        Assert.assertTrue(driver.findElement(elements.getBtnLogout()).isDisplayed());
    }
    @Test(testName = "Verify login function with invalid account")
    void CS_verifyLoginFailed(){
        CS_LoginPage loginPage = new CS_LoginPage(driver);
        loginPage.openLoginPortal(env);
        loginPage.inputCredentials(email,"test!2345");
        Assert.assertTrue(driver.getCurrentUrl().contains("/home"));
        Assert.assertTrue(driver.findElement(elements.getBtnLogout()).isDisplayed());
    }
}
