import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import pageObjects.LoginPage;
import pageObjects.MainPage;

abstract public class BaseTestAfterLogIn {

    private final static String BASE_URL = "https://ok.ru/";
    private final static String LOGIN = "technopol40";
    private final static String PASS = "technopolisPassword";

    public static void setUp(){
        WebDriverManager.edgedriver().setup();
        Configuration.browser = "edge";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "2560x1440";
        Configuration.headless = false;
    }

    // установка браузера
    @BeforeAll
    public static void init(){
        setUp();
    }

    // вход в профиль
    @BeforeEach
    public void logInProfile(){
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.logIn(LOGIN, PASS);
    }

    // выход из профиля
    @AfterEach
    public void logOutProfile(){
        MainPage mainPage = new MainPage();
        mainPage.logOutProfile();
    }

    // закрытие браузера
    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }
}
