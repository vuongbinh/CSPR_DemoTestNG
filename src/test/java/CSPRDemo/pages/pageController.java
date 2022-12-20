package CSPRDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class pageController {
    public static WebDriverWait wait;
    public static Duration duration = Duration.ofSeconds(60);
    protected WebDriver driver;

    protected pageController(WebDriver driver) {
        this.driver = driver;
    }

    protected abstract void openLoginPortal(String env);
}
