import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import pageObjects.LoginPage;

abstract public class BaseTest {

    private final static String BASE_URL = "https://ok.ru/";
    private final static String LOGIN = "technopol40";
    private final static String PASS = "technopolisPassword";

    public void setUp(){
        WebDriverManager.edgedriver().setup();
        Configuration.browser = "edge";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "2560x1440";
        Configuration.headless = false;
    }

    @BeforeEach
    public void init(){
        setUp();
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.logIn(LOGIN, PASS);
    }

    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
